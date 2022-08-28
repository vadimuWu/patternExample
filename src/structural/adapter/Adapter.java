package structural.adapter;

import java.util.Arrays;
import java.util.List;

public class Adapter {
    public static void main(String[] arguments) {
        String[] array = {"One", "Two", "Three"};
        List<String> strings = Arrays.asList(array);
        strings.set(0, "1");
        System.out.println(Arrays.toString(array));
    }
}
