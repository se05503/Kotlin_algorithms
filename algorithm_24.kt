fun solution(seoul: Array<String>): String {
    var answer = ""
    for(i in 0 until seoul.size) {
        if(seoul[i]=="Kim") answer = "김서방은 ${i}에 있다"
    }
    return answer
}

/*
// 다른 풀이과정1
class Solution {
    fun solution(seoul: Array<String>): String = "김서방은 ${seoul.indexOf("Kim")}에 있다"
}
*/

/*
// 다른 풀이과정2
class Solution {
    fun solution(seoul: Array<String>): String {
    var answer = ""
    seoul.forEachIndexed { index, s ->
        if(s=="Kim") answer = "김서방은 ${index}에 있다"
    }
    return answer
    }
}
*/