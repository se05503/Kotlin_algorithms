class Solution {
    fun solution(age: Int): Int {
        
        var answer: Int = 0
        val standardYear = 2022 // 기준년도 상수
        
        if(age in 0..120) {
            answer = standardYear - age + 1 }
        
        return answer
        
    }
}