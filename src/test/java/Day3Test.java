import day3.MultiplicationParser;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Day3Test {

    public static final String TEST_PATH = "src/test/resources/day3/test.txt";
    public static final String TEST2_PATH = "src/test/resources/day3/test2.txt";
    public static final String PUZZLE_PATH = "src/main/resources/day3/list.txt";
    public static final String PUZZLE2_PATH = "src/main/resources/day3/list2.txt";

    // Part 1
    @Test
    public void shouldParseFileAndAddProductForTest() {
        MultiplicationParser multiplicationParser = new MultiplicationParser();
        var result = multiplicationParser.parseAndAddProducts(TEST_PATH);
        assertEquals(161, result);
    }

    @Test
    public void shouldParseFileAndAddProductForPuzzle() {
        MultiplicationParser multiplicationParser = new MultiplicationParser();
        var result = multiplicationParser.parseAndAddProducts(PUZZLE_PATH);
        assertEquals(183669043, result);
    }

    // Part 2
    @Test
    public void shouldParseFileAndAddProductWithDontForTest() {
        MultiplicationParser multiplicationParser = new MultiplicationParser();
        var result = multiplicationParser.parseAndAddProducts(TEST2_PATH);
        assertEquals(48, result);
    }
    @Test
    public void shouldParseFileAndAddProductWithDontForPuzzle() {
        MultiplicationParser multiplicationParser = new MultiplicationParser();
        var result = multiplicationParser.parseAndAddProducts(PUZZLE2_PATH);
        assertEquals(59097164, result);
    }
}
