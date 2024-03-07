fun solution(s: String): String {
    var answer = ""
    val len = s.length
    if(len%2==0) {
      answer += s[len/2-1]
      answer += s[len/2]
    } else {
        answer += s[(len-1)/2]
    }
    return answer
}