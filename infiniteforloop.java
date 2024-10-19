import java.util.*;

public class infiniteforloop {
    public static void main(String[] args) {
        System.out.println("hello world");
        int thisint;
        int thisintttt = 0;
        int thisintt = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println(Calendar.DATE);
        String dsaString = "Stressss";

        for (thisint = 0; thisint != 0; thisint++) {
            thisintt++;
            thisintttt++;
            int newint = thisint * thisintt * thisint;
            System.out.println(newint);
        }
    }
}