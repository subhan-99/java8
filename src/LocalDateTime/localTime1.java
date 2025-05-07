package LocalDateTime;

import java.time.LocalDateTime;

public class localTime1 {
    
    public static void main(String[] args) {
        
        LocalDateTime dt = LocalDateTime.now();
        System.out.println(dt);

        int dd = dt.getDayOfMonth();
        int mm = dt.getMonthValue();
        int yy = dt.getYear();
        int h = dt.getHour();
        int m = dt.getMinute();
        int s = dt.getSecond(); // Changed from getNano() to getSecond() for readability

        System.out.printf("Date: %d-%d-%d\n", dd, mm, yy);
        System.out.printf("Time: %02d:%02d:%02d\n", h, m, s);
    }
}
