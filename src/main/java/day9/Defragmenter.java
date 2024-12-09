package day9;

import lombok.Data;

@Data
public class Defragmenter {

    private StringBuilder blockView = new StringBuilder();
    private String defragmentedDiskMap = "";
    private String checkSum = "";

    public void generateBlockView(String diskMap) {
        for (int charPosition = 0; charPosition < diskMap.length(); charPosition++) {
            int value = Character.getNumericValue(diskMap.charAt(charPosition));
            if (isEven(charPosition)) {
                appendTimes(String.valueOf(charPosition / 2), value);
            } else {
                appendTimes(".", value);
            }
        }
    }

    private void appendTimes(String charPosition, int value) {
        blockView.append(charPosition.repeat(Math.max(0, value)));
    }

    private static boolean isEven(int charPosition) {
        return charPosition % 2 == 0;
    }

    public void defrag() {
        StringBuilder defragmentedBlockView = new StringBuilder(blockView);
        int dotIndex = 0;

        for (int i = defragmentedBlockView.length() - 1; i >= 0; i--) {
            if (defragmentedBlockView.charAt(i) != '.') {
                // Find the foremost dot to swap with
                while (dotIndex < defragmentedBlockView.length() && defragmentedBlockView.charAt(dotIndex) != '.') {
                    dotIndex++;
                }
                if (dotIndex < defragmentedBlockView.length() && i > dotIndex) {
                    // Swap the characters
                    defragmentedBlockView.setCharAt(dotIndex, defragmentedBlockView.charAt(i));
                    defragmentedBlockView.setCharAt(i, '.');
                    dotIndex++;
                }
            }
        }

        this.defragmentedDiskMap = defragmentedBlockView.toString();
    }

    public void generateChecksum() {
        this.checkSum = "";
    }
}
