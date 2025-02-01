fun main(){
    val sqr :(Int) -> Int ={x->x*x}
    print(sqr(5))

    val name: (String)-> Unit= {y->println("hi"+y)}
    println(name("Aditya"))
}


