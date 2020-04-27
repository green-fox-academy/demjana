package com.greenfoxacademy.diproject.usefulutilities.controller;

import com.greenfoxacademy.diproject.usefulutilities.service.UtilityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UsefulUtilityController {

  @Autowired
  private UtilityService utilityService;

  public UsefulUtilityController(UtilityService utilityService) {
    this.utilityService = utilityService;
  }

  @GetMapping("/useful")
  public String goToHomePage() {
    return "useful";
  }

  @GetMapping("/useful/colored")
  public String getRandomColorBackground(Model model) {
    model.addAttribute("randomColor", utilityService.randomColor());
    return "colored";
  }

  @GetMapping("/useful/email")
  public String getEmail(Model model, @RequestParam String email) {
    model.addAttribute("emailAddress", email);
    model.addAttribute("validationResult", utilityService.isValidEmail(email));
    return "email";
  }

  @GetMapping("useful/caesar")
  public String getCaesar(Model model, @RequestParam(required = false) String text,
                                       @RequestParam(required = false) Integer number) {
    model.addAttribute("text", utilityService.caesar(text, number));
    return "caesar";
  }
}
