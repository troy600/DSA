import java.util.Scanner;

class chaoticjava {
    public static void main(String[] args) {
	System.out.println("hello world Whats your age? \n >>");
	Scanner scanner = new Scanner(System.in);

	int age = scanner.nextInt();

	if ( age >= 18 ) {
	    System.out.println(age+ "? you're too old!!! no!! find someone");
	} else  {
	    if (age < 8 ) {
                System.out.println(age+ "?? illegal");
	    } else { 
		System.out.println(age + "!!! Perfect!!");
		System.out.println("\n");
            }
	    }
    }
}
