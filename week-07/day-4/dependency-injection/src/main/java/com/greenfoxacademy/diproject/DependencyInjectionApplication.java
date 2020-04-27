package com.greenfoxacademy.diproject;

import com.greenfoxacademy.diproject.hellodiproject.service.Printer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DependencyInjectionApplication implements CommandLineRunner {

  @Autowired
  public DependencyInjectionApplication(Printer printer) {
    this.printer = printer;
  }

  Printer printer;

  public static void main(String[] args) {
    SpringApplication.run(DependencyInjectionApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
  printer.log("hello world");
  }
}
