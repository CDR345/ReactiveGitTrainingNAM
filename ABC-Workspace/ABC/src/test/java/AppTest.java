import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;

public class AppTest {

    @Test
    public void testCalculateDaysBetween() {
        long result = App.calculateDaysBetween(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 11));
        assertEquals(10, result);
    }

    @Test
    public void testCalculateDaysBetweenSameDate() {
        long result = App.calculateDaysBetween(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 1));
        assertEquals(0, result);
    }

    @Test
    public void testCalculateHoursBetween() {
        long result = App.calculateHoursBetween(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 2));
        assertEquals(24, result);
    }

    @Test
    public void testCalculateHoursBetweenSameDate() {
        long result = App.calculateHoursBetween(LocalDate.of(2023, 1, 1), LocalDate.of(2023, 1, 1));
        assertEquals(0, result);
    }
}
