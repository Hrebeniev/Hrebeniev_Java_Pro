import com.hillel.hrebeniev.homeworks.homework_17.ToList;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ToListTest {
    @Test
    void toListTest() {
        String[] stringArray = {"good", "bad", "nice"};
        List<String> expectedStringList = new ArrayList<>();
        expectedStringList.add(stringArray[0]);
        expectedStringList.add(stringArray[1]);
        expectedStringList.add(stringArray[2]);

        assertEquals(expectedStringList, ToList.toList(stringArray));

        Integer[] intArray = {1, 2, 3};
        List<Integer> expectedIntList = new ArrayList<>();
        expectedIntList.add(intArray[0]);
        expectedIntList.add(intArray[1]);
        expectedIntList.add(intArray[2]);

        assertEquals(expectedIntList, ToList.toList(intArray));
    }
}