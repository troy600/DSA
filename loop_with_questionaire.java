// ____  ____    _      ____ _____ _   _ ____  _____ _   _ _____ ____
//|  _ \/ ___|  / \    / ___|_   _| | | |  _ \| ____| \ | |_   _/ ___|
//| | | \___ \ / _ \   \___ \ | | | | | | | | |  _| |  \| | | | \___ \
//| |_| |___) / ___ \   ___) || | | |_| | |_| | |___| |\  | | |  ___) |
//|____/|____/_/   \_\ |____/ |_|  \___/|____/|_____|_| \_| |_| |____/

//  ____  ___   ____  ___   ____  ___
// / ___|/ _ \ / ___|/ _ \ / ___|/ _ \
//| |  _| | | | |  _| | | | |  _| | | |
//| |_| | |_| | |_| | |_| | |_| | |_| |
// \____|\___/ \____|\___/ \____|\___/


import java.util.Scanner;

public class loop_with_questionaire {

    public loop_with_questionaire() {
        boolean terminator = true;
        int user_answer;
        int answer = 9981 * 712 / 89  + 14;
        System.out.println(answer + " what is 9981 * 712 / 89 + 14??");
        Scanner user_input = new Scanner(System.in);
        user_answer = user_input.nextInt();
        while (terminator) {
            if (user_answer != answer) {
                System.out.println("is wrong try again :(.");
                user_answer = user_input.nextInt();
            } else {
                System.out.println("hooray! correct");
                user_input.close();
                terminator = false;
                System.exit(0);
            }
        }
    }


    public static void main(String[] args) {
        new loop_with_questionaire();
        System.exit(0);
    }
}