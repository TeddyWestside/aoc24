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
        assertEquals("0..111....22222", defragmenter.getBlockView().toString());
    }

    @Test
    public void defragmenterShouldGenerateBlockViewFor2333133121414131402() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateBlockView("2333133121414131402");
        assertEquals("00...111...2...333.44.5555.6666.777.888899", defragmenter.getBlockView().toString());
    }

    @Test
    public void defragmenterShouldDefrag() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateBlockView("12345");
        defragmenter.defrag();
        assertEquals("022111222......", defragmenter.getDefragmentedDiskMap());
    }

    @Test
    public void defragmenterShouldGenerateChecksum() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateBlockView("12345");
        defragmenter.defrag();
        defragmenter.generateChecksum();
        assertEquals("022111222......", defragmenter.getDefragmentedDiskMap());
    }
}
