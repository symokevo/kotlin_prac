class BirthdayCake {
    fun main() {
        val age = 24
        val layers = 5
        printCakeCandles(age)
        printCakeTop(age)
        printCakeBottom(age, layers)

    }

    fun printCakeTop(age: Int) {
        repeat(age + 2){
            print("=")
        }
        println()
    }

    fun printCakeCandles(age: Int) {
        repeat(age) {
            print(",")
        }
        println()
        print("")
        repeat(age) {
            print("|")
        }
        println()
    }

    fun printCakeBottom(age: Int, layers: Int) {
        print(" ")
        repeat(layers) {
            repeat(age + 2){
                print("@")
            }
            println()
        }
    }
}