class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var num: Int = n
        if(num in 1 .. 1000) {
            if(num%2 ==0) {
                // n 이 짝수인 경우
                while(num>0){
                    answer += num
                    num -= 2
                }
            } else {
                //n이 홀수인 경우
                num -= 1
                while(num>0) {
                    answer += num
                    num -= 2
                }   
            }
        }
        return answer
    }
}

/*
class Solution {
    fun solution(n: Int) = (0 .. n).filter{it %2==0}.sum()
}
*/