package app

import org.junit.Test
import kotlin.test.assertEquals
import kotlin.test.assertContentEquals

class BoardTest {

    @Test
    fun initBoardTest() {
			val board = Board(1, 2)
			assertEquals(board.width, 1)
			assertEquals(board.height, 2)
    }

    @Test
    fun vIndicatorsTest() {
			val board = Board(5, 5)
			assertContentEquals(arrayOf<String>("1", "2", "3", "4", "5"), board.vIndicator)
    }

    @Test
    fun hIndicatorsTest() {
			val board = Board(5, 5)
			assertContentEquals(arrayOf<String>("A", "B", "C", "D", "E"), board.hIndicator)
    }

    @Test
    fun computeLabelTest() {
        val board = Board(1, 1)
        assertEquals("Z", board.computeLabel(26))
        assertEquals("AA", board.computeLabel(27))
        assertEquals("AB", board.computeLabel(28))
        assertEquals("ZD", board.computeLabel(680))
    }
}
