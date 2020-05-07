package com.greenfoxacademy.redditproject.repositories;

import com.greenfoxacademy.redditproject.models.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository <User,Long> {

  @Query("SELECT u FROM User u WHERE u.active  = true")
  User getActiveUser();
}
