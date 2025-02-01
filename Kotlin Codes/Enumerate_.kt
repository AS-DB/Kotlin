enum class Days(var holiday:Boolean = false){
    Sunday(true),
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday;
}

enum class Planet(var position:Int){
    Mercury(1),
    Venus(2),
    Earth(3),
    Mars(4);

    fun data(){
        print("Planet name :${name} and its position ${position}")
    }
}
fun main(){
    println("Today is:"+ Days.Friday)

    for(day in Days.values()){
        if(day.holiday){
            println(day)
        }
    }
}