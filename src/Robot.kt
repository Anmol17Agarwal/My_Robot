open class Robot(var name: String, var time: Int, var day: String, val temp: Int, val wear: String) {

    fun robotAlarm() {
        var alarm = Alarm(name, time, day, temp, wear)

        if (alarm.today.equals(day)) {
            alarm.noRingAlarm()
        } else {
            alarm.ringAlarm(time)
        }
    }

    fun robotHeatWater() {
        val heatWater = HeatWater(name, time, temp, day, wear)
        heatWater.printingStatement(temp)
    }

    fun robotPackBag() {
        var packBag = PackBag(name, day, time, temp, wear)
        packBag.timetable(day)
    }

    fun robotCookFood() {
        var listOfBreakfast = mutableListOf<String>("Pasta", "burger", "pizza", "hotdog", "Microni")
        var listOfLunch =
            mutableListOf<String>("Rajastani Thali", "South Indian Thali", "Gujrati Thali", "Northeast Thali")
        println("Your food is cooked,today for breakfast ${listOfBreakfast.random()} and for lunch ${listOfLunch.random()} for you..!!")
    }

    fun robotIronClothes() {
        println("Your cloth is ready and Ironed-> $wear")
    }
}