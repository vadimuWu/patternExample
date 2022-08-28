package behavioral.Iterator;

import java.util.Arrays;
import java.util.List;

public class Iterator {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Moscow", "Paris", "NYC");
        Iterator<String> iterator = data.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
