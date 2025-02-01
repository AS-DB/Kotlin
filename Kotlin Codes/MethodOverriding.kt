open class Parent{
    open fun sum(A:Int, B:Int):Int{
      return A+B  
    }}
    
    class Child: Parent(){
        override fun sum(A:Int,B:Int):Int{
            var m= super.sum(A, B)*2
            return m
        }}
    
    fun main(){
        var h = Child_B()
        print(h.i)
        print("Sum of 4 and 5 is:"+ h.sum(4, 5))
    }