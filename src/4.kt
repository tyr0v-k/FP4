fun main() {
    var even = 0
    var odd = 0
    for (i in readln()){
        if (i.digitToInt() % 2 == 0) even++ else odd++
    }
    println("Четных: $even, нечетных: $odd")
}