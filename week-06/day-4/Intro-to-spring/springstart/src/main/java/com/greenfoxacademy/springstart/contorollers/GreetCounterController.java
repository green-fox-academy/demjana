package com.greenfoxacademy.springstart.contorollers;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetCounterController {

  AtomicLong counter = new AtomicLong();
  @RequestMapping(value ="/web/greeting/counter")
  public String greeting(Model model,@RequestParam String name) {
    model.addAttribute("name", name);
    model.addAttribute("counter", counter.incrementAndGet());
    return "greeting";
  }
}
