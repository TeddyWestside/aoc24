package day9;

import lombok.Data;
import java.util.ArrayList;

@Data
public class Defragmenter {

    private ArrayList<String> blockView = new ArrayList<>();
    private ArrayList<String> defragmentedDiskMap = new ArrayList<>();
    private String checkSum = "";

    public void generateBlockView(String diskMap) {
        char[] diskMapArray = diskMap.toCharArray();
        for (int charPosition = 0; charPosition < diskMapArray.length; charPosition++) {
            int value = Character.getNumericValue(diskMapArray[charPosition]);
            if (isEven(charPosition)) {
                appendTimes(String.valueOf(charPosition / 2), value);
            } else {
                appendTimes(".", value);
            }
        }
    }

    public void defrag() {
        defragmentedDiskMap = new ArrayList<>(blockView);
        int dotIndex = 0;

        for (int i = defragmentedDiskMap.size() - 1; i >= 0; i--) {
            if (!defragmentedDiskMap.get(i).equals(".")) {
                // Find the foremost dot to swap with
                while (dotIndex < defragmentedDiskMap.size() && !defragmentedDiskMap.get(dotIndex).equals(".")) {
                    dotIndex++;
                }
                if (dotIndex < defragmentedDiskMap.size() && i > dotIndex) {
                    // Swap the characters
                    defragmentedDiskMap.set(dotIndex, defragmentedDiskMap.get(i));
                    defragmentedDiskMap.set(i, ".");
                    dotIndex++;
                }
            }
        }
    }

    public void generateChecksum() {
        this.checkSum = "";
    }

    private void appendTimes(String charPosition, int value) {
        for (int i = 0; i < value; i++) {
            blockView.add(charPosition);
        }
    }

    private static boolean isEven(int charPosition) {
        return charPosition % 2 == 0;
    }
}