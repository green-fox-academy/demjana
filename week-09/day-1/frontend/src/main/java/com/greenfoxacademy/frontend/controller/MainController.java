package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.AppendA;
import com.greenfoxacademy.frontend.model.DoUntil;
import com.greenfoxacademy.frontend.model.Doubling;
import com.greenfoxacademy.frontend.model.Error;
import com.greenfoxacademy.frontend.model.Greeter;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

  @GetMapping("/")
  public String getIndex() {
    return "index";
  }

  @GetMapping("/doubling")
  public ResponseEntity<?> getDoublingNumber(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return ResponseEntity.ok(new Error("Please provide an input!"));
    }
    return ResponseEntity.ok().body(new Doubling(input, input * 2));
  }

  @GetMapping("/greeter")
  public ResponseEntity<?> greet(@RequestParam(required = false) String name,
                                 @RequestParam(required = false) String title) {
    if (name == null && title == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a name and a title!"));
    }
    if (title == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a title!"));
    }
    if (name == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a name!"));
    }
    return ResponseEntity.ok().body(new Greeter(name, title));
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> append(@PathVariable String appendable) {
    return ResponseEntity.ok().body(new AppendA(appendable));
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntil(@PathVariable String action, @RequestBody DoUntil doUntil) {
    if (doUntil.getUntil() == null) {
      return ResponseEntity.ok().body(new Error("Please provide a number!"));
    }
    doUntil.setResultAction(action);
    return ResponseEntity.ok(doUntil);
  }
}
