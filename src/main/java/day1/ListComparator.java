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
        // go through the lists and multiply the first value of the first list with the amount of its occurrences in the second list
        int similarityScore = 0;
        for (Integer integer : firstList) {
            similarityScore += integer * Collections.frequency(secondList, integer);
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

