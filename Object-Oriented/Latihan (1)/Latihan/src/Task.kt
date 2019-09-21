// TODO 1
class Cat(private val name: String) {
    var sleep: Boolean = false

    fun toSleep() {
        println()
    }


}

fun main() {

    // TODO 2
    val gippy = Cat("Gippy")

    gippy.toSleep()
    gippy.sleep = true
    gippy.toSleep()
}