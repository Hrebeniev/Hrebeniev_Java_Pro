import com.hillel.hrebeniev.homeworks.homework_25.Homework;
import com.hillel.hrebeniev.homeworks.homework_25.Lesson;
import com.hillel.hrebeniev.homeworks.homework_25.LessonDao;
import lombok.SneakyThrows;
import org.junit.jupiter.api.Test;

public class LessonDaoTest {

    @Test
    @SneakyThrows
    void addTest() {
        Lesson lesson = Lesson.builder()
                .name("Test Lesson 1")
                .homework(Homework.
                        builder()
                        .id(3)
                        .build())
                .build();

        new LessonDao().add(lesson);
    }

    @Test
    @SneakyThrows
    void deleteTest() {
        new LessonDao().delete(6L);
    }

    @Test
    @SneakyThrows
    void getAllTest() {
        new LessonDao().getAll()
                .forEach(System.out::println);
    }

    @Test
    @SneakyThrows
    void getTest() {
        System.out.println(new LessonDao().get(1L));
    }
}