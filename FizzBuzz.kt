
fun main() {
    for (i in 1..100) {
        var y = True
        var f = ""
        if (i/3 == 0) {
            f = f.plus("Fizz")
        } 

        if (i/5 == 0) {
            f = f.plus("Buzz")
        }

        if y {
            print(i)
        } else {
            print(f)
        }
    }
}