import com.hillel.hrebeniev.homeworks.homework_13.Sorter;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SorterTest {
    @Test
    public void quickSortTest1() {
        int[] arr1 = {5, 3, 7, 1, 8, 2, 6, 4};
        int[] sortedArr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertArrayEquals(sortedArr1, Sorter.quickSort(arr1));
    }
    @Test
    public void quickSortTest2() {
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] sortedArr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertArrayEquals(sortedArr2, Sorter.quickSort(arr2));
    }
    @Test
    public void quickSortTest3() {
        int[] arr3 = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] sortedArr3 = {1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertArrayEquals(sortedArr3, Sorter.quickSort(arr3));
    }

    @Test
    public void cocktailSortTest1() {
        int[] arr1 = {5, 3, 7, 1, 8, 2, 6, 4};
        int[] sortedArr1 = {1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertArrayEquals(sortedArr1, Sorter.cocktailSort(arr1));
    }
    @Test
    public void cocktailSortTest2() {
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        int[] sortedArr2 = {1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertArrayEquals(sortedArr2, Sorter.cocktailSort(arr2));
    }
    @Test
    public void cocktailSortTest3() {
        int[] arr3 = {8, 7, 6, 5, 4, 3, 2, 1};
        int[] sortedArr3 = {1, 2, 3, 4, 5, 6, 7, 8};
        Assertions.assertArrayEquals(sortedArr3, Sorter.cocktailSort(arr3));
    }
}