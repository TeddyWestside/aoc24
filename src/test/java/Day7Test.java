import day7.EquationsSolver;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Day7Test {

    // Part 1
    @Test
    public void shouldSolveEquationWith190() {
        EquationsSolver equationsSolver = new EquationsSolver();
        assertTrue(equationsSolver.isLineSolvable(190L, new int[]{10, 19}));
    }

    @Test
    public void shouldSolveEquationWith3267() {
        EquationsSolver equationsSolver = new EquationsSolver();
        assertTrue(equationsSolver.isLineSolvable(3267L, new int[]{81, 40, 27}));
    }

    @Test
    public void shouldSolveEquationWith23() {
        EquationsSolver equationsSolver = new EquationsSolver();
        assertTrue(equationsSolver.isLineSolvable(23L, new int[]{5, 2, 13}));
    }

    @Test
    public void shouldSolveEquationWith26324383() {
        EquationsSolver equationsSolver = new EquationsSolver();
        assertTrue(equationsSolver.isLineSolvable(26324383L, new int[]{7, 9, 8, 7, 414, 471, 185, 8}));
    }

    @Test
    public void shouldSolveAllEquationsInTestFile() {
        EquationsSolver equationsSolver = new EquationsSolver();
        var sum = equationsSolver.resolveAllForFile("src/test/resources/day7/test.txt");
        assertEquals(3749L, sum);
    }

    @Test
    public void shouldSolveAllEquationsInPuzzleFile() {
        EquationsSolver equationsSolver = new EquationsSolver();
        var sum = equationsSolver.resolveAllForFile("src/main/resources/day7/list.txt");
        assertEquals(303876485655L, sum);
    }

    // Part 2
    @Test
    public void shouldSolveAllEquationsInTestFileWithConcatenationActivated() {
        EquationsSolver equationsSolver = new EquationsSolver(true);
        var sum = equationsSolver.resolveAllForFile("src/test/resources/day7/test.txt");
        assertEquals(11387L, sum);
    }

    @Test
    public void shouldSolveAllEquationsInPuzzleFileWithConcatenationActivated() {
        EquationsSolver equationsSolver = new EquationsSolver(true);
        var sum = equationsSolver.resolveAllForFile("src/main/resources/day7/list.txt");
        assertEquals(11387L, sum);
    }
}
