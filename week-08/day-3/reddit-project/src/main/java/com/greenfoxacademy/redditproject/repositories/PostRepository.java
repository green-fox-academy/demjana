package com.greenfoxacademy.redditproject.repositories;

import com.greenfoxacademy.redditproject.models.Post;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends CrudRepository<Post, Long> {

  @Query(value = "SELECT * FROM post ORDER BY counter DESC", nativeQuery = true)
  List<Post> getAllPostWithDescendingOrder();

  @Query(value = "SELECT * FROM post ORDER BY counter DESC LIMIT 10", nativeQuery =
      true)
  List<Post> getAllPostsWithDescendingOrderWithLimitTen();

  @Query(value = "SELECT * FROM post ORDER BY counter DESC LIMIT 10 OFFSET ?1",
      nativeQuery = true)
  List<Post> getAllPostsWithDescendingOrderWithLimitTenAndSelectedOffset(Integer offset);
}
