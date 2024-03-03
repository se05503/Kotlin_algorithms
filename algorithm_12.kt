class Solution {
    fun solution(arr: IntArray) = arr.average()
}
/*
// 내가 다른 방식으로 푼 풀이
class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0
        if(arr.size in 1..100) {
            for(i in arr.indices) {
                if(arr[i] in -10000..10000) {
                    answer += arr[i]
                }
            }
        }
        return answer.toDouble()/arr.size
    }
}
*/

/*
// 다른 사람의 참고할만한 풀이
class Solution {
    fun solution(arr: IntArray): Double {
        var answer = 0.0
        if(arr.size in 1..100 && arr.all {it in -10000..100000}) {
            return arr.average()
        }  else {
            return answer
        }
    }
}
*/

//commit