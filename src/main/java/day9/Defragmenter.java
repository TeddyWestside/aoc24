package day9;

import lombok.Data;
import java.util.ArrayList;

@Data
public class Defragmenter {

    private ArrayList<String> blockView = new ArrayList<>();
    private String defragmentedDiskMap = "";
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
        ArrayList<String> defragmentedBlockView = new ArrayList<>(blockView);
        int dotIndex = 0;

        for (int i = defragmentedBlockView.size() - 1; i >= 0; i--) {
            if (!defragmentedBlockView.get(i).equals(".")) {
                // Find the foremost dot to swap with
                while (dotIndex < defragmentedBlockView.size() && !defragmentedBlockView.get(dotIndex).equals(".")) {
                    dotIndex++;
                }
                if (dotIndex < defragmentedBlockView.size() && i > dotIndex) {
                    // Swap the characters
                    defragmentedBlockView.set(dotIndex, defragmentedBlockView.get(i));
                    defragmentedBlockView.set(i, ".");
                    dotIndex++;
                }
            }
        }

        this.defragmentedDiskMap = String.join("", defragmentedBlockView);
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