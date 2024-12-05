import day1.DistanceCalculator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test {

    @Test
    public void testDistanceCalculator() {
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        List<Integer> firstList = new ArrayList<>(Arrays.asList(1, 1));
        List<Integer> secondList = new ArrayList<>(Arrays.asList(7, 7));
        assertEquals(12, distanceCalculator.measureDistance(firstList, secondList));
    }
}