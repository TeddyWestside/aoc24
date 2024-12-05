import day1.DistanceCalculator;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day1Test {

    @Test
    public void testDistanceCalculator() {
        DistanceCalculator distanceCalculator = new DistanceCalculator();
        distanceCalculator.setFirstList(new ArrayList<>(Arrays.asList(1, 1)));
        distanceCalculator.setSecondList(new ArrayList<>(Arrays.asList(7, 7)));
        assertEquals(12, distanceCalculator.measureDistance());
    }
}