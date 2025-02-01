class Methods{
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            val a=2
            val b=3
            println("Sum of $a and $b is ${add(2,3)}")
        }
        //method declare
        fun add(a:Int,b:Int): Int{
            return a+b
        }
    } 
}