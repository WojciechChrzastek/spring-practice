package net.chrzastek.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

  @Test
  public void testTaskAdd() {
    //Given
    ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
    Board board = context.getBean(Board.class);

    //When
    board.getToDoList().tasks.add("a");
    board.getInProgressList().tasks.add("b");
    board.getDoneList().tasks.add("c");

    // Then
    Assert.assertEquals("a", board.getToDoList().getTasks().get(0));
    Assert.assertEquals("b", board.getInProgressList().getTasks().get(0));
    Assert.assertEquals("c", board.getDoneList().getTasks().get(0));
  }
}
