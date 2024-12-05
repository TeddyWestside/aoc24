package day1;

import java.util.List;

public class DistanceCalculator {

    public int measureDistance(List<Integer> firstList, List<Integer> secondList) {
        return Math.abs(firstList.getFirst() - secondList.getFirst());
    }
}
