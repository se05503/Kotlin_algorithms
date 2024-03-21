fun main() {
    println(solution(intArrayOf(-2, 3)))
    println(solution(intArrayOf(-3, -2, -1, 0, 1, 2, 3, 10000)))
    println(solution(intArrayOf(-1, 1, -1, 1)))
}

fun solution(number: IntArray): Int {
    var answer: Int = 0
    try {
        require(number.size in 3..13 && number.all { it in -1000..1000 })
        for (i in 0 until number.size - 2) {
            for (j in i + 1 until number.size - 1) {
                for (k in j + 1 until number.size) {
                    if (number[i] + number[j] + number[k] == 0) {
                        answer++
                    }
                }
            }
        }
    } catch (e: Exception) {
        println("조건이 충족되지 않습니다!!!")
    }
    return answer
}












