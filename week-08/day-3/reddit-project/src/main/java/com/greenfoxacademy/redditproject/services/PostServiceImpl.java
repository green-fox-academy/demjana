package com.greenfoxacademy.redditproject.services;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.repositories.PostRepository;
import com.greenfoxacademy.redditproject.repositories.UserRepository;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl implements PostService {

  private PostRepository postRepository;
  private UserRepository userRepository;

  @Autowired
  public PostServiceImpl(PostRepository postRepository, UserRepository userRepository) {
    this.postRepository = postRepository;
    this.userRepository = userRepository;
  }

  @Override
  public List<Post> getAllPostsFromDatabaseOrderByCounterDesc() {
    return postRepository.getAllPostWithDescendingOrder();
  }

  @Override
  public void addNewPostToDataBase(Post post) {
    postRepository.save(post);
  }

  @Override
  public void updatePostCounterField(String action, long id) {
    switch (action) {
      case "+":
        increaseCounterField(id);
        break;
      case "-":
        decreaseCounterField(id);
        break;
    }
  }

  @Override
  public void increaseCounterField(long id) {
    Optional<Post> optionalPost = postRepository.findById(id);
    if (optionalPost.isPresent()) {
      Post post = optionalPost.get();
      post.setCounter(post.getCounter() + 1);
      postRepository.save(post);
    }
  }

  @Override
  public void decreaseCounterField(long id) {
    Optional<Post> optionalPost = postRepository.findById(id);
    if (optionalPost.isPresent()) {
      Post post = optionalPost.get();
      post.setCounter(post.getCounter() - 1);
      postRepository.save(post);
    }
  }

  @Override
  public List<Post> getPostsForHomePage() {
    return postRepository.getAllPostsWithDescendingOrderWithLimitTen();
  }

  @Override
  public List<Post> getPostsWithPageNumber(Integer pageNumber) {
    if (pageNumber == 1) {
      return postRepository.getAllPostsWithDescendingOrderWithLimitTen();
    } else {
      return postRepository.getAllPostsWithDescendingOrderWithLimitTenAndSelectedOffset((pageNumber - 1) * 10);
    }
  }

  @Override
  public List<Integer> getHowManyPageDoWeNeed() {
    List<Integer> pageNumbers = new ArrayList<>();
    Integer sizeOfPost = postRepository.getAllPostWithDescendingOrder().size();
    Integer pageNumber = 1;
    pageNumbers.add(pageNumber);
    for (int i = 0; i <= sizeOfPost; i++) {
      if (i % 10 == 0) {
        pageNumber++;
        pageNumbers.add(pageNumber);
      }
    }
    return pageNumbers;
  }
}