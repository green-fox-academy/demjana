package com.greenfoxacademy.frontend.repository;

import com.greenfoxacademy.frontend.model.Log;
import org.springframework.data.repository.CrudRepository;

public interface LogRepository extends CrudRepository<Log, Long> {
}
