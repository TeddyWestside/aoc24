package day2;

import utils.SharedFunctions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReportChecker {
    private boolean hasProblemDampener;

    public ReportChecker(boolean hasProblemDampener) {
        this.hasProblemDampener = hasProblemDampener;
    }

    public int calculateSafeReports(String path) {
        int safeReportsCount = 0;
        var myReader = SharedFunctions.getScanner(path);
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            List<Integer> numbers = Arrays.stream(line.trim().split("\\s+"))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
            if (hasDistanceSmallerThan4(numbers) && (isConstantlyIncreasing(numbers) || isConstantlyDecreasing(numbers))) {
                safeReportsCount++;
            }
        }
        return safeReportsCount;
    }

    private boolean isConstantlyDecreasing(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) <= numbers.get(i + 1)) {
                return false;
            }
        }
        return true;
    }


    private boolean isConstantlyIncreasing(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (numbers.get(i) >= numbers.get(i + 1)) {
                return false;
            }
        }
        return true;
    }

    private boolean hasDistanceSmallerThan4(List<Integer> numbers) {
        for (int i = 0; i < numbers.size() - 1; i++) {
            if (Math.abs(numbers.get(i) - numbers.get(i + 1)) > 3) {
                return false;
            }
        }
        return true;
    }
}

