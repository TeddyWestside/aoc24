package day7;

import lombok.NoArgsConstructor;
import utils.SharedFunctions;

import java.util.Arrays;
import java.util.Stack;

@NoArgsConstructor
public class EquationsSolver {

    private boolean concatenationActivated = false;

    public EquationsSolver(boolean concatenationActivated) {
        this.concatenationActivated = concatenationActivated;
    }

    public boolean isLineSolvable(long result, int[] inputValues) {

        Stack<long[]> stack = new Stack<>();
        stack.push(new long[]{0, inputValues[0]});

        while (!stack.isEmpty()) {
            long[] current = stack.pop();
            int index = (int) current[0];
            long currentValue = current[1];

            if (index == inputValues.length - 1) {
                if (currentValue == result) {
                    return true;
                }
            } else {
                long nextNumber = inputValues[index + 1];
                stack.push(new long[]{index + 1, currentValue + nextNumber});
                stack.push(new long[]{index + 1, currentValue * nextNumber});
                if (concatenationActivated)
                    stack.push(new long[]{index + 1, Long.parseLong(currentValue + "" + nextNumber)});
            }
        }

        return false;
    }

    public long resolveAllForFile(String path) {
        long totalSum = 0;
        var myReader = SharedFunctions.getScanner(path);
        while (myReader.hasNextLine()) {
            String line = myReader.nextLine();
            String[] numbers = line.trim().split("[\\s:]+");
            int[] inputValues = Arrays.stream(numbers, 1, numbers.length)
                    .mapToInt(Integer::parseInt)
                    .toArray();
            if (isLineSolvable(Long.parseLong(numbers[0]), inputValues)) {
                totalSum = totalSum + Long.parseLong(numbers[0]);
            }
        }
        return totalSum;
    }
}
