interface ClickListener {
    fun onClick()
    fun onTouch() = println("touched")
}

class View (private val id: Int): ClickListener {
    override fun onClick() = println("clicked $id")
}

fun main() {
    val v = View(10)
    v.onClick()
    v.onTouch()
}
