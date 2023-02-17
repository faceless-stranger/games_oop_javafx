package ru.job4j.chess.firuges.black;

import org.junit.jupiter.api.Test;
import ru.job4j.chess.firuges.Cell;
import ru.job4j.chess.firuges.Figure;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class BishopBlackTest {

    @Test
    void testPosition() {
        BishopBlack positionTest = new BishopBlack(Cell.A1);
        Cell expected = Cell.A1;
        Cell rsl = positionTest.position();
        Assertions.assertEquals(expected, rsl);
    }

    @Test
    void testCopy() {
        BishopBlack bishopBlack = new BishopBlack(Cell.A1);
        Figure newBishopBlack = bishopBlack.copy(Cell.A2);
        Cell expected = Cell.A2;
        Cell rsl = newBishopBlack.position();
        Assertions.assertEquals(expected, rsl);
    }

    @Test
    void testWay() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        Cell[] rsl = bishopBlack.way(Cell.G5);
        Cell[] expected = new Cell[]{Cell.D2, Cell.E3, Cell.F4, Cell.G5};
        Assertions.assertArrayEquals(expected, rsl);
    }

    @Test
    void testIsDiagonal() {
        BishopBlack bishopBlack = new BishopBlack(Cell.C1);
        boolean rsl = bishopBlack.isDiagonal(Cell.C1, Cell.E4);
        Assertions.assertFalse(rsl);

    }
}