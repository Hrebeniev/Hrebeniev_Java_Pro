import com.hillel.hrebeniev.homeworks.homework_19.AfterSuite;
import com.hillel.hrebeniev.homeworks.homework_19.BeforeSuite;
import com.hillel.hrebeniev.homeworks.homework_19.Test;

public class Suite2Test {
    @BeforeSuite
    public void setup() {
        System.out.println("BeforeSuite");
    }

    @BeforeSuite
    public void setup2() {
        System.out.println("BeforeSuite");
    }

    @Test(priority = 1)
    public void testMethod1() {
        System.out.println("TestMethod1");
    }

    @Test(priority = 2)
    public void testMethod2() {
        System.out.println("TestMethod2");
    }

    @Test(priority = 3)
    public void testMethod3() {
        System.out.println("TestMethod3");
    }

    @AfterSuite
    public void cleanup() {
        System.out.println("AfterSuite");
    }
}