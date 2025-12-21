import java.io.File;

public class FileDemo {
    public static void main(String[] args) throws Exception {
        File f = new File("test.txt");

        if (f.createNewFile()) {
            System.out.println("File created");
        } else {
            System.out.println("Already exists");
        }
    }
}
