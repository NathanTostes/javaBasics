package DateAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateAndTime {
	public static void main (String[] args) {
		LocalDateTime localDate = LocalDateTime.of(2024, 04, 05, 0, 0);
		LocalDateTime dateOneYearLater = localDate.plusYears(1);
		System.out.println(localDate.getYear() + " is leap year: " + localDate.toLocalDate().isLeapYear());
		System.out.println(dateOneYearLater.getDayOfWeek());
		LocalTime timeInBrazil = LocalTime.now(ZoneId.of("America/Sao_Paulo"));
		System.out.println("Time in Brazil: " + timeInBrazil.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
		LocalTime timeInJapan = LocalTime.now(ZoneId.of("Asia/Tokyo"));
		System.out.println("Time in Japan: " + timeInJapan.format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)));
		System.out.println("Difference of time between Brazil and Japan: " + ChronoUnit.HOURS.between(timeInBrazil, timeInJapan));
	}
}