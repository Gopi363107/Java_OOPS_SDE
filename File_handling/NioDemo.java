import java.io.FileReader;
import java.nio.file.*;

public class NioDemo {
    public static void main(String[] args) throws Exception {
        Path path = Paths.get("test.txt");
        
        Files.write(path, "Hello NIO".getBytes());
        System.out.println(Files.readAllLines(path));


        try (FileReader fr = new FileReader("test.txt")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
        }

    }
}
