import sun.java2d.ReentrantContextProviderTL

data class Person(val name: String, var age: Int? = null)



fun main(args: Array<String>){
    val personList = listOf(
     Person("john",20), Person("ada"), Person("AA",12)
    )
    var oldest = personList.maxBy{it.age?:0}
    println(oldest)

    println(max(1,2))

    val r1 = Rectangle(41,43)
    println(r1.width)
    println(r1.height)
    println(r1.isSquare)

    val r2 = Rectangle(15)
    println(r2.isSquare)

    println(getMnemonic(Color.BLUE))
    println(getWarmth(Color.ORANGE))

}

fun max(num1: Int, num2: Int): Int?{
    val nums = listOf(num1,num2)
    return nums.max()
}

class Rectangle(var width: Int, var height: Int = 15){
    val isSquare: Boolean
        get() = width == height
}

enum class Color{
    RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET

}

fun getMnemonic(color: Color):String{
    when (color){
        Color.RED -> return "Richard"
        Color.ORANGE -> return "Of"
        Color.YELLOW -> return "York"
        Color.GREEN -> return "Gave"
        Color.BLUE -> return "Battle"
        Color.INDIGO -> return "In"
        Color.VIOLET -> return "Vain"
    }
}

fun getWarmth(color: Color):String{
    when (color){
        Color.RED, Color.ORANGE, Color.YELLOW -> return "warm"
        Color.GREEN -> return "neutral"
        else -> return "cold"
    }
}
