package com.greenfoxacademy.springstart.contorollers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

  @RequestMapping(value ="/hello")
  @ResponseBody
  public String hello() {
    return "Hello World";
  }
}
