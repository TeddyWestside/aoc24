import day1.ListComparator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test {

    // Part 1
    @Test
    public void testDistanceCalculatorWithImportedTestLists() {
        ListComparator listComparator = new ListComparator();
        listComparator.importLists("src/test/resources/test.txt");
        assertEquals(11, listComparator.measureTotalDistance());
    }

    @Test
    public void testDistanceCalculatorWithImportedPuzzleLists() {
        ListComparator listComparator = new ListComparator();
        listComparator.importLists("src/main/resources/list.txt");
        assertEquals(1197984, listComparator.measureTotalDistance());
    }

    // Part 2
    @Test
    public void shouldMeasureSimilarityScore() {
        ListComparator listComparator = new ListComparator();
        listComparator.importLists("src/test/resources/test.txt");
        assertEquals(11, listComparator.measureTotalDistance());
    }
}