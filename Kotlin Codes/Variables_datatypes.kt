class Variables_datatypes{
    companion object{
        @JvmStatic
        fun main(args :Array<String>){

            //Integer datatype
            var i1 =3 //int datatype implicit declaration
            var i7: Long=312 //long data type explicit declaration
            val i3= 12.12
            var i5= "aditya"
            println(i1+i7+i3) //it will not throw any error
            println(i1+i7+i3+i5) //it will through error cause String and int or float datatype can't be concate
        }
    }
}