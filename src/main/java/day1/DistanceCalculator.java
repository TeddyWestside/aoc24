package day1;

import java.util.List;

public class DistanceCalculator {

    public int measureDistance(List<Integer> firstList, List<Integer> secondList) {
        int totalDistance = 0;
        for (int i = 0; i < firstList.size(); i++) {
            totalDistance += Math.abs(firstList.get(i) - secondList.get(i));
        }
        return totalDistance;    }
}
