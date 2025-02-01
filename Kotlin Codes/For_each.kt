class For_each{
    companion object{
    @JvmStatic
    fun main(args: Array<String>){
         // .. 
         for(i in 1..5){
            println(i)
         }

         //until
         for(i in 1..5){
            println(i)
         }

         //Decrement
         for(i in 5 downTo 1 ){
            print(i)
         }

         //Step
         for(i in 1..10 step 2){
            print(i)
         }

         //Array element access
         var a1 = ArrayList<Int>()
         a1.add(1)
         a1.add(2)
         a1.add(3)
         a1.add(4)
         a1.add(5)
         a1.add(6)

         for(i in a1){
            print("value: ${i}")
         }
    }
}}