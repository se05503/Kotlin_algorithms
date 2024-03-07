// 알고리즘 29번 → 티스토리 작성 시 다른 사람 풀이도 정리하고 풀어보기
//    println(arr1.toList()) //ArrayList 의 경우에는 [4,3,2] 이런 식으로 출력됨
//    println(arr2.toList()) //IntArray 의 경우 [4,3,2] 이런 식으로 출력 안되고 해시코드 값이 나옴
class Solution {
    fun solution(arr: IntArray): IntArray {
    var answer = intArrayOf()
// 배열에서 값을 집어넣을 때는 arr += 3 (원소:3) 이렇게 쓸 수 있지만, 값을 뺄 때는 arr -= 3(이미 배열에 있는 원소) 이렇게 쓸 수 없다.
    // answer = arr.filter{it!=arr.minOf{it}}.toIntArray()
    answer = arr.filter{it!=arr.minOrNull()}.toIntArray()  //ArrayList → IntArray
    if(answer.size==0) answer += -1
    return answer
}
}
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

알고리즘 30번

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

fun solution(s: String): String {
    var answer = ""
    val len = s.length
    //answer = s.slice((len-1)/2..len/2)
    answer = s.substring((len-1)/2..len/2)
    return answer
}

