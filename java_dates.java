import java.time.Instant;
import java.util.Date;

public class java_dates {
    public static void main(String[] args) {
    //call the DisplayDates class
    //display date method
    Instant this_Instant = Instant.now();
    System.out.print(Date.from(this_Instant));
    }
}