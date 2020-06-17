class PackBag(name: String, day: String, time: Int, temp: Int, wear: String) : Robot(name, time, day, temp, wear) {
    var monday = arrayListOf<String>("history", "geography", "physics")
    var wednesday = arrayListOf<String>("history", "geography", "physics")
    var friday = arrayListOf<String>("history", "geography", "physics")
    fun timetable(day: String) {
        if (day.compareTo("monday") == 0) {
            println("Your todays backpack is $monday")
        }
        if (day.compareTo("wednesday") == 0) {
            println("Your todays backpack is $wednesday")
        }
        if (day.compareTo("friday") == 0) {
            println("Your todays backpack is $friday")
        } else {
            println("Today is a holiday")
        }
    }
}
