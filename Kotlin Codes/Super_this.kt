open class car{
    fun color(){
        var g:String= "Red"
    }
    open fun speed():Int{
    var speed =150
    return speed
    }
}
class Tesla:car(){

    override fun speed(): Int{
        return super.speed()*2
    }
    var color="BLACK"
    fun color1(){
        var color ="Blue"
        println("Value from class variable ${color}")
        println("Value from class variable ${this.color}")
    }
}
fun main(){
var t = Tesla()
t.color1()
}