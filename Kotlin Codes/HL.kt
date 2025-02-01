//Function as Argument
fun High_order(a:()->Unit,b:(Int,Int)->Int): Unit{
    a()
    val i= b(1,3)
    println("Sum is"+i)
    }
    
    //Function as Return
fun High_order1(a:(Int,Int,Int)->Int): (Int,Int,Int)->String{
    return {x,y,z->"The sum is ${a(x, y, z)}"}
}


fun main(){
//Function as Argument
var h= {println("Hello, aditya")} //lambda function
var sum: (Int,Int)->Int= {x,y->x+y} //lambda function
High_order(h,sum)

//Function as Return
var sum1: (Int,Int,Int)->Int= {x,y,z->x+y+z} //lambda function
val output = High_order1(sum1)
println(output(1,2,3))
}
