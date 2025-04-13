fun main() {
    while(true){
        if (readln().toInt() == (1..9).random()) break else println("Не угадал!")
    }
}