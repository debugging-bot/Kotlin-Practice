interface ClickListener {
    fun onClick()
}

object ClickListenerImpl: ClickListener {
    override fun onClick() = println("clicked")
}

fun setClickListener(listener: ClickListener) = listener.onClick()

class Touch () {
    val objectNums: Int
    	get() = num
    
    init {
        num++
    }
    
    companion object {
        var num: Int = 0
    }
}

fun main() {
    setClickListener(ClickListenerImpl)
    
    setClickListener(object: ClickListener{
        override fun onClick() = println("clicked2")
    })
	
    Touch()
    Touch()
    println(Touch().objectNums)
}
