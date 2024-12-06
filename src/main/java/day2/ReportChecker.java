package day2;

import utils.SharedFunctions;

import java.util.Arrays;

public class ReportChecker {
    public int calculateSafeReports(String path) {
        int safeReportsCount = 0;
        var myReader = SharedFunctions.getScanner(path);
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            int[] numbers = Arrays.stream(line.trim().split("\\s+"))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (hasDistanceGreaterThan3(numbers))
                safeReportsCount++;
        }
        return safeReportsCount;
    }

    private boolean hasDistanceGreaterThan3(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            if (Math.abs(numbers[i] - numbers[i + 1]) > 3) {
                return true;
            }
        }
        return false;
    }
}

