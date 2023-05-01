import com.hillel.hrebeniev.homeworks.homework_15.FileData;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FileDataTest {


    @Test
    void FileDataConstructorTest() {
        FileData file1 = new FileData("file_1.txt", 100, "homework15/out/file_1");

        Assertions.assertEquals("file_1.txt", file1.getName());
        Assertions.assertEquals(100, file1.getSize());
        Assertions.assertEquals("homework15/out/file_1", file1.getPath());
    }
}