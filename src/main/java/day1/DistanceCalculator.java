package day1;

import lombok.Data;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

@Data
public class DistanceCalculator {

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

    private void sortLists() {
        Collections.sort(firstList);
        Collections.sort(secondList);
    }

    public void importLists(String path) {
        Scanner myReader = getScanner(path);
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            String[] numbers = line.trim().split("\\s+");
            firstList.add(Integer.parseInt(numbers[0]));
            secondList.add(Integer.parseInt(numbers[1]));
        }
        myReader.close();
    }

    private Scanner getScanner(String path) {
        File myObj = new File(path);
        try {
            return new Scanner(myObj);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
}

