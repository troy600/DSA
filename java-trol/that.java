import java.util.Scanner;
import java.util.InputMismatchException;

public class that {
    public static void main(String[] args) {
				Scanner input = new Scanner(System.in);
				System.out.println("Insert any number");
				try {
				    int number = input.nextInt();
            input.close();
						System.out.println(number);
				} catch (InputMismatchException Exception) {
				    throw new InputMismatchException();
				} finally {
				    error();
				}
    }

		private static void error() {
				System.err.print("an unexpected shit occured\n");
		}
}
