interface Cal {
    var number: Int
    fun add(a: Int, b: Int): Int
    fun sub(a: Int, b: Int): Int
}

interface cal1{
    fun div(a: Int, b: Int): Int
    fun mul(a: Int, b: Int): Int
}

class A : Cal,cal1 {
    override var number: Int = 12

    override fun add(a: Int, b: Int): Int {
        return a + b
    }
    override fun sub(a: Int, b: Int): Int {
        return a - b
    }
    override fun mul(a: Int, b: Int): Int {
        return a*b
    }
    override fun div(a: Int, b: Int): Int {
        if (b!=0){
            return a/b
        }
        else{
            throw Exception("Not divisible")
        }
    }
}

fun main() {
    val obj = A()
    println("Number: ${obj.number}")
    println("Addition: ${obj.add(10, 5)}")
    println("Subtraction: ${obj.sub(10, 5)}")
}
