import day2.ReportChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day2Test {

    @Test
    public void shouldMeasureDistanceWithTestData() {
        ReportChecker reportChecker = new ReportChecker();
        assertEquals(2, reportChecker.calculateSafeReports("src/test/resources/day2/test.txt"));
    }

    @Test
    public void shouldMeasureDistanceWithPuzzleData() {
        ReportChecker reportChecker = new ReportChecker();
        assertEquals(2, reportChecker.calculateSafeReports("src/main/resources/day2/list.txt"));
    }
}
