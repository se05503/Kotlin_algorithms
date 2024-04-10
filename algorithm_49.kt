fun main() {
    val num1 = intArrayOf(2,1,3,4,1)
    val num2 = intArrayOf(5,0,2,7)
    Solution().solution(num1)
    Solution().solution(num2)
}

class Solution {
    fun solution(numbers: IntArray): IntArray {
        require(numbers.size in 2..100 && numbers.all{it in 0..100})
        var temp = mutableSetOf<Int>() // 중복을 피하기 위해서 set 함수 사용
        for (i in 0 until numbers.size - 1) {
            for (j in i + 1 until numbers.size) {
                temp.add(numbers[i] + numbers[j])
            }
        }
        return temp.sorted().toIntArray()
    }
}