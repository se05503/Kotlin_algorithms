class Solution {
    fun solution(s: String): Boolean {
    var answer = true
    var intStrArr = arrayOf<String>()
    for(i in 0..9) {
        intStrArr += i.toString()
    }
    if(s.length in 1..8) {
        if ((s.length == 4 || s.length == 6) && s.all { it.toString() in intStrArr }) answer = true
        else answer = false
    } else throw IllegalArgumentException("문자열의 길이는 1 이상 8 이하입니다!")
    return answer
}
}