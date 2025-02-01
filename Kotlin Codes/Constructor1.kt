class Constructor1(A:String,B:Int){
    var A1= A
    var B1= B
    
    init{
        println("Hello $A1 you are $B1 years old...")
    }
    fun sum():Int{
        return B1+B1
    }
}

fun main(){
 var c1 = Constructor1("Aditya",20)
    print(c1.sum())
}  