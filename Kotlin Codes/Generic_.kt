class Gen<T,Y>(value: T, value1: Y){
init{
    println("The value is ${value}")
    println("The value is ${value1}")
}}

fun main(){
    println("1.")
    val G = Gen(1, "aditya")
    println("2.")
    val G1 = Gen(2.5, false)
}