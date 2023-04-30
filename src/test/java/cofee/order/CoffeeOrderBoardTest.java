package cofee.order;

import com.hillel.hrebeniev.homeworks.homework_14.cofee.order.CoffeeOrderBoard;
import com.hillel.hrebeniev.homeworks.homework_14.cofee.order.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class CoffeeOrderBoardTest {

    @Test
    void testCoffeeOrderBoardConstructor() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();

        Assertions.assertTrue(board.getOrders().isEmpty());
    }

    @Test
    void testAdd() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        Order order = new Order(2, "Mary");
        board.add("John");
        board.add("Mary");
        board.add("Alex");

        Assertions.assertEquals(3, board.getOrders().size());
        Assertions.assertTrue(board.getOrders().contains(order));
    }

    //deliver
    @Test
    void testDeliverIsEmpty() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        board.deliver();

        Assertions.assertTrue(outContent.toString().contains("No orders in queue!"));
    }

    @Test
    void testDeliverFirstElement() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Nick");
        board.add("Mary");
        board.add("Alex");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        board.deliver();

        Assertions.assertTrue(outContent.toString().contains("Delivering order #1 for Nick"));
    }

    @Test
    void testDeliverNextElement() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Nick");
        board.add("Mary");
        board.add("Alex");

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        board.deliver();
        outContent.reset();
        System.setOut(new PrintStream(outContent));
        board.deliver();

        Assertions.assertTrue(outContent.toString().contains("Delivering order #2 for Mary"));
    }


    @Test
    void testDeliverOrderFound() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Nick");
        board.add("Mary");
        board.add("Alex");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        board.deliver(2);

        Assertions.assertTrue(outContent.toString().contains("Delivering order #2 for Mary"));
    }

    @Test
    void testDeliverOrderNotFound() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        board.deliver(2);

        Assertions.assertTrue(outContent.toString().contains("Order #2 not found!"));
    }

    @Test
    void testDraw() {
        CoffeeOrderBoard board = new CoffeeOrderBoard();
        board.add("Nick");
        board.add("Mary");
        board.add("Alex");
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        board.deliver(2);

        outContent.reset();
        System.setOut(new PrintStream(outContent));
        board.draw();

        Assertions.assertTrue(outContent.toString().contains("1 | Nick"));
        Assertions.assertTrue(outContent.toString().contains("3 | Alex"));
    }
}
