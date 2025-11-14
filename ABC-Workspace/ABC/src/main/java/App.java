import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println(calculateDaysBetween(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31)));
        System.out.println(calculateHoursBetween(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 12, 31)));
    }

    public static long calculateDaysBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.DAYS.between(startDate, endDate);
    }

    public static long calculateHoursBetween(LocalDate startDate, LocalDate endDate) {
        return ChronoUnit.HOURS.between(startDate.atStartOfDay(), endDate.atStartOfDay());
    }
}