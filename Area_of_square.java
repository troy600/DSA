import java.util.*;

public class Area_of_square {

    private static double aos_formula(double s) {
        double answer = Math.pow(s, 2);
        System.out.println("the area of square of " + s + "is " + answer);
        return answer;
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Whats the lenght of one side?");
        double number = s.nextDouble();

        aos_formula(number);
        s.close();

    }
}