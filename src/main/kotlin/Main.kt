fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")

    val spiceObj = SimpleSpice()
    println("Spice name: ${spiceObj.spiceName}")
    println("Spice heat: ${spiceObj.heat}")

    val listOfSpices = listOf<Spice>(Spice("curry", "mild"), Spice("hola", "hot"))
}