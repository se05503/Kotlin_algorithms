class Solution {
    fun solution(x: Int, n: Int): LongArray {
        var answer = LongArray(n)
        var temp_x = x.toLong()
        for (i in 0 until n) {
            answer[i]=temp_x
            temp_x += x
        }
        return answer
    }
}
//commit
/*
class Solution {
    fun solution(x: Int, n: Int) : LongArray = LongArray(n) {x.toLong()*(it+1)}
    }
}
// error: expecting a top level declaration
*/