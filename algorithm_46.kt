val map1 = mapOf("one" to "1", "two" to "2", "three" to "3", "four" to "4", "five" to "5",
    "six" to "6", "seven" to "7", "eight" to "8", "nine" to "9", "zero" to "0")

fun main() {
    val s1 = "one4seveneight" // 반환값: 1478
    val s2 = "3four5six7" // 반환값: 234567
    val s3 = "0three45sixseven" // 반환값: 234567
    val s4 = "123" // 반환값: 123

    val object1 = Solution()
    println(object1.solution(s1))
    println(object1.solution(s2))
    println(object1.solution(s3))
    println(object1.solution(s4))
}

class Solution {
    var result:Int = 0
    fun solution(s: String): Int {
        require(s.length in 1..50) {"s의 길이는 1이상 50이하입니다."}
        if(s.startsWith("zero")||s.startsWith("0")) throw IllegalArgumentException("0이나 zero로 시작하면 안됩니다")
        var answer = s // answer = "one4seveneight" -> "14seveneight"
        for(i in map1.keys) { // i : "one" -> "two" -> "three" ..
            if(answer.contains(i)) {
                answer = answer.replace(i, map1[i] ?:"-1")
            }
        }
        result = answer.toInt()
        return result
    }
}