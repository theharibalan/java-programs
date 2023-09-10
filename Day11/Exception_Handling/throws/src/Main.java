import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("abc.txt");
        pw.println("Hi");
        pw.println("How are you");
        pw.println("Welcome to throws exception");
        pw.flush();
        pw.close();
    }
}