/*
1번 수포자가 찍는 방식: 1, 2, 3, 4, 5, 1, 2, 3, 4, 5, ...
2번 수포자가 찍는 방식: 2, 1, 2, 3, 2, 4, 2, 5, 2, 1, 2, 3, 2, 4, 2, 5, ...
3번 수포자가 찍는 방식: 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, 3, 3, 1, 1, 2, 2, 4, 4, 5, 5, ...
 */

 fun main() {
    Solution().solution(intArrayOf(1, 2, 3, 4, 5))
    Solution().solution(intArrayOf(1, 3, 2, 4, 2))
}

class Solution {
    fun solution(answers: IntArray): IntArray {

        val arr1_rule = intArrayOf(1, 2 ,3 ,4 ,5)
        val arr2_rule = intArrayOf(2, 1, 3, 4, 5)
        val arr3_rule = intArrayOf(3, 1, 2, 4, 5)

        val size = answers.size //
        val arr1 = IntArray(size) { i ->
            when(i%5) {
                0 -> arr1_rule[0]
                1 -> arr1_rule[1]
                2 -> arr1_rule[2]
                3 -> arr1_rule[3]
                4 -> arr1_rule[4]
                else -> -1
            }
        }
        val arr2 = IntArray(size) { i ->
            when (i % 8) {
                0, 2, 4, 6 -> arr2_rule[0] //2
                1 -> arr2_rule[1]// 1
                3 -> arr2_rule[2]// 3
                5 -> arr2_rule[3]// 4
                7 -> arr2_rule[4]// 5
                else -> -1
            }
        }
        val arr3 = IntArray(size) { i ->
            when (i % 10) {
                0, 1 -> arr3_rule[0]
                2, 3 -> arr3_rule[1]
                4, 5 -> arr3_rule[2]
                6, 7 -> arr3_rule[3]
                8, 9 -> arr3_rule[4]
                else -> -1
            }
        }

        var arr1_correct_count = 0
        var arr2_correct_count = 0
        var arr3_correct_count = 0

        for (i in 0 until size) {
            if (arr1[i] == answers[i]) arr1_correct_count++
            if (arr2[i] == answers[i]) arr2_correct_count++
            if (arr3[i] == answers[i]) arr3_correct_count++
        }


        val arr = arrayOf(
            intArrayOf(1, arr1_correct_count),
            intArrayOf(2, arr2_correct_count),
            intArrayOf(3, arr3_correct_count)
        )

        val ls = arrayListOf<IntArray>() // [1]

        // 스스로 완성하기 힘들었던 코드
        for(i in arr.indices) {
            if(ls.size==0) ls.add(arr[i])
            else {
                if(arr[i][1]>ls.last()[1]) { // arrayList의 last 함수를 사용하면서 해결이 되었다.
                    ls.clear()
                    ls.add(arr[i])
                } else if(arr[i][1]==ls.last()[1]) {
                    ls.add(arr[i])
                }
            }
        }

        var res = arrayListOf<Int>()
        for(i in ls.indices) res.add(ls[i][0])
        return res.toIntArray()
    }
}