package com.greenfoxacademy.frontend;

import com.greenfoxacademy.frontend.repository.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FrontendApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(FrontendApplication.class, args);
  }

  private LogRepository logRepository;

  @Autowired
  public FrontendApplication(LogRepository logRepository) {
    this.logRepository = logRepository;
  }

  @Override
  public void run(String... args) throws Exception {

  }
}
