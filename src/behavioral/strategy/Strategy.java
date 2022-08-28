package behavioral.strategy;

import java.util.*;

public class Strategy {
    public static void main(String[] args) {
        List<String> data = Arrays.asList("Moscow", "Paris", "NYC");
        Comparator<String> comparator = Comparator.comparingInt(String::length);
        Set dataSet = new TreeSet(comparator);
        dataSet.addAll(data);
        System.out.println("Dataset : " + dataSet);
    }
}
