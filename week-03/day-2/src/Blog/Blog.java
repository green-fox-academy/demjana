package Blog;

import BlogPost.BlogPost;
import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> listOfBlogPost;

  public Blog() {
    listOfBlogPost = new ArrayList<>();
  }

  public void add(BlogPost blogpost) {
    listOfBlogPost.add(blogpost);
  }

  public boolean delete(int index) {
    if (index > 0 && index < listOfBlogPost.size()) {
      listOfBlogPost.remove(index);
      return true;
    } else {
      return false;
    }
  }

  public void update(int index, BlogPost blogpost) {
    if (delete(index)) {
      listOfBlogPost.add(index, blogpost);
    }
  }

  public void edit(int index, BlogPost blogpost) {
    listOfBlogPost.set(index, blogpost);
  }

  public void blogPrinter() {
    for (int i = 0; i < listOfBlogPost.size(); i++) {
      listOfBlogPost.get(i).blogPostPrinter();
    }
  }
}

/*Reuse your BlogPost class
 Create a Blog class which can:
    - store a list of BlogPosts
    - add BlogPosts to the list
    - delete(int) one item at given index
    - update(int, BlogPost) one item at the given index and update it with another BlogPost*/
