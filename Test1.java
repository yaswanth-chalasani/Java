package newpage;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date=LocalDate.now();
		System.out.println("Default format of LocalTime"+date);
		System.out.println("Pattern"+date.format(DateTimeFormatter.ofPattern("d::MMM::uuuu")));
		
		LocalTime lt=LocalTime.now();
		System.out.println("Time:"+lt);
		LocalDateTime dateTime=LocalDateTime.now();
		System.out.println("Default format of LocalDateTime:"+dateTime);
		System.out.println(dateTime.format(DateTimeFormatter.ofPattern("d::MMM::uuuu HH::mm::ss")));
		System.out.println(dateTime.format(DateTimeFormatter.BASIC_ISO_DATE));
	}

}
