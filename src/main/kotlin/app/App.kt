package app

class App {
	companion object {
		@JvmStatic
		fun main(args: Array<String>) {
			val board = Board(5, 5)
			println(board.hIndicator)
		}
	}
}
