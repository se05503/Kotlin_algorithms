class Solution {
    fun solution(a: Int, b: Int): Long {
    var answer = 0L
    if(a>b) {
        for(i in a downTo b)
        {answer+=i}
    }
    else {
        for(i in a..b)
        {answer+=i}
    }
    return answer
    }
}

/*
// 나도 나름 다른 사람들처럼 코드 간결하게 작성해보려고 했지만 에러가 뜨는 코드
class Solution {
    fun solution(a: Int, b: Int): Long {
    return if(a>b) (b..a).sum().toLong() else (a..b).sum().toLong()
    }
}
*/