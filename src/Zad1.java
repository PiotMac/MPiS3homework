import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.security.SecureRandom;
import java.util.Random;
public class Zad1 {
    static final Random random = new Random();
    static final SecureRandom secure = new SecureRandom();
    public static void main(String[] args) throws FileNotFoundException {
        File file1 = new File("random.txt");
        PrintWriter printWriter1 = new PrintWriter("random.txt");
        int bit;
        for (int i = 0; i < 1000000; i++) {
            bit = random.nextInt(2);
            printWriter1.print(bit);
        }
        printWriter1.close();

        File file2 = new File("secure.txt");
        PrintWriter printWriter2 = new PrintWriter("secure.txt");
        for (int i = 0; i < 1000000; i++) {
            bit = secure.nextInt(2);
            printWriter2.print(bit);
        }
        printWriter2.close();
    }
}