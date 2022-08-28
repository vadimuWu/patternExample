package creational.builder;

public class Builder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello");
        builder.append(',');
        builder.append("World!");
        System.out.println(builder);
    }
}
