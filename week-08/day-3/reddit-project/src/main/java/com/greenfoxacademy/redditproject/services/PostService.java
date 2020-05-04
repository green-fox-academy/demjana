package com.greenfoxacademy.redditproject.services;

import com.greenfoxacademy.redditproject.models.Post;
import java.util.List;

public interface PostService {

  List<Post> getAllPostsFromDatabaseOrderByCounterDesc();

  void increaseCounterField(long id);

  void decreaseCounterField(long id);

  public void addNewPostToDataBase(Post post);

}
