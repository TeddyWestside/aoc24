package day9;

import lombok.Data;

@Data
public class Defragmenter {

    private StringBuilder checksum = new StringBuilder();
    private String defragmentedDiskMap = "";

    public void generateChecksum(String diskMap) {
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
        checksum.append(charPosition.repeat(Math.max(0, value)));
    }

    private static boolean isEven(int charPosition) {
        return charPosition % 2 == 0;
    }

    public void defrag() {
        StringBuilder defragmentedChecksum = new StringBuilder(checksum);
        int dotIndex = 0;

        for (int i = defragmentedChecksum.length() - 1; i >= 0; i--) {
            if (defragmentedChecksum.charAt(i) != '.') {
                // Find the foremost dot to swap with
                while (dotIndex < defragmentedChecksum.length() && defragmentedChecksum.charAt(dotIndex) != '.') {
                    dotIndex++;
                }
                if (dotIndex < defragmentedChecksum.length() && i > dotIndex) {
                    // Swap the characters
                    defragmentedChecksum.setCharAt(dotIndex, defragmentedChecksum.charAt(i));
                    defragmentedChecksum.setCharAt(i, '.');
                    dotIndex++;
                }
            }
        }

        this.defragmentedDiskMap = defragmentedChecksum.toString();
    }
}
