import day1.DistanceCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test {


    @Test
    public void testDistanceCalculatorWithImportedTestLists() {
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        distanceCalculator.importLists("src/test/resources/test.txt");
        assertEquals(11, distanceCalculator.measureTotalDistance());
    }

    @Test
    public void testDistanceCalculatorWithImportedPuzzleLists() {
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        distanceCalculator.importLists("src/main/resources/list.txt");
        assertEquals(1197984, distanceCalculator.measureTotalDistance());
    }
}