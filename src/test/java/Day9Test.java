import day9.Defragmenter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day9Test {

    @Test
    public void defragmenterShouldExist() {
        Defragmenter defragmenter = new Defragmenter();
    }

    @Test
    public void defragmenterShouldGenerateBlockView() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateBlockView("12345");
        assertEquals("[0, ., ., 1, 1, 1, ., ., ., ., 2, 2, 2, 2, 2]", defragmenter.getBlockView().toString());
    }

    @Test
    public void defragmenterShouldGenerateBlockViewFor2333133121414131402() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateBlockView("2333133121414131402");
        assertEquals("[0, 0, ., ., ., 1, 1, 1, ., ., ., 2, ., ., ., 3, 3, 3, ., 4, 4, ., 5, 5, 5, 5, ., 6, 6, 6, 6, ., 7, 7, 7, ., 8, 8, 8, 8, 9, 9]", defragmenter.getBlockView().toString());
    }

    @Test
    public void defragmenterShouldDefrag() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateBlockView("12345");
        defragmenter.defrag();
        assertEquals("[0, 2, 2, 1, 1, 1, 2, 2, 2, ., ., ., ., ., .]", defragmenter.getDefragmentedDiskMap().toString());
    }

    @Test
    public void defragmenterShouldGenerateChecksum() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateBlockView("12345");
        defragmenter.defrag();
        defragmenter.generateChecksum();
        assertEquals("[0, 2, 2, 1, 1, 1, 2, 2, 2, ., ., ., ., ., .]", defragmenter.getDefragmentedDiskMap().toString());
    }
}
