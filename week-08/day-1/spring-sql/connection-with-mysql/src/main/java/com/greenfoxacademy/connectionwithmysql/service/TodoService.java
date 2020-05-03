package com.greenfoxacademy.connectionwithmysql.service;

import com.greenfoxacademy.connectionwithmysql.model.Assignee;
import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoService {
  TodoRepository todoRepository;
  AssigneeService assigneeService;

  @Autowired
  public TodoService(TodoRepository todoRepository, AssigneeService assigneeService) {
    this.todoRepository = todoRepository;
    this.assigneeService = assigneeService;
  }

  public Iterable<Todo> findAll() {
    return todoRepository.findAll();
  }

  public List<Todo> getActiveTodos(boolean isActive) {
    List<Todo> listOfTodos = new ArrayList<>();
    todoRepository.findAll().forEach(listOfTodos::add);
    if (isActive) {
      return listOfTodos.stream().filter(todo -> !todo.isDone()).collect(Collectors.toList());
    } else {
      return listOfTodos.stream().filter(Todo::isDone).collect(Collectors.toList());
    }
  }

  public void addNewTodo(Todo todo, Long assigneeID) {
    Assignee assignee = assigneeService.findById(assigneeID);
    todo.setAssignee(assignee);
    todoRepository.findById(todo.getId())
        .ifPresent(date -> todo.setDateOfCreation(date.getDateOfCreation()));
    List<Todo> assigneeTodos = new ArrayList<>();
    assigneeTodos.add(todo);
    assignee.setTodo(assigneeTodos);
    assigneeService.updateAssignee(assignee);
    todoRepository.save(todo);
  }

  public void deleteTodoById(long id) {
    Optional<Todo> deletedTodo = todoRepository.findById(id);
    if (deletedTodo.isPresent()) {
      todoRepository.delete(deletedTodo.get());
    }
  }

  public Todo findById(long id) {
    Todo todo = new Todo();
    Optional<Todo> selectedTodo = todoRepository.findById(id);
    if (selectedTodo.isPresent()) {
      todo = selectedTodo.get();
    }
    return todo;
  }

  public void updateTodo(Todo todo, Long selectedAssigneeID) {
    Assignee assignee = assigneeService.findById(selectedAssigneeID);
    todo.setAssignee(assignee);
    todoRepository.findById(todo.getId())
        .ifPresent(date -> todo.setDateOfCreation(date.getDateOfCreation()));
    List<Todo> assigneeTodos = new ArrayList<>();
    assigneeTodos.add(todo);
    assignee.setTodo(assigneeTodos);
    assigneeService.updateAssignee(assignee);
    todoRepository.save(todo);
  }

  public List<Todo> getSearchedTodo(String searchButton, String searchInput) {
    switch (searchButton) {
      case "search-by-title":
        return todoRepository.findAllByTitleContainsIgnoreCase(searchInput);
      case "search-by-content":
        return todoRepository.findAllByContentContainsIgnoreCase(searchInput);
      case "search-by-description":
        return todoRepository.findAllByDescriptionContainsIgnoreCase(searchInput);
      case "search-by-assignee":
        return todoRepository.findByNames(searchInput);
      case "show-all":
        return (List<Todo>) todoRepository.findAll();
    }
    return null;
  }
}

