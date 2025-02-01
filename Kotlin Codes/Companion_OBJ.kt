class Companion_OBJ{
var i=10
fun sum(A:Int,B:Int):Int{
    return A+B
}

companion object{
    var j= 12
    fun hello(){
        print("hello")
    }
}}

fun main(){
var t= Companion_OBJ()
print("Inside the class:"+t.i)
print("Inside the Companion Object:"+Companion_OBJ.j)
}

