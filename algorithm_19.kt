import kotlin.math.pow

class Solution {
    fun solution(n: Long): Long {
        var answer: Long = 0
        var square_root : Long = 1
        while(true) {
            if(square_root.toDouble().pow(2).toLong()==n) {
                break
            } else if(square_root.toDouble().pow(2)>n) {
                square_root=-1
                break
            } else {
                square_root++
            }
        }
        
        if(square_root>0) {answer = (square_root+1).toDouble().pow(2).toLong()}
        else {answer = square_root}
        
        return answer
    }
}

/*
class Solution {
    fun solution(n: Long): Long {
        val sqrt = Math.sqrt(n.toDouble())
        return if(sqrt%1.0==0.0) {
            Math.pow(sqrt+1.0,2.0).toLong()
        }
        else {
            -1L
        }
    }
}
*/