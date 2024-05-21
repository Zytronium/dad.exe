import platform.posix.sleep

fun main() {
    var time = 1
    fun dad() {
        fun timeElapsed(): String {
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
            return "${if (years != 0) "$years year${if (years != 1) "s" else ""}, " else ""}${if (months != 0) "$months month${if (months != 1) "s" else ""}, " else ""}${if (weeks != 0) "$weeks week${if (weeks != 1) "s" else ""}, " else ""}${if (days != 0) "$days day${if (days != 1) "s" else ""}, " else ""}${if (years != 0 || months != 0 || weeks != 0 || days != 0) "and " else ""}$hours hour${if (hours != 1) "s" else ""}"
        }
        fun timeElapsedShort(): String {
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

            return "${
                if (years != 0) "$years year${if (years != 1) "s" else ""}" else if (months != 0) "$months month${if (months != 1) "s" else ""}" else if (weeks != 0) "$weeks week${if (weeks != 1) "s" else ""}" else if (days != 0) "$days day${if (days != 1) "s" else ""}" else "$hours hour${if (hours != 1) "s" else ""}"
            }"
        }
        fun returnWithMilk() {
            println("Dad has left the store and is returning home with the milk.")
            sleep(3u)
            print("Dad: ")
            sleep(1u)
            println("\"I'm home! I finally found the milk!\"")
            sleep(1u)
            print("You: ")
            sleep(1u)
            print("\" .")
            sleep(1u)
            print(".")
            sleep(1u)
            print(".")
            sleep(2u)
            print(" What? DAD!? ")
            sleep(1u)
            println("IT'S BEEN ${timeElapsedShort().uppercase()}! \"")
            sleep(3u)
            println("\n T H E    E N D ")
            sleep(12u)
            println(readlnOrNull()) // don't close program until there is user input.
        }
        val storeItems =
            arrayOf(
                "cookie dough", "book", "bacon", "batteries", "fruit", "a new life", "a new family", "cheese", "large cow",
                "expired eggs", "dog toy", "nuclear missile", "another toy", "chocolate", "orange juice", "gift cards"
            )

        sleep(2u)
        println("Dad is searching for the milk.. (time elapsed: ${timeElapsed()}) ")
        time++

        if (storeItems.random() == "milk") {
            println("\nDad has found the milk.\n")
            sleep(2u)
            returnWithMilk()
        } else {
            dad()
        }
    }
    sleep(1u)
    println("Dad.exe is running.")
    sleep(2u)
    println("Dad has left to get the milk.")
    sleep(1u)
    println("Dad will come back when he has found the milk.")
    sleep(2u)
    dad()
}
