package com.example.lab3_dice

/*
k = 최고 점수
m = 한 상자당 사과 개수
[문제 풀이 시도]
- 배열을 쓸지 리스트를 쓸지 고민이 되어서 공부를 한 후에 var boxes = mutableListOf<List<Int>>() 을 생성했는데
결국엔 쓸 필요가 없어서 삭제했다.
- 매개변수 중 k는 쓸 필요가 없는 것 같다.
- while 문 조건을 생각하는게 조금 까다로웠다.
 */

fun main() {
    Solution().solution(3, 4, intArrayOf(1, 2, 3, 1, 2, 3, 1)) // result = 8
    Solution().solution(4, 3, intArrayOf(4, 1, 2, 2, 4, 4, 4, 4, 1, 2, 4, 2))
}

class Solution {
    fun solution(k: Int, m: Int, score: IntArray): Int {
        require(
            k in 3..9 && m in 3..10 && score.size in 7..1000000 &&
                    score.all {
                        it in 1..k
                    }
        )
        var answer = 0
        var price: Int
        score.sort()
        var index = score.lastIndex
        while (index - m + 1 >= 0) {
            val box = score.slice(index - m + 1..index)
            index -= m
            price = box[0] * box.size
            answer += price
        }
        return answer
    }
}