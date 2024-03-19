import kotlin.math.pow

fun main() {
    val n = readLine()!!.toInt()
    println(solution(n))
}

fun solution(n: Int): Int {
    require(n in 1..100000000) { "n은 1과 100000000 사이의 수여야 합니다!" }
    var answer: Int = 0
    var str = ""
    var num = n
    var res = 0
    var i: Double = 0.0
    while (Math.pow(3.0, i) <= num) {
        i++ 
    }
    i-- // 3
    while (i >= 0) {
        str += num / Math.pow(3.0, i).toInt()
        res = (num % Math.pow(3.0, i)).toInt()
        num = res
        i--
    }
    str = str.reversed()
    var len = str.length - 1 // 3
    for (element in str) {
        answer += element.toString().toInt() * 3.0.pow(len.toDouble()).toInt() // char을 바로 int로 바꾸는 것은 불가능하다. char → String → Int 로 바꿔야한다!
        len--
    }
    return answer
}