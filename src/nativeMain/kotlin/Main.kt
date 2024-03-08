import platform.posix.sleep
import kotlin.math.roundToInt

fun main() {
    var time = 1
    fun dad() {
        fun timeElapsed(): String { // WIP
            var t = time
            var hours = 0
            var days = 0
            var weeks = 0
            var months = 0
            var years = 0

            while (t > 0) {
                if (t >= 8760) {
                    t -= 8760
                    years++
                } else if (t >= 730) {
                    t -= 730
                    months++
                } else if (t >= 168) {
                    t -= 168
                    weeks++
                } else if (t >= 24) {
                    t -= 24
                    days++
                } else if (t < 24) {
                    hours = t
                    t = 0
                }
            }

//            if(time < 24) {
//                hours = time
//            }
//            else if(time >= 24/* && time <= (24*7)*/) {
//                days = (time/24f).toString()[0].toInt()
//                hours = time - (((time/24f).toString()[0].toInt())*24)
//            }
//            else if(time >= (24*7) && time <= ((24*7)*4)) {
//                weeks =
//                days = (time/24f).toString()[0].toInt()
//                hours = time - (((time/24f).toString()[0].toInt())*24)
//            }
            return "${if (years != 0) "$years years, " else ""}${if (months != 0) "$months months, " else ""}${if (weeks != 0) "$weeks weeks, " else ""}${if (days != 0) "$days days, " else ""}${if (years != 0 || months != 0 || weeks != 0 || days != 0) "and " else ""}$hours hours"
        }

        val storeItems =
            arrayOf(
                "cookie dough", "book", "bacon", "batteries", "fruit", "a new life", "cheese", "expired eggs",
                "dog toy", "nuclear missile", "another toy", "chocolate", "orange juice", "gift cards"
            )

        sleep(2)
        println("Dad is searching for the milk... (time elapsed: ${timeElapsed()}) ")
        time++

        if (storeItems.random() == "milk") {
            println("Dad has found the milk. ")
            sleep(2)
            println("Dad has left the store and is returning home with the milk. ")
            println(readlnOrNull()) // don't close program until there is user input.
        } else {
            dad()
        }
    }
    sleep(1)
    println("\n\nDad.exe is running.\n")
    sleep(3)
    println("Dad has left to get the milk.")
    sleep(1)
    println("Dad will come back when he has found the milk.")
    sleep(2)
    dad()
}