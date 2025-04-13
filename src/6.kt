fun main() {
    var i = 5
    var res = 0
    while(i <= 57){
        if(i!=34 && i!=46 && i!=52){
            res += i
        }
        i++
    }
    println(res)
}