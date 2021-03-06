package net.chrzastek.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class Calculator {
  @Autowired
  public Display display;

  double add(double a, double b) {
    display.displayValue(a + b);
    return a + b;
  }

  double sub(double a, double b) {
    display.displayValue(a - b);
    return a - b;
  }

  double mul(double a, double b) {
    display.displayValue(a * b);
    return a * b;
  }

  double div(double a, double b) {
    display.displayValue(a / b);
    return a / b;
  }
}
