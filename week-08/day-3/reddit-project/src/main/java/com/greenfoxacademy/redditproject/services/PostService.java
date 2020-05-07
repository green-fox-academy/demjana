package com.greenfoxacademy.redditproject.services;

import com.greenfoxacademy.redditproject.models.Post;
import java.util.List;

public interface PostService {

  List<Post> getAllPostsFromDatabaseOrderByCounterDesc();

  void addNewPostToDataBase(Post post);

  void updatePostCounterField(String action, long id);

  void increaseCounterField(long id);

  void decreaseCounterField(long id);

  List<Post> getPostsForHomePage();

  List<Post> getPostsWithPageNumber(Integer pageNumber);

  List<Integer> getHowManyPageDoWeNeed();







}
