import day2.ReportChecker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day2Test {

    // Part 1
    @Test
    public void shouldMeasureDistanceWithTestData() {
        ReportChecker reportChecker = new ReportChecker(false);
        assertEquals(2, reportChecker.calculateSafeReports("src/test/resources/day2/test.txt"));
    }

    @Test
    public void shouldMeasureDistanceWithPuzzleData() {
        ReportChecker reportChecker = new ReportChecker(false);
        assertEquals(686, reportChecker.calculateSafeReports("src/main/resources/day2/list.txt"));
    }

    // Part 2
    @Test
    public void shouldMeasureDistanceWithTestDataAndProblemDampener() {
        ReportChecker reportChecker = new ReportChecker(true);
        assertEquals(4, reportChecker.calculateSafeReports("src/test/resources/day2/test2.txt"));
    }
}
