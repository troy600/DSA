import java.util.Calendar;
import java.util.Scanner;

public class infiniteforloop {
    private static int pis() {
        return 0;
    }
    public static void main(String[] args) {
        System.out.println("hello world");
        int thisint;
        int thisintttt = 0;
        int thisintt = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(Calendar.DATE);

        for (thisint = 0; thisint != 0; thisint++) {
            thisintt++;
            thisintttt++;
            int newint = thisint * thisintt * thisint;
            System.out.println(newint);
            scanner.close();
            System.exit(pis());
        }
    }
}