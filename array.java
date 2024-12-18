import java.util.Scanner;
import java.util.InputMismatchException;

public class array {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the ammount of array you want to insert");
        System.out.print(">>");

        try {
            int len = input.nextInt();
            int i;
            int[] array = new int[len];
            for (i=0; i<len; i++) {
                array[i] = i;
                System.out.println(array[i]);
            }
        } catch (InputMismatchException exception) {
            input.close();
            throw new InputMismatchException();
        }
        input.close();
    }
}
