import java.util.Scanner;
import java.util.InputMismatchException;

class thrower {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your age>>");
        try {
            int myint = input.nextInt();
            System.out.println("wow youre " + myint + "? awesome");
        } catch (InputMismatchException Exception) {
            throw new InputMismatchException();
        } finally {
            input.close();
        }
    }
}
