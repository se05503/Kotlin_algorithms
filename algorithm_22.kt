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