import java.util.Scanner;
import java.util.InputMismatchException;
import java.time.Instant;
import java.util.Date;

public class baduserexample {
    public static void main(String[] args) {
        System.out.print("It's " + Date.from(Instant.now()) + " Good Day Maam/Sir!");
        boolean gooduser = true;
        int thisint;
        int SecondInt;
        Scanner input = new Scanner(System.in);
        while (gooduser) {
            try {
                System.out.print("Type the first number you want to sum!\n >>");
                thisint = input.nextInt();
                System.out.print("how about the second one? \n>>");
                SecondInt = input.nextInt();
                System.out.println("the answer is " + TheMainOperatorthatWillBeUSeToSumTwoNumbersAddedByUser(thisint, SecondInt));
                gooduser = false;
            } catch (InputMismatchException exception) {
                String reason = "The User Is very stupid!! add the number you want to... Oh my god!";
                gooduser = false;
                input.close();
                ShowTheErrorMessageWhenTheUserIsBadAndNotFollowingTheinstructions(reason);
            }
        }

        input.close();
    }

    public static int TheMainOperatorthatWillBeUSeToSumTwoNumbersAddedByUser(int FirstInt, int SecondInt) {
        int answer = FirstInt + SecondInt;
        return answer;
    }
    public static void ShowTheErrorMessageWhenTheUserIsBadAndNotFollowingTheinstructions(String reason) {
        while (true) {
            System.err.println(reason);   
        }
    }
    public static double ThePowerOfTheNumberThatTheUserInsertedToSolveHisOrHerProblem(int pow, int pow2) {
        double thas = Math.pow(pow, pow2);
        return thas;
    }
}