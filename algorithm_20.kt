class Solution {
    fun solution(n: Long) : Long {
    var longArr = longArrayOf()
    var answer: Long = 0
    var num: Long = n
    while(num>0) {
        longArr = longArr + num%10
        num /= 10
    }

    longArr.sortDescending()
    for(i in 0 until longArr.size) {
        answer+=longArr[i]*Math.pow(10.0,longArr.size-(i+1).toDouble()).toLong()
    }
    return answer
    }
}

/*
fun solution(n: Long) : Long {
    return n.toString().toCharArray().sortedArrayDescending().joinToString("").toLong()
}
*/