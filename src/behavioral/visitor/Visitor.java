package behavioral.visitor;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Visitor {
    public static void main(String[] args) {
        SimpleFileVisitor visitor = new SimpleFileVisitor() {
            @Override
            public FileVisitResult visitFile(Object file, BasicFileAttributes attrs) throws IOException {
                System.out.println("File:" + file.toString());
                return FileVisitResult.CONTINUE;
            }
        };
        Path pathSource = Paths.get(System.getProperty("java.io.tmpdir"));
        try {
            Files.walkFileTree(pathSource, visitor);
        } catch (AccessDeniedException e) {
            // skip
        } catch (IOException e) {
            // Do something
        }
    }
}
