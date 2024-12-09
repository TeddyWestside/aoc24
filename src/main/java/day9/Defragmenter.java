package day9;

import lombok.Data;

@Data
public class Defragmenter {

    private StringBuilder checksum = new StringBuilder();

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

    public void defrag() {

    }

    private void appendTimes(String charPosition, int value) {
        checksum.append(charPosition.repeat(Math.max(0, value)));
    }

    private static boolean isEven(int charPosition) {
        return charPosition % 2 == 0;
    }
}
