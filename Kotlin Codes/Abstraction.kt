abstract class Abstruct_01{

    //Non-Abstruct and variable
var name: String= "Aditya"
fun sum(A:Int,B: Int){
    print(A+B)
}
    //Abstruct method and variable
    abstract var name1: String
    abstract fun mul(a:Int,b:Int):Int
}

class A1: Abstruct_01(){
override var name1 ="Adi"
override fun mul(A:Int,B:Int):Int{
    return A*B
}}

fun main(){
var b= A1()
b.sum(2, 3)
println(b.mul(2, 3))
}