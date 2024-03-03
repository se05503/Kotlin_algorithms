import kotlin.math.pow

class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var temp_n = n
        
        for(i in 8 downTo 0) {
            answer += temp_n/(10.0.pow(i).toInt())
            temp_n = temp_n%(10.0.pow(i).toInt())
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        println("Hello Kotlin")

        return answer
    }
}

/*
// math.pow 함수를 import 하지 않는 코드
class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        var input = n
        if(n in 1..100000000) {
            while(input!=0) {
                answer += input%10
                input /= 10
            }
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        println("Hello Kotlin")
        return answer
    }
}
*/