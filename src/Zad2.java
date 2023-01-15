import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.security.SecureRandom;

public class Zad2 {
    static SecureRandom random = new SecureRandom();
    public static int Sn(int N) {
        int S = 0;
        int X;
        for (int i = 0; i < N; i++) {
            X = random.nextInt(2);
            if (X == 0) {
                S--;
            }
            else {
                S++;
            }
        }
        return S;
    }
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("zad2.txt");
        PrintWriter printWriter = new PrintWriter("zad2.txt");

        for(int i = 5; i < 31; i += 5)
        {
            int[] frequency = new int[i * 2 + 1];
            for(int j = 0; j < i * 2 + 1; j += 1) {
                frequency[j] = 0;
            }
            for(int j = 0; j < 100000; j++)
            {
                frequency[i + Sn(i)] += 1;
            }
            printWriter.print(i + " ");
            printWriter.print(frequency[0]);
            for(int j = 1; j < i * 2 + 1; j++) {
                printWriter.print(" " + frequency[j]);
            }
            printWriter.println();
        }

        int[] frequency = new int[100 * 2 + 1];

        for(int j = 0; j < 100 * 2 + 1; j++) {
            frequency[j] = 0;
        }

        for(int j = 0; j < 1000000; j++)
        {
            frequency[100 + Sn(100)] += 1;
        }
        printWriter.print("100 ");
        printWriter.print(frequency[0]);
        for(int j = 1; j < 100 * 2 + 1; j++) {
            printWriter.print(" " + frequency[j]);
        }
        printWriter.close();
    }
}