class OBJ_CREATION{
    var a= 10
    fun add(A:Int,B:Int):Int{
        return A+B
    }
}

fun main(){
var a1 = OBJ_CREATION()
println(a1.a)
var (j,m)= Pair(2,3)
println("Sum of $j,$m is ${a1.add(j,m)}")
}  