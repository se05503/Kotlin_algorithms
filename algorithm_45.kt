fun main() {
    var s1 = "AB"
    var s2 = "z"
    var s3 = "a B z"
    val object1 = Solution()
    println(object1.solution(s1,26))
    println(object1.solution(s2,1))
    println(object1.solution(s3,4))
}

class Solution {
    fun solution(s: String, n: Int): String { // s = "AB"
        require(s.length in 1 .. 8000 && n in 1..25) {"조건 위반"}
        var answer = ""
        for (element in s) {
            var ascill = element.code // 65
            if (element == ' ') {
                answer += ascill.toChar()
            } else if (element == 'z') {
                ascill = 'a'.code + n-1 //a
                answer += ascill.toChar()
            } else {
                ascill += n
                answer += ascill.toChar()
            }
        }
        return answer
    }
}