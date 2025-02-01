class Constructor2{
   init {
    println("hello")
   }

   constructor(a:Int,b:Int){
    println("Sum of two number is:"+(a+b))
   }
   constructor(a:Int,b:Int,c:Int){
    println("Sum of three number is:"+(a+b+c))
   }
}

fun main(){
 var c2= Constructor2(1, 2)
 var c1 = Constructor2(1,2,3)
 
}  