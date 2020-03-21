package BlogPost;

import java.util.Date;

public class BlogPost {
  String authorName;
  String title;
  String text;
  Date publicationDate;

  public BlogPost() {

  }

  public BlogPost(String authorName, String title, String text, Date publicationDate) {
    this.authorName = authorName;
    this.title = title;
    this.text = text;
    this.publicationDate = publicationDate;
  }

  public void blogPostPrinter() {
    System.out.println(authorName + "\n" + title + "\n" + text + "\n" + publicationDate + "\n");
  }
}
