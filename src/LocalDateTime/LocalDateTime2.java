package LocalDateTime;
import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTime2 {
	
	
	
	public static void main(String[]args) {
		
		LocalDateTime dt=LocalDateTime.of(1995,Month.MAY,28,12,45);
		System.out.println(dt);
		System.out.println("After Six Months:"+dt.plusMonths(6));
		System.out.println("Before six Month:"+dt.minusMonths(6));
	}

}
