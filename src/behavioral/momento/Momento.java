package behavioral.momento;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Momento {
    public static void main(String[] args) throws IOException {
        ArrayList<String> list = new ArrayList<>();
        list.add("test");
        // Save State
        ByteArrayOutputStream stream = new ByteArrayOutputStream();
        try (ObjectOutputStream out = new ObjectOutputStream(stream)) {
            out.writeObject(list);
        }
        // Load state
        byte[] bytes = stream.toByteArray();
        InputStream inputStream = new ByteArrayInputStream(bytes);
        try (ObjectInputStream in = new ObjectInputStream(inputStream)) {
            List<String> listNew = (List<String>) in.readObject();
            System.out.println(listNew.get(0));
        } catch (ClassNotFoundException e) {
            // Do something. Can't find class fpr saved state
        }
    }
}
