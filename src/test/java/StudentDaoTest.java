import com.hillel.hrebeniev.homeworks.homework_30.DefaultDao;
import com.hillel.hrebeniev.homeworks.homework_30.HibernateSession;
import com.hillel.hrebeniev.homeworks.homework_30.Student;
import com.hillel.hrebeniev.homeworks.homework_30.StudentDao;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import javax.persistence.Table;
import java.util.List;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentDaoTest {
    static DefaultDao<Student> dao;


    @BeforeAll
    static void classLevelSetUp() {
        dao = new StudentDao();
    }

    @AfterAll
    static void cleanUp() {
        try (Session session = HibernateSession.getSessionFactory().openSession()) {
            Transaction transaction = session.beginTransaction();
            String truncateQuery =
                    String.format("TRUNCATE TABLE %s", Student.class.getAnnotation(Table.class).name());
            session.createNativeQuery(truncateQuery).executeUpdate();
            transaction.commit();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Order(1)
    @Test
    void insertTest() {
        Student student1 = Student.builder()
                .name("Name1")
                .email("name1@example.com")
                .build();
        Student student2 = Student.builder()
                .name("Name2")
                .email("name2@example.com")
                .build();
        Student student3 = Student.builder()
                .name("Name3")
                .email("name3@example.com")
                .build();

        dao.insert(student1);
        dao.insert(student2);
        dao.insert(student3);
    }

    @Order(2)
    @Test
    void updateTest() {
        Student student4 = Student.builder()
                .name("Name4")
                .email("name4@example.com")
                .build();
        dao.insert(student4);
        student4.setEmail("name44@example.com");
        dao.update(student4);
    }


    @Order(3)
    @Test
    void deleteTest() {
        dao.delete(3);
        Assertions.assertNull(dao.getById(3));
    }

    @Order(4)
    @Test
    void getByIdTest() {
        Assertions.assertEquals("Name2", dao.getById(2).getName());
    }


    @Order(5)
    @Test
    void getAllTest() {
        List<Student> studentList = dao.getAll();
        Assertions.assertTrue(studentList.size() > 1);
    }
}