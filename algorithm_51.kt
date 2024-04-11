fun main() {
    val num1 = intArrayOf(1, 3, 4, 6)
    val num2 = intArrayOf(1, 7, 1, 2)
    Solution().solution(num1)
    Solution().solution(num2)
}

/*
문제의 핵심
1. string 대신 StringBuilder를 사용하기
2. 문자열 인덱스를 앞이 아닌 뒤에서부터 참조하기
3. 문자열 맨 앞에 문자를 넣을때는 StringBuilder의 insert 메소드 사용하기 (뒤에서 넣을때는 append 사용)
 */

class Solution {
    fun solution(food: IntArray): String {
        var temp = StringBuilder()
        temp.append(0)
        for (i in food.size - 1 downTo 1) {
            if (food[i] % 2 == 1) {
                // 홀수
                val n = food[i]/2 //1 각 사람이 2개씩 먹는다
                for(j in 0 until n) {
                    temp.insert(0,i) // index=0 위치에 추가
                    temp.append(i)
                }
            } else {
                // 짝수
                val n = food[i]/2
                for(j in 0 until n) {
                    temp.insert(0,i) // index=0 위치에 추가
                    temp.append(i)
                }
            }
        }
        // temp = "22333033322"
        return temp.toString()
    }
}