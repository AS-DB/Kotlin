class If_else_When{
    companion object{
        @JvmStatic
        fun main(args: Array<String>){
            var a= 12
            if(a<11){
                println("less then 11")
            }
            else{
                println("More than 11")
            }

            //When Statement
            var animal="dog"
            when(animal){
                "Cat"->println("It's an cat")
                "dog"->println("It's an dog")
                else -> println("NOt found the animal")
            }
        }
    }
}