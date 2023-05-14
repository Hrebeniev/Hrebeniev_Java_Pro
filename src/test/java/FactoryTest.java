import com.hillel.hrebeniev.homeworks.homework_18.factory.Bed;
import com.hillel.hrebeniev.homeworks.homework_18.factory.Chair;
import com.hillel.hrebeniev.homeworks.homework_18.factory.FurnitureImplement;
import com.hillel.hrebeniev.homeworks.homework_18.factory.Table;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FactoryTest {

    @Test
    void factoryTest() {
        FurnitureImplement factory = new FurnitureImplement();
        Assertions.assertEquals(Chair.class, factory.createFurniture("chair").getClass());
        Assertions.assertEquals(Bed.class, factory.createFurniture("bed").getClass());
        Assertions.assertEquals(Table.class, factory.createFurniture("table").getClass());
        Assertions.assertNull(factory.createFurniture("tea"));
    }
}