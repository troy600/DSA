import java.util.InputMismatchException;
import java.util.Scanner;

public class powsum {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String reason = "the User Didn't type a valid int";
        double num1;
        int num2;
        boolean baduser = true;
        while (baduser) {
            try {
                System.out.println("Please enter the number you want to compute to the pow of 2");
                System.out.print(">>");
                num1 = input.nextInt();
                System.out.println("Second number you want to add to the " + num1 +"pow2 + number ");
                System.out.print(">>");
                num2 = input.nextInt();
                input.close();
                //fcking stop Charlie !!!!!
                baduserexample.IfTheUserhasSucessfullytypedTheFirstNumberAndTheSecondNumberThenThisWillBeCallToDisplayTheResultAndExitsTheprogram(baduserexample.ThePowerOfTheNumberThatTheUserInsertedToSolveHisOrHerProblemPlusTheNumberTheUserTypedtoSolveThePow2AndtheSecondNumber(baduserexample.ThePowerOfTheNumberThatTheUserInsertedToSolveHisOrHerProblem(num1), baduserexample.TheSecondNumberTypedByTheUserToAddthePwerOfthenumberThattheUserInsertedToSolveHisOrHerproblem(num2)), baduserexample.TheFirstNumbertypedByTheUserToSolveHisOrherProblem(num1), baduserexample.TheSecondNumberTypedByTheUserToAddthePwerOfthenumberThattheUserInsertedToSolveHisOrHerproblem(num2));
                baduser = false;

            } catch (InputMismatchException exception) {
                //bro stop!
                input.close();
                baduserexample.ShowTheErrorMessageWhenTheUserIsBadAndNotFollowingTheinstructions(reason);
            }
        }
    }
}