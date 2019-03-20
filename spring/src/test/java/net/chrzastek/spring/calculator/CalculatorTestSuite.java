package net.chrzastek.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
  @Test
  public void testLoadFromDb() {
    //Given
    ApplicationContext context =
            new AnnotationConfigApplicationContext("net.chrzastek.spring");
    Calculator calculator = (Calculator) context.getBean("calculator");
    double a = 6;
    double b = 2;

    //When
    double added = calculator.add(a, b);
    double subtracted = calculator.sub(a, b);
    double multiplied = calculator.mul(a, b);
    double divided = calculator.div(a, b);
    //Then
    Assert.assertEquals(8, added, 1);
    Assert.assertEquals(4, subtracted, 1);
    Assert.assertEquals(12, multiplied, 1);
    Assert.assertEquals(3, divided, 1);
  }
}
