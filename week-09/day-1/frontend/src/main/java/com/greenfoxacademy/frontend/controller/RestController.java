package com.greenfoxacademy.frontend.controller;

import com.greenfoxacademy.frontend.model.AppendA;
import com.greenfoxacademy.frontend.model.ArrayHandler;
import com.greenfoxacademy.frontend.model.CamelizerText;
import com.greenfoxacademy.frontend.model.DoUntil;
import com.greenfoxacademy.frontend.model.Doubling;
import com.greenfoxacademy.frontend.model.Error;
import com.greenfoxacademy.frontend.model.Greeter;
import com.greenfoxacademy.frontend.model.LogEntry;
import com.greenfoxacademy.frontend.model.SithText;
import com.greenfoxacademy.frontend.service.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

@org.springframework.web.bind.annotation.RestController
public class RestController {

  private LogService logService;

  @Autowired
  public RestController(LogService logService) {
    this.logService = logService;
  }

  @GetMapping("/doubling")
  public ResponseEntity<?> getDoublingNumber(@RequestParam(required = false) Integer input) {
    if (input == null) {
      return ResponseEntity.ok(new Error("Please provide an input!"));
    }
    Doubling doubling = new Doubling(input, input * 2);
    logService.addNewLogEntry(new LogEntry("/doubling", doubling));
    return ResponseEntity.ok(doubling);
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
    Greeter welcomeMessage = new Greeter(name, title);
    logService.addNewLogEntry(new LogEntry("/greeter", welcomeMessage));
    return ResponseEntity.ok(welcomeMessage);
  }

  @GetMapping("/appenda/{appendable}")
  public ResponseEntity<?> append(@PathVariable String appendable) {
    AppendA appendA = new AppendA(appendable);
    logService.addNewLogEntry(new LogEntry("/appenda/" + appendable, appendA));
    return ResponseEntity.ok(appendA);
  }

  @PostMapping("/dountil/{action}")
  public ResponseEntity<?> doUntil(@PathVariable String action, @RequestBody DoUntil doUntil) {
    if (doUntil.getUntil() == null) {
      return ResponseEntity.ok().body(new Error("Please provide a number!"));
    }
    doUntil.setResultAction(action);
    logService.addNewLogEntry(new LogEntry("/dountil/" + action, doUntil));
    return ResponseEntity.ok(doUntil);
  }

  @PostMapping("/arrays")
  public ResponseEntity<?> getResult(@RequestBody ArrayHandler arrayHandler) {
    if (arrayHandler == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide parameters!"));
    } else if (arrayHandler.getNumbers() == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide a numbers!"));
    } else if (arrayHandler.getWhat() == null) {
      return ResponseEntity.badRequest().body(new Error("Please provide what to do with numbers!"));
    }
    logService.addNewLogEntry(new LogEntry("/arrays", arrayHandler));
    return ResponseEntity.ok(arrayHandler);
  }

  @GetMapping("/log")
  public ResponseEntity<?> getAllLogEntries() {
    return ResponseEntity.ok(logService.getLog());
  }

  @PostMapping("/sith")
  public ResponseEntity<?> getSithText(@RequestBody(required = false) SithText sithText) {
    if (sithText == null || sithText.getText().isEmpty()){
      return ResponseEntity.badRequest().body(new Error("Feed me some text you have to, padawan young you are. Hmmm."));
    }
    sithText.convertToYodaSpeak();
    logService.addNewLogEntry(new LogEntry("/sith", sithText));
    return ResponseEntity.ok(sithText);
  }

  @PostMapping("/translate")
  public ResponseEntity<?> camelizer(@RequestBody(required = false)CamelizerText camelizerText) {
    if (camelizerText == null || camelizerText.getLang() == null || camelizerText.getText() == null ||
    camelizerText.getLang().isEmpty() ||camelizerText.getText().isEmpty()){
      return ResponseEntity.badRequest().body(new Error("I can't translate that!"));
    }
    camelizerText.camelize();
    logService.addNewLogEntry(new LogEntry("/translate", camelizerText));
    return ResponseEntity.ok(camelizerText);
  }
}
