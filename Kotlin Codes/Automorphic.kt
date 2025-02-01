import java.util.Scanner
fun main(){
    var s = Scanner(System.`in`)
    println("Enter the number:")
    var g= s.nextInt()
    var len= g.toString().length
    var rem= Math.pow(10.0,len.toDouble())
    
    var temp:Double=(g*g)%rem

    if(g==temp.toInt()){
        print("Yes")
    }
    else{
        print("NO")
    }
    
}