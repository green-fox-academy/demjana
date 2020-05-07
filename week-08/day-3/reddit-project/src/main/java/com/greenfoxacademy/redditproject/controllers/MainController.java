package com.greenfoxacademy.redditproject.controllers;

import com.greenfoxacademy.redditproject.models.Post;
import com.greenfoxacademy.redditproject.services.PostService;
import com.greenfoxacademy.redditproject.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

  private PostService postService;
  private UserService userService;

  public MainController(PostService postService, UserService userService) {
    this.postService = postService;
    this.userService = userService;
  }

  @GetMapping(value = {"", "/", "page"})
  public String getDefaultHomePage(Model model) {
    model.addAttribute("posts", postService.getPostsForHomePage());
    model.addAttribute("pageNumbers",postService.getHowManyPageDoWeNeed());
    return "home-page";
  }

  @GetMapping(value = "/page/{pageNumber}")
  public String getHomepage(Model model,@PathVariable (required = false) Integer pageNumber){
    model.addAttribute("posts", postService.getPostsWithPageNumber(pageNumber));
    model.addAttribute("pageNumbers",postService.getHowManyPageDoWeNeed());
    return "home-page";
  }

  @GetMapping(value = "/{action}/{id}")
  public String getScore(@PathVariable String action, @PathVariable long id) {
    postService.updatePostCounterField(action, id);
    return "redirect:/page";
  }

  @GetMapping("/submit")
  public String goSubmitPage(Model model) {
    model.addAttribute("newPost", new Post());
    return "submit-new-post";
  }

  @PostMapping(value = "submit")
  public String submitNewPost(@ModelAttribute Post newPost) {
    postService.addNewPostToDataBase(newPost);
    return "redirect:/page";
  }


}
