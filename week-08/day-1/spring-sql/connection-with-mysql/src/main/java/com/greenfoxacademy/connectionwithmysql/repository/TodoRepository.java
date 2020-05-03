package com.greenfoxacademy.connectionwithmysql.repository;

import com.greenfoxacademy.connectionwithmysql.model.Todo;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends CrudRepository<Todo, Long> {
  List<Todo> findAllByTitleContainsIgnoreCase(String searchInput);
  List<Todo> findAllByContentContainsIgnoreCase(String searchInput);
  List<Todo> findAllByDescriptionContainsIgnoreCase(String searchInput);

  @Query("SELECT todo FROM Todo todo WHERE todo.assignee.name LIKE :name")
  List<Todo> findByNames(String name);
}
