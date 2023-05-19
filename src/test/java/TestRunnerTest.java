import com.hillel.hrebeniev.homeworks.homework_19.TestRunner;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Assertions;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TestRunnerTest {

    @SneakyThrows
    @org.junit.jupiter.api.Test
    void startTest() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        TestRunner.start(Suite1Test.class);

        Assertions.assertTrue(outContent.toString().contains("BeforeSuite"));
        Assertions.assertTrue(outContent.toString().contains("TestMethod1"));
        Assertions.assertTrue(outContent.toString().contains("TestMethod2"));
        Assertions.assertTrue(outContent.toString().contains("TestMethod3"));
        Assertions.assertTrue(outContent.toString().contains("AfterSuite"));
    }

    @org.junit.jupiter.api.Test
    void startTest_doubleBeforeSuite() {
        Assertions.assertThrows(RuntimeException.class,
                () -> TestRunner.start(Suite2Test.class));
    }
}