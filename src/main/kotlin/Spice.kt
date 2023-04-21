class Spice(var name: String, var spiciness: String = "mild") {
    val heat: Int
        get() =  when(spiciness){
                "mild" -> 5
                "hot" -> 8
            else -> {0}
        }
    init {
        println("Spice name: $name and spiciness: $spiciness")
    }
fun makeSalt(): Spice = Spice(name = "Salt", spiciness = "mild")
}