class Alarm(name: String, time: Int, day: String, temp: Int, wear: String) : Robot(name, time, day, temp, wear) {
    val today = "monday"
    fun noRingAlarm() {
        println("Alarm will not ring today")
    }

    fun ringAlarm(time: Int) {
        println("Ringing alarm!!!,its $time")
    }
}