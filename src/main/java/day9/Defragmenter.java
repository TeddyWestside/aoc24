package day9;

import lombok.Data;

import java.util.ArrayList;

@Data
public class Defragmenter {

    private ArrayList<String> blockView = new ArrayList<>();
    private ArrayList<String> defragmentedDiskMap = new ArrayList<>();
    private long checkSum;

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
            if (isNoDot(i)) {
                while (isNoDotAndSmallerThanDiskMapSize(dotIndex)) {
                    dotIndex++;
                }
                if (isNotFinishedAndInDiskMapSize(dotIndex, i)) {
                    swapPositions(dotIndex, i);
                    dotIndex++;
                }
            }
        }
    }

    public void generateChecksum() {

        for (int diskMapIndex = 0; diskMapIndex < defragmentedDiskMap.size(); diskMapIndex++) {
            if (isNoDot(diskMapIndex))
                setCheckSum(getCheckSum() + Long.parseLong(defragmentedDiskMap.get(diskMapIndex)) * diskMapIndex);
        }
    }

    private void swapPositions(int dotIndex, int i) {
        defragmentedDiskMap.set(dotIndex, defragmentedDiskMap.get(i));
        defragmentedDiskMap.set(i, ".");
    }


    private boolean isNotFinishedAndInDiskMapSize(int dotIndex, int i) {
        return isInDiskMapSize(dotIndex) && i > dotIndex;
    }

    private void appendTimes(String charPosition, int value) {
        for (int i = 0; i < value; i++) {
            blockView.add(charPosition);
        }
    }

    private boolean isNoDotAndSmallerThanDiskMapSize(int dotIndex) {
        return isInDiskMapSize(dotIndex) && isNoDot(dotIndex);
    }

    private boolean isNoDot(int dotIndex) {
        return !defragmentedDiskMap.get(dotIndex).equals(".");
    }

    private boolean isInDiskMapSize(int dotIndex) {
        return dotIndex < defragmentedDiskMap.size();
    }

    private static boolean isEven(int charPosition) {
        return charPosition % 2 == 0;
    }
}