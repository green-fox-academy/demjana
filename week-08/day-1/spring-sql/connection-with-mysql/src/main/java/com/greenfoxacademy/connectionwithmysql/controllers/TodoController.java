package com.greenfoxacademy.connectionwithmysql.controllers;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TodoController {

  private TodoService todoService;

  @Autowired
  public TodoController(TodoService todoService) {
    this.todoService = todoService;
  }

  @GetMapping(value = {"", "/", "/list"})
  public String list(Model model, @RequestParam(required = false) Boolean isActive) {
    if (isActive == null) {
      model.addAttribute("todos", todoService.findAll());
    } else {
      model.addAttribute("todos", todoService.getActiveTodos(isActive));
    }
    return "todolist";
  }

  @GetMapping(value = "/add")
  public String getAddNewTodo(Model model) {
    model.addAttribute("newTodo", new Todo());
    return "addtodo";
  }

  @PostMapping(value = "/add")
  public String addNewTodo(@ModelAttribute Todo todo) {
    todoService.addNewTodo(todo);
    return "redirect:/list";
  }

  @GetMapping(value = "/{id}/delete")
  public String deleteTodo(@PathVariable long id) {
    todoService.deleteTodoById(id);
    return "redirect:/list";
  }

  @GetMapping(value = "/{id}/edit")
  public String getEditViewTodo(@PathVariable long id, Model model) {
    model.addAttribute("selectedTodo", todoService.getTodoById(id));
    return "edittodo";
  }

  @PostMapping(value = "/edit/{id}")
  public String editTodo(@PathVariable long id, @ModelAttribute Todo editedTodo) {
    todoService.updateTodo(editedTodo);
    return "redirect:/list";
  }

  @GetMapping(value = "/{id}/details")
  public String showDetails(@PathVariable long id, Model model) {
    model.addAttribute("selectedTodo", todoService.getTodoById(id));
    return "/detailsoftodo";
  }
}