import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.*;
import java.util.List;

public class ListTest {

    @Test
    public void filter() {
        ArrayList<String> input = new ArrayList<>();
        input.add("a"); input.add("b"); input.add("ab");
        ListExamples sc = new ListExamples();
        assertArrayEquals(new String[]{"a","b"}, ListExamples.filter(input, sc).toArray());
    }
}