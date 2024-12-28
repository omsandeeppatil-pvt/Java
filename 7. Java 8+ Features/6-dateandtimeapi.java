import java.time.*;
import java.time.format.DateTimeFormatter;

public class DateAndTimeAPI {
    public static void main(String[] args) {
        // Getting the current date and time
        LocalDate currentDate = LocalDate.now();
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current Date: " + currentDate);
        System.out.println("Current Time: " + currentTime);

        // Formatting dates
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = currentDate.format(formatter);
        System.out.println("Formatted Date: " + formattedDate);

        // Parsing a date
        String dateStr = "28-12-2024";
        LocalDate parsedDate = LocalDate.parse(dateStr, formatter);
        System.out.println("Parsed Date: " + parsedDate);

        // Performing date calculations
        LocalDate nextWeek = currentDate.plusWeeks(1);
        System.out.println("Date Next Week: " + nextWeek);

        LocalDate lastMonth = currentDate.minusMonths(1);
        System.out.println("Date Last Month: " + lastMonth);
    }
}
