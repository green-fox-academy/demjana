package com.greenfoxacademy.redditproject.services;

import com.greenfoxacademy.redditproject.models.User;
import com.greenfoxacademy.redditproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  private UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public void addNewUser(User newUser) {
    userRepository.save(newUser);
  }
}
