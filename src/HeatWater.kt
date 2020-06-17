class HeatWater(name: String, time: Int, temp: Int, day: String, wear: String) : Robot(name, time, day, temp, wear) {
    val today = "monday"
    fun printingStatement(temp: Int) {
        if (today.equals(day)) {
            println("You must bath daily but today is you set not to bath")
        } else {
            println("your water is ready for bath of temp: $temp")
        }
    }
}