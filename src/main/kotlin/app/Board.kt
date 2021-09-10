package app

class Board(val width: Int, val height: Int) {

	val cipher: CharArray = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray()

	val vIndicator: Array<String>
	get() = Array(height) { it -> (it + 1).toString() }

	val hIndicator: Array<String>
	get() {
		val indicators: MutableList<String> = mutableListOf<String>()

		for (i in 1..width) {
			var label = computeLabel(i)
			indicators.add(label.reversed())
		}
		return indicators.toTypedArray<String>()
	}

	fun computeLabel(pos: Int): String {
		var label: String = ""
		var position: Int = pos
		while (position != 0) {
			var remainder: Int = position % cipher.size
			position /= cipher.size
			if (position == 1 && remainder == 0) {
				remainder = cipher.size
				position = 0
			}
			if (remainder > 0) {
				label += cipher.get(remainder - 1)
			}
		}
		return label.reversed()
	}
}
