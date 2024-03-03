class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        if(n in 0..3000) {
            for(i in 1..n) {
                if(n%i==0) {
                    answer += i
                }
            }
        }
        return answer
    }
}

/*
class Solution {
    fun solution(n: Int): Int {
        var answer = 0
        answer = (1..n).filter{n%it==0}.sum()
        return answer
    }
}
*/