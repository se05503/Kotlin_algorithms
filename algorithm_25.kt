class Solution {
    fun solution(arr: IntArray, divisor: Int): IntArray {
    var answer = intArrayOf()
    for(i in 0 until arr.size) {
        if(arr[i]%divisor==0) answer += arr[i]
    }
    if(answer.size==0) answer += -1
    answer.sort()
    return answer
}
}

/*
fun solution(arr: IntArray, divisor: Int): IntArray {
    var answer = intArrayOf()
    arr.forEach { if(it%divisor==0) answer+=it }
    answer.sort()
    if(answer.size==0) answer += -1
    return answer
}
*/