package day1;

import utils.SharedFunctions;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


@Data
public class ListComparator {

    private ArrayList<Integer> firstList = new ArrayList<>();
    private ArrayList<Integer> secondList = new ArrayList<>();

    public int measureTotalDistance() {
        sortLists();
        int totalDistance = 0;
        for (int i = 0; i < firstList.size(); i++) {
            totalDistance += Math.abs(firstList.get(i) - secondList.get(i));
        }
        return totalDistance;
    }

    public int measureSimilarityScore() {
        int similarityScore = 0;
        for (int number : firstList) {
            similarityScore += number * Collections.frequency(secondList, number);
        }
        return similarityScore;
    }

    private void sortLists() {
        Collections.sort(firstList);
        Collections.sort(secondList);
    }

    public void importLists(String path) {

        Scanner myReader = SharedFunctions.getScanner(path);
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            String[] numbers = line.trim().split("\\s+");
            firstList.add(Integer.parseInt(numbers[0]));
            secondList.add(Integer.parseInt(numbers[1]));
        }
        myReader.close();
    }

}

