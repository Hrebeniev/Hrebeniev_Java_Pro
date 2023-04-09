import com.hillel.hrebeniev.homeworks.homework_12.listOperations.ListUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

class listOperationTest {

    @Test
    public void testCountOccurrence() {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "apple", "banana");
        String str = "apple";
        int expectedCount = 2;

        int actualCount = ListUtils.countOccurrence(list, str);

        Assertions.assertEquals(expectedCount, actualCount);
    }

    @Test
    public void testToList() {
        int[] array = {1, 2, 3};
        List<Integer> expectedList = Arrays.asList(1, 2, 3);

        List<Integer> actualList = Arrays.asList(1, 2, 3);

        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    public void testFindUnique() {
        List<Integer> list = Arrays.asList(1, 2, 2, 3, 3, 3, 4, 4, 4, 4);
        List<Integer> expectedList = Arrays.asList(1, 2, 3, 4);

        List<Integer> actualList = ListUtils.findUnique(list);

        Assertions.assertEquals(expectedList, actualList);
    }

    @Test
    public void testCalcOccurrence() {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "apple", "banana");
        Map<String, Integer> expectedMap = new HashMap<>();
        expectedMap.put("apple", 2);
        expectedMap.put("banana", 2);
        expectedMap.put("cherry", 1);

        Map<String, Integer> actualMap = ListUtils.calcOccurrence(list);

        Assertions.assertEquals(expectedMap, actualMap);
    }

    @Test
    public void testFindOccurrence() {
        List<String> list = Arrays.asList("apple", "banana", "cherry", "apple", "banana");
        List<ListUtils.Occurrence> expectedOccurrences = Arrays.asList(
                new ListUtils.Occurrence("apple", 2),
                new ListUtils.Occurrence("banana", 2),
                new ListUtils.Occurrence("cherry", 1)
        );
        Comparator<ListUtils.Occurrence> comparator = Comparator.comparing(ListUtils.Occurrence::getWord);
        Collections.sort(expectedOccurrences, comparator);


        List<ListUtils.Occurrence> actualOccurrences = ListUtils.findOccurrence(list);
        Collections.sort(actualOccurrences, comparator);

        Assertions.assertEquals(expectedOccurrences, actualOccurrences);
    }
}