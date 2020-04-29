package com.greenfoxacademy.connectionwithmysql.service;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {

  private TodoRepository todoRepository;

  @Autowired
  public TodoService(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public Iterable<Todo> findAll() {
    return todoRepository.findAll();
  }

  public List<Todo> getActiveTodos(boolean isActive) {
    List<Todo> listOfTodos = new ArrayList<>();
    todoRepository.findAll().forEach(listOfTodos::add);
    if (isActive) {
      return listOfTodos.stream().filter(todo -> !todo.isIsDone()).collect(Collectors.toList());
    } else {
      return listOfTodos.stream().filter(Todo::isIsDone).collect(Collectors.toList());
    }
  }

  public void addNewTodo(Todo todo) {
    todo.setDateOfCreation(new Date());
    todoRepository.save(todo);
  }

  public void deleteTodoById(long id) {
    Optional<Todo> deletedTodo = todoRepository.findById(id);
    if (deletedTodo.isPresent()) {
      todoRepository.delete(deletedTodo.get());
    }
  }

  public Todo getTodoById(long id){
    Optional<Todo> selectedTodo = todoRepository.findById(id);
    if (selectedTodo.isPresent()){
      return selectedTodo.get();
    }
    return null;
  }

  public void updateTodo(Todo todo){
    todoRepository.findById(todo.getId()).ifPresent(date -> todo.setDateOfCreation(date.getDateOfCreation()));
    todoRepository.save(todo);
  }
}

