class Triple_pair{
    companion object{
     @JvmStatic
     fun main(args: Array<String>){

        //Pairs
        var (a,b)= Pair("Adi",20)
        println(a+b)
       
        var c= Pair(2, "Aditya")
        println(c.first)

        var d= Pair("Aditya",Pair("Das",902))
        println(d.second.second)

        //Triple
        var (e,f,g) = Triple(12, false, "Aditya")
        print(" $e $f $g")
     }
    } 
 }