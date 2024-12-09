import day9.Defragmenter;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day9Test {

    @Test
    public void defragmenterShouldExist() {
        Defragmenter defragmenter = new Defragmenter();
    }

    @Test
    public void defragmenterShouldGenerateCheckSum() {
        Defragmenter defragmenter = new Defragmenter();
        defragmenter.generateChecksum("12345");
        assertEquals("0..111....22222", defragmenter.getChecksum().toString());
    }
}
