package com.greenfoxacademy.redditproject;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.repositories.PostRepository;
import com.greenfoxacademy.redditproject.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RedditprojectApplication implements CommandLineRunner {

  private PostRepository postRepository;
  private UserRepository userRepository;

  @Autowired
  public RedditprojectApplication(PostRepository postRepository, UserRepository userRepository) {
    this.postRepository = postRepository;
    this.userRepository = userRepository;
  }


  public static void main(String[] args) {
    SpringApplication.run(RedditprojectApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    postRepository.save(new Post("Facebook", "https://www.facebook.com/"));
    postRepository.save(new Post("Twitter", "https://twitter.com/explore"));
    postRepository.save(new Post("YouTube", "https://youtube.com/"));
    postRepository.save(new Post("Google", "https://google.com/"));
    postRepository.save(new Post("Instagram", "https://instagram.com/"));

  }
}
