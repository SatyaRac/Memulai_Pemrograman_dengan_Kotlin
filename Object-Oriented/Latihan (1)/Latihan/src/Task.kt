// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false

    fun getsleep() : Boolean{
        println("Fungsi getter dipanggil")
        return sleep
    }
    fun setsleep(){
        println("Fungsi setter dipanggil")
        sleep = false;
    }

    fun toSleep() {
        when(sleep){
            true -> println("$name, sleep! ")
            false -> println("$name, let's play")
        }

    }


}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.getsleep()
    gippy.toSleep()
    gippy.setsleep()
    gippy.getsleep()
    gippy.sleep = true
    gippy.toSleep()
}