class Solution {
    fun solution(numbers: IntArray): Double {
        var answer: Double = 0.0
        var sum: Int = 0
        var arrayElement: Int = 0
        val arraySize: Int = numbers.size
        
        // 반복문 돌기
        for(i in numbers.indices) {
            arrayElement = numbers[i]
            sum += arrayElement
        }
        
        answer = sum.toDouble()/arraySize
        return answer
    }
}

/*
class Solution {
    fun solution(numbers: IntArray) = numbers.average()
}
*/