package com.greenfoxacademy.redditproject.services;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.repositories.PostRepository;
import com.greenfoxacademy.redditproject.repositories.UserRepository;
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
  public void addNewPostToDataBase(Post post) {
    postRepository.save(post);
  }


}