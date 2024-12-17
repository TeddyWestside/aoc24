package utils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SharedFunctions {
    public static Scanner getScanner(String path) {
        File myObj = new File(path);
        try {
            return new Scanner(myObj);
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        return null;
    }
    public static ArrayList<String> getLines(String path) {
        ArrayList<String> lines = new ArrayList<>();
        var myReader = SharedFunctions.getScanner(path);
        assert myReader != null;
        myReader.forEachRemaining(lines::add);
        return lines;
    }
}
