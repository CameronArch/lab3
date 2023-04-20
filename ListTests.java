import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.*;
import java.util.List;

public class ListTests {

    @Test
    public void filter() {
        ArrayList<String> input = new ArrayList<>();
        input.add("a"); input.add("b"); input.add("ab");
        ListExamples sc = new ListExamples();
        assertArrayEquals(new String[]{"a","b"}, ListExamples.filter(input, sc).toArray());
    }
    @Test 
    public void merge() {
        ArrayList<String> input = new ArrayList<>();
        input.add("a"); input.add("b"); input.add("c");
        ArrayList<String> input2 = new ArrayList<>();
        input2.add("a"); input2.add("c");input2.add("c");
        assertArrayEquals(new String[]{"a","a","b","c","c","c"},ListExamples.merge(input,input2).toArray());
    }
}