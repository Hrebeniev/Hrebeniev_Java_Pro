import com.hillel.hrebeniev.homeworks.homework_18.builder.CarBuilder;
import com.hillel.hrebeniev.homeworks.homework_18.builder.CarBuilderImplement;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BuilderTest {
    @Test
void builderTest() {
    CarBuilder carBuilder = new CarBuilderImplement();

    carBuilder
            .buildEngine("Diesel")
            .buildTransmission("Automatic")
            .buildWheels("19-inch")
            .buildColor("Black");

    Assertions.assertEquals("Diesel", carBuilder.getCar().getEngine());
    Assertions.assertEquals("Automatic", carBuilder.getCar().getTransmission());
    Assertions.assertEquals("19-inch", carBuilder.getCar().getWheels());
    Assertions.assertEquals("Black", carBuilder.getCar().getColor());

}
}