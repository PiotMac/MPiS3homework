import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.security.SecureRandom;

public class Zad3 {
    public static void main(String[] args) throws FileNotFoundException {
        SecureRandom secure = new SecureRandom();
        File file = new File("zad3.txt");
        PrintWriter printWriter = new PrintWriter("zad3.txt");
        int number;
        int sum;
        int previous;
        int time;

        for (int i = 100; i <= 10000; i *= 10) {
            for (int j = 0; j < 5000; j++) {
                printWriter.print(i);
                sum = 0;
                time = 0;
                for (int k = 0; k < i; k++) {
                    previous = sum;
                    number = secure.nextInt(2);
                    if (number == 0) {
                        sum -= 1;
                    }
                    else {
                        sum += 1;
                    }
                    if (sum > 0 || (sum == 0 && previous > 0)) {
                        time += 1;
                    }
                }
                printWriter.println(" " + time);
            }
        }
        printWriter.close();
    }
}
