fun solution(s: String): String {
    var answer = ""
    if(s.length>=1) answer = s.toCharArray().sortedArrayDescending().joinToString("")
//    if(s.length>=1) answer = String(s.toCharArray().sortedArrayDescending())
    else throw IllegalArgumentException("입력받는 문자열의 길이는 1 이상이어야 합니다!")
    return answer
}