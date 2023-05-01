import com.hillel.hrebeniev.homeworks.homework_15.FileData;
import com.hillel.hrebeniev.homeworks.homework_15.FileNavigator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Iterator;
import java.util.Set;

public class FileNavigatorTest {


    @Test
    void addFileToNewPathTest() {
        FileData file1 = new FileData("file_1.txt", 100, "homework15/out/file_1");
        FileData file2 = new FileData("file_2.txt", 200, "homework15/out/file_2");
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(file1.getPath(), file1);
        fileNavigator.add(file2.getPath(), file2);

        Assertions.assertEquals(2, fileNavigator.getFileMap().size());
        Assertions.assertTrue(fileNavigator.getFileMap().containsKey(file1.getPath()));
        Assertions.assertTrue(fileNavigator.getFileMap().containsKey(file2.getPath()));
        Assertions.assertTrue(fileNavigator.getFileMap().get(file1.getPath()).contains(file1));
        Assertions.assertTrue(fileNavigator.getFileMap().get(file2.getPath()).contains(file2));
    }

    @Test
    void addFileToExistingPathTest() {
        FileData file1 = new FileData("file_1.txt", 100, "homework15/out");
        FileData file2 = new FileData("file_2.txt", 200, "homework15/out");
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(file1.getPath(), file1);
        fileNavigator.add(file2.getPath(), file2);

        Assertions.assertSame(fileNavigator.getFileMap().get(file1.getPath()),
                fileNavigator.getFileMap().get(file2.getPath()));
        Assertions.assertEquals(1, fileNavigator.getFileMap().size());
        Assertions.assertTrue(fileNavigator.getFileMap().containsKey(file1.getPath()));
        Assertions.assertTrue(fileNavigator.getFileMap().containsKey(file2.getPath()));
        Assertions.assertTrue(fileNavigator.getFileMap().get(file1.getPath()).contains(file1));
        Assertions.assertTrue(fileNavigator.getFileMap().get(file2.getPath()).contains(file2));
    }

    @Test
    void findFilesTest() {
        FileData file1 = new FileData("file_1.txt", 100, "homework15/out");
        FileData file2 = new FileData("file_2.txt", 200, "homework15/out");
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(file1.getPath(), file1);
        fileNavigator.add(file2.getPath(), file2);

        Assertions.assertTrue(fileNavigator.find("homework15/out").contains(file1));
        Assertions.assertTrue(fileNavigator.find("homework15/out").contains(file2));
    }

    @Test
    void filterBySizeTest() {
        FileData file1 = new FileData("file_1.txt", 100, "homework15/out");
        FileData file2 = new FileData("file_2.txt", 200, "homework15/out");
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(file1.getPath(), file1);
        fileNavigator.add(file2.getPath(), file2);

        Assertions.assertTrue(fileNavigator.filterBySize("homework15/out", 100).contains(file1));
        Assertions.assertFalse(fileNavigator.filterBySize("homework15/out", 100).contains(file2));
    }

    @Test
    void removeTest() {
        FileData file1 = new FileData("file_1.txt", 100, "homework15/out");
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(file1.getPath(), file1);
        fileNavigator.remove(file1.getPath());

        Assertions.assertTrue(fileNavigator.getFileMap().isEmpty());
    }

    @Test
    void sortBySizeTest() {
        FileData file1 = new FileData("file_1.txt", 512, "homework15/out");
        FileData file2 = new FileData("file_2.txt", 256, "homework15/out");
        FileData file3 = new FileData("file_3.txt", 1024, "homework15/out");
        FileNavigator fileNavigator = new FileNavigator();
        fileNavigator.add(file1.getPath(), file1);
        fileNavigator.add(file2.getPath(), file2);
        fileNavigator.add(file3.getPath(), file3);

        Set<FileData> sortedSet = fileNavigator.sortBySize("homework15/out");

        Assertions.assertFalse(sortedSet.isEmpty());

        Iterator<FileData> iterator = sortedSet.iterator();
        Assertions.assertEquals(file2, iterator.next());
        Assertions.assertEquals(file1, iterator.next());
        Assertions.assertEquals(file3, iterator.next());
    }

}