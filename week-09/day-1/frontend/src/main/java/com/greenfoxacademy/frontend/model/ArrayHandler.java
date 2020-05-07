package com.greenfoxacademy.frontend.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayHandler {

  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private String what;

  @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
  private List<Integer> numbers;

  @JsonProperty("result")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private Integer result;

  @JsonProperty("results")
  @JsonInclude(JsonInclude.Include.NON_NULL)
  private List<Integer> results;

  public ArrayHandler(String what, List<Integer> numbers) {
    this.what = what;
    this.numbers = numbers;
    this.result = getCalculatedNumbers();
    if (this.what.equals("double")){
      this.results = getDoubledNumbers();
    }
    System.out.println(this.results);
  }

  public String getWhat() {
    return what;
  }

  public void setWhat(String what) {
    this.what = what;
  }

  public List<Integer> getNumbers() {
    return numbers;
  }

  public void setNumbers(List<Integer> numbers) {
    this.numbers = numbers;
  }

  public Integer getResult() {
    return result;
  }

  public void setResult(Integer result) {
    this.result = result;
  }

  public List<Integer> getResults() {
    return results;
  }

  public void setResults(List<Integer> results) {
    this.results = results;
  }

  private List<Integer> getDoubledNumbers() {
    return numbers.stream().map(x -> x * 2).collect(Collectors.toList());
  }

  private Integer getMultipliedNumbers() {
    return numbers.stream().reduce(1, (carry, value) -> carry * value);
  }

  private Integer getSumNumbers() {
    return numbers.stream().mapToInt(Integer::intValue).sum();
  }

  private Integer getCalculatedNumbers() {
    switch (this.what) {
      case "sum":
        return getSumNumbers();
      case "multiply":
        return getMultipliedNumbers();
      default:
        return null;
    }
  }
}
