import java.io.*;

public class Test3 {
    public static void main(String[] args) throws Exception {
        try (FileReader fr = new FileReader("test.txt")) {
            System.out.println("Reading file");
        }
        catch(FileNotFoundException e){
            System.out.println("file not found");
        }
    }
}
