package creational.factoryMethod;

import java.util.Calendar;

public class factoryMethod {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar.getTime());
        System.out.println(calendar.getClass().getCanonicalName());
    }
}
