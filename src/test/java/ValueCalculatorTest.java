import com.hillel.hrebeniev.homeworks.homework_21.ValueCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ValueCalculatorTest {

    @Test
    void calculateTest(){
        ValueCalculator valueCalculator = new ValueCalculator(10000000);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        valueCalculator.calculate();

        Assertions.assertTrue(outContent.toString().contains("Time elapsed = "));
    }
}