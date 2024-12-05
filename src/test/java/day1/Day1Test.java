package day1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test {

    // Part 1
    @Test
    public void shouldMeasureDistanceWithTestData() {
        ListComparator listComparator = new ListComparator();
        listComparator.importLists("src/test/resources/day1/test.txt");
        assertEquals(11, listComparator.measureTotalDistance());
    }

    @Test
    public void shouldMeasureDistanceWithPuzzleData() {
        ListComparator listComparator = new ListComparator();
        listComparator.importLists("src/main/resources/list.txt");
        assertEquals(1197984, listComparator.measureTotalDistance());
    }

    // Part 2
    @Test
    public void shouldMeasureSimilarityScoreWithTestData() {
        ListComparator listComparator = new ListComparator();
        listComparator.importLists("src/test/resources/day1/test.txt");
        assertEquals(31, listComparator.measureSimilarityScore());
    }

    @Test
    public void shouldMeasureSimilarityScoreWithPuzzleData() {
        ListComparator listComparator = new ListComparator();
        listComparator.importLists("src/main/resources/list.txt");
        assertEquals(23387399, listComparator.measureSimilarityScore());
    }
}