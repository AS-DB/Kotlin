class Do_while_while{
   companion object{
    @JvmStatic
    fun main(args: Array<String>){

        //while
        var u =0
        while(u<=5){
            println(u)
            u++
        }
        // Do while
        print("DO while output:")
        var o=10
        do {
            println(o);
            o++
        }while(o==2)
    }
   } 
}