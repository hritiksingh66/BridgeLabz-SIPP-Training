import java.time.ZoneId;
import java.time.ZonedDateTime;

public class TimeZoneExample{
    public static void main(String[] args) {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("Current time in GMT: " + gmt);
        System.out.println("Current time in IST: " + ist);
        System.out.println("Current time in PST: " + pst);
    }
}