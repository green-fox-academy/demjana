package com.greenfoxacademy.connectionwithmysql;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import com.greenfoxacademy.connectionwithmysql.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ConnectionwithmysqlApplication implements CommandLineRunner {

  private TodoRepository todoRepository;

  @Autowired
  public ConnectionwithmysqlApplication(TodoRepository todoRepository) {
    this.todoRepository = todoRepository;
  }

  public static void main(String[] args) {
    SpringApplication.run(ConnectionwithmysqlApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    todoRepository.save(new Todo("Start the day", true,true));
    todoRepository.save(new Todo("Finish H2 workshop1",true,true));
    todoRepository.save(new Todo("Finish JPA workshop2",true,false));
    todoRepository.save(new Todo("Create a CRUD project",true,false));
    todoRepository.save(new Todo("I have to learn ORM", true,false));
  }
}

