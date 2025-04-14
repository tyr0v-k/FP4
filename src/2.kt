fun main() {
    var a = readln().toInt()
    var b = (1..9).random()
    while(a != b){
        print("Не угадал!")
        a = readln().toInt()
        b = (1..9).random()
    }
}