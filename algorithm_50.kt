fun main() {
    val num1 = "banana"
    val num2 = "foobar"
    Solution().solution(num1)
    Solution().solution(num2)
}

// 해당 알고리즘 문제는 tistory에 정리해봐도 좋을 듯
class Solution {
    fun solution(s: String): IntArray {
        require(s.length in 1..10000 && s.all {it.isLowerCase()}) {"조건에 위배됩니다"}
        var answer = intArrayOf()
        for (i in 0 until s.length) { //i = 'b'
            if (i == 0) {
                answer += -1
            } else { // i = 1 -> 2 -> 3 ...
                for (j in i - 1 downTo 0) {
                    if(j==0 && s[j] != s[i]) answer += -1 // 해당 부분이 제일 짜기 힘들었음, if else 문의 구조를 다시 생각해볼 수 있었음
                    else if (s[j] == s[i]) {
                        answer += i-j
                        break
                    } else continue
                }
            }
        }
        return answer
    }
}