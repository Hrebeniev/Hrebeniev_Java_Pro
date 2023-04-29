import com.hillel.hrebeniev.homeworks.homework_11.ArrayUtils;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ArraysTest {

    @Test
    public void testGetElementsAfterLastFour_ReturnsExpectedArray() {
        int[] array = {2, 3, 7, 1, 9, 4, 6, 8};
        int[] expectedArray = {6, 8};
        Assertions.assertArrayEquals(expectedArray, ArrayUtils.getElementsAfterLastFour(array));
    }

    @Test
    public void testGetElementsAfterLastFour_InputArrayContainsMultipleFours() {
        int[] array = {1, 2, 4, 4, 2, 3, 4, 1, 7};
        int[] expectedArray = {1, 7};
        Assertions.assertArrayEquals(expectedArray, ArrayUtils.getElementsAfterLastFour(array));
    }

    @Test
    public void testGetElementsAfterLastFour_InputArrayContainsOneFour() {
        int[] array = {4, 3, 5, 1, 8};
        int[] expectedArray = {3, 5, 1, 8};
        Assertions.assertArrayEquals(expectedArray, ArrayUtils.getElementsAfterLastFour(array));
    }

    @Test
    public void testGetElementsAfterLastFour_InputArrayDoesNotContainFour() {
        int[] array = {1, 2, 3};
        Assertions.assertThrows(RuntimeException.class,
                () -> ArrayUtils.getElementsAfterLastFour(array));
    }




    @Test
    public void testCheckArray_containsOneAndFour() {
        int[] array = {1, 4, 1, 4};
        Assertions.assertTrue(ArrayUtils.checkArray(array));
    }

    @Test
    public void testCheckArray_containsOneAndMultipleFours() {
        int[] array = {1, 1, 4, 4, 4};
        Assertions.assertTrue(ArrayUtils.checkArray(array));
    }

    @Test
    public void testCheckArray_containsOnlyOnes() {
        int[] array = {1, 1, 1, 1, 1};
        Assertions.assertFalse(ArrayUtils.checkArray(array));
    }

    @Test
    public void testCheckArray_containsOnlyFours() {
        int[] array = {4, 4, 4, 4, 4};
        Assertions.assertFalse(ArrayUtils.checkArray(array));
    }
}