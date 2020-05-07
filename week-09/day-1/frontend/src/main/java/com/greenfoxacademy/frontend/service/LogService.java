package com.greenfoxacademy.frontend.service;

import com.greenfoxacademy.frontend.model.Log;
import com.greenfoxacademy.frontend.model.LogEntry;

public interface LogService {
  Log getLog();

  void addNewLogEntry(LogEntry newLog);
}
