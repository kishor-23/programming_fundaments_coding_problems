package codingpractice;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class NumberOfWeeks {
	 public static long getWeeksBetween(LocalDate start, LocalDate end) {
	        // Calculate the number of days between the two dates
	        long daysBetween = ChronoUnit.DAYS.between(start, end);
	        // Convert the number of days to weeks
	        return daysBetween / 7;
	    }


	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

	        System.out.print("Enter the start date (yyyy-MM-dd): ");
	        String startDateInput = scanner.nextLine();
	        LocalDate startDate = LocalDate.parse(startDateInput, formatter);

	        System.out.print("Enter the end date (yyyy-MM-dd): ");
	        String endDateInput = scanner.nextLine();
	        LocalDate endDate = LocalDate.parse(endDateInput, formatter);

	        long weeks = getWeeksBetween(startDate, endDate);
	        System.out.println("Number of weeks between dates: " + weeks);
	}

}
