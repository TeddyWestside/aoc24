package day1;

import lombok.Data;

import java.util.ArrayList;

@Data
public class DistanceCalculator {

    private ArrayList<Integer> firstList;
    private ArrayList<Integer> secondList;

    public int measureDistance() {
        int totalDistance = 0;
        for (int i = 0; i < firstList.size(); i++) {
            totalDistance += Math.abs(firstList.get(i) - secondList.get(i));
        }
        return totalDistance;
    }
}
