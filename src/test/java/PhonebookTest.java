import com.hillel.hrebeniev.homeworks.homework_12.phonebook.Phonebook;
import com.hillel.hrebeniev.homeworks.homework_12.phonebook.Record;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class PhonebookTest {

    @Test
    public void testAdd() {
        Phonebook phonebook = new Phonebook();
        Record record1 = new Record("Nick", "+380981234577");
        Record record2 = new Record("Mary", "+380991234567");
        phonebook.add(record1);
        phonebook.add(record2);

        Assertions.assertEquals(record1.getName(), phonebook.getRecords().get(0).getName());
        Assertions.assertEquals(record2.getName(), phonebook.getRecords().get(1).getName());
    }

    @Test
    public void testFind() {
        Phonebook phonebook = new Phonebook();
        phonebook.add(new Record("Nick", "+380981234577"));
        phonebook.add(new Record("Nick", "+380981111111"));
        phonebook.add(new Record("Mary", "+380991234567"));

        Assertions.assertEquals(phonebook.getRecords().get(0),
                phonebook.find(phonebook.getRecords().get(0).getName()));
        Assertions.assertEquals(phonebook.getRecords().get(2),
                phonebook.find(phonebook.getRecords().get(2).getName()));
    }

    @Test
    public void testFindAll() {
        Record record1 = new Record("Nick", "+380981234567");
        Record record2 = new Record("Nick", "+380981111111");
        Phonebook phonebook = new Phonebook();
        phonebook.add(record1);
        phonebook.add(record2);

        List<Record> expectedRecords = new ArrayList<>();
        expectedRecords.add(record1);
        expectedRecords.add(record2);

        List<Record> actualRecords = phonebook.findAll("Nick");

        Assertions.assertEquals(expectedRecords, actualRecords);
    }
}