open class Parent_A{
var name="ADI"
fun sum(A:Int, B:Int):Int{
  return A+B  
}}

class Child_B : Parent_A(){
var i:Int=21
}

fun main(){
    var h = Child_B()
    print(h.i)
    print("Sum of 4 and 5 is:"+ h.sum(4, 5))
}