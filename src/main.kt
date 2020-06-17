fun main() {
    println("Hey!My name is Chitti and I am your robot.Today is Monday")
    println("Set alarm for Wakeup and input must be integer type")
    val time = Integer.valueOf(readLine())
    println("Set your Off Day")
    val day = readLine()!!
    println("Set temperature of water to bath,must be of Integer type")
    val temp = Integer.valueOf(readLine())
    println("What you want to wear and i make ready for you(Input must be String type)")
    val wear = readLine()!!
    println("press 1 for Ring the alarm")
    println("press 2 for Make coffee")
    println("press 3 for Heat the water")
    println("press 4 for pack your bag")
    println("press 5 Cook breakfast and Lunch")
    println("press 6 for Iron the clothes")

    var robot = Robot("Chitti", time, day, temp, wear)
    var coffee = Coffee("black", 2)


    var num = Integer.valueOf(readLine())
    when (num) {
        1 ->
            robot.robotAlarm()

        2 ->
            print("your coffee is ready with $coffee ")
        3 -> robot.robotHeatWater()
        4 -> robot.robotPackBag()
        5 -> robot.robotCookFood()
        6 -> robot.robotIronClothes()
        else-> println("Wrong Input")
    }
}