fun solution(n: Int): String {
    var answer = ""
    if (n !in 1..10000) {
        throw IllegalArgumentException("1이상 10000이하의 자연수를 입력해야 합니다!")
    } else {
        for (i in 0 until n) {
            if (i == 0 || i % 2 == 0) answer += '수'
            else answer += '박'
        }
    }
    return answer
}

/* 
fun solution(n: Int): String {
    if(n !in 1..10000) throw IllegalArgumentException("1부터 10000 사이의 수를 입력하세요!")
    return String(CharArray(n,{it -> if(it%2==0) '수' else '박'}))
}
*/
