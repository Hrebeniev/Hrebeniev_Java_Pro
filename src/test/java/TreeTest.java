import com.hillel.hrebeniev.homeworks.homework_16.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class TreeTest {
    @Test
    void addTest() {
        Tree tree = new Tree();

        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);

        Assertions.assertEquals(5, tree.getRoot().getValue());
        Assertions.assertEquals(3, tree.getRoot().getLeft().getValue());
        Assertions.assertEquals(2, tree.getRoot().getLeft().getLeft().getValue());
        Assertions.assertEquals(4, tree.getRoot().getLeft().getRight().getValue());
        Assertions.assertEquals(7, tree.getRoot().getRight().getValue());
    }

    @Test
    void traverseInorderTest() {
        Tree tree = new Tree();
        tree.add(5);
        tree.add(3);
        tree.add(7);
        tree.add(2);
        tree.add(4);
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));

        tree.traverseInorder();

        Assertions.assertEquals("2 3 4 5 7 ", outContent.toString());
    }
}
}
