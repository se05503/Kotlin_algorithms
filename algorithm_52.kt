fun main() {
    Solution().solution(2,1,20)
    Solution().solution(3,1,20)
}

// b = 1 일때의 풀이
class Solution {
    fun solution(a: Int, b: Int, n: Int): Int {
        require(1<=b && b<a && a<=n && n<=1000000)
        var answer: Int = 0 // 새로 받을 수 있는 콜라의 총 개수
        var quota: Int = 0 // 한번 거래할 때 받을 수 있는 새 콜라의 개수
        var res: Int = 0 // 거래 불가능한 빈병(남은 빈병)
        var _n:Int = n // 현재 가지고 있는 총 빈병의 개수
        while(_n >= a) {
            quota = _n/a
            res = _n%a
            answer+= quota*b
            _n = quota*b+res
        }
        return answer
    }
}