fun main() {
    Solution().mySolution(intArrayOf(1, 2, 3, 4))
    Solution().mySolution(intArrayOf(1, 2, 7, 6, 4))
}

class Solution {
    fun mySolution(nums: IntArray): Int {
        require(nums.size in 3..50 && nums.all { it in 1..1000 } &&
                !hasDuplicates(nums)) { "조건에 위반됩니다!" }

        var answer = 0
        for (i in 0 until nums.size - 2) {
            for (j in i + 1 until nums.size - 1) {
                for (k in j + 1 until nums.size) {
                    var sum = 0
                    var sum2 = 0
                    sum = nums[i] + nums[j] + nums[k]
                    for (s in 1..sum) {
                        if (sum % s == 0) sum2++
                    }
                    if (sum2 == 2) {
                        answer++
                    }
                }
            }
        }
        return answer
    }

    // 반복되는 원소가 있는지 확인하는 함수
    private fun hasDuplicates(arr: IntArray): Boolean {
        return arr.size != arr.distinct().count() // != : 같지 않은가요?(의문형)
        // distinct() : 어레이에 있는 고유 요소 목록을 반환하는 함수
    }
}

fun otherSolution1() {}
fun otherSolution2() {}