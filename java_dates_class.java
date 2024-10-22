import java.time.Instant;
import java.util.Date;

public class java_dates {

    //display date method
    private static void DisplayDates() {
        Instant this_Instant = Instant.now();
        System.out.print(Date.from(this_Instant));
    }

    public static void main(String[] args) {
        //call the DisplayDates class
        DisplayDates();
    }
}