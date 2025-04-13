fun main() {
    val i = readln().toInt()
    for (j in (1..i)){
        print(if(i % j == 0){"$j${if(j != i){", "}else{""}}"}else{""})
    }
}