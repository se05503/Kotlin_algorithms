/*
첫번째 내 풀이(프로그래머스 통과X)
fun main() {
    Solution().solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200))
    Solution().solution(4, intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000))
}


알고리즘을 풀면서 느낀점
1. 어떤 콜렉션을 써야할지 고민이 들었다 (각 콜렉션마다의 차이, 특히 array와 list의 차이를 알 필요성이 있었다)
2. 처음엔 정렬을 안시키고 풀려니 filter 함수와 minOf{} 등 람다식의 it을 중복으로 써야하는 경우가 발생했다.
filter 함수를 더 자유자재로 쓰고 싶어서 접근했으나, 마지막에 최소 원소값이 동일한게 2개 이상이면 둘 다 삭제한다는 점에서
오류가 발생했다. (filter 함수를 쓰면서 중복되는 값이 있어도 한개만 삭제하도록 하는 로직은 잘 몰라서 해당 접근방식은 포기했다)
3. 마지막으로 sort 함수를 사용했더니 전보다 풀기가 쉬워졌다.
정렬을 굳이 하지 않고 minOf 함수를 사용해서 접근해도 될 것 같다.
 

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        require(k in 3..100 && score.size in 7..1000 &&
                score.all { it in 0..2000 }) {"제한사항을 지키지 못했습니다!"}
        var answer = intArrayOf() // [
        var winner = intArrayOf() //
        for (i in 0 until k) {
            winner += score[i] // [10]
            answer += winner.minOf { it }
        }
        winner.sort()
        for (i in k until score.size) {
            // winner = [100,100,150] <= 200
            if (winner[0]<= score[i]) {
                winner[0] = score[i] // winner = [200,100,150]
                winner.sort() // [100,150,200]
                answer += winner[0]
            } else {
                answer += winner[0]
            }
        }
        return answer
    }
}
*/

package com.example.lab3_dice

import java.util.PriorityQueue

/*
- 다른 사람 풀이 보고 푼 다른 풀이
- 해당 문제를 풀면서 알아야 할 개념: Array vs MutableList vs ArrayList 차이
- PriorityQueue : Complete binary tree, Min Heap 이 기준
- PriorityQueue 의 메소드 : offer, peek, poll
 */

fun main() {
    Solution().solution(3, intArrayOf(10, 100, 20, 150, 1, 100, 200))
    Solution().solution(4, intArrayOf(0, 300, 40, 300, 20, 70, 150, 50, 500, 1000))
}

class Solution {
    fun solution(k: Int, score: IntArray): IntArray {
        var answer = mutableListOf<Int>()
        val pq = PriorityQueue<Int>() // 오름차순
        for(item in score) {
            if(pq.size < k) {
                pq.offer(item)
            }
            else {
                if(pq.peek() < item) { //pq.peek()는 3등을 의미한다.
                    pq.offer(item)
                    pq.poll() // 꼴등(기존3등) 빼기
                }
            }
            answer.add(pq.peek())
        }
        return answer.toIntArray()
    }
}