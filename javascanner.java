import java.util.Scanner;

class scanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

	//unput from student idk
	System.out.println("enter your name: ");
	String names = scanner.nextLine();

	//input their age cuz why not?
	System.out.println(" enter your age: ");
	int ages = scanner.nextInt();

	if ( ages >= 18 ) {
	    System.out.println("hello! " + names + "  age:  " + ages + "  eyyo Legal age :)))");
	} else {
	    System.out.println(names + "a kid? gtfo");
	}
    }
}
