fun solution(a: IntArray, b: IntArray): Int {
    var answer: Int = 0
    if (a.size !in 1..1000 || b.size !in 1..1000) throw IllegalArgumentException("배열의 사이즈는 1이상 1000이하여야 합니다!")
    if (a.all { it !in -1000..1000 } || b.all { it !in -1000..1000 }) throw IllegalArgumentException("배열의 원소는 -1000 이상 1000 이하입니다!")

    for (i in 0 until a.size) {
        answer += a[i] * b[i]
    }

    return answer
}

// throw 문을 했지만 인자에서 10000이 되는 원소 값을 입력했을 때 예외가 발생하지 않았다..
/*
//zip과 map을 활용하여 코드 간결화하기
fun solution(a: IntArray, b: IntArray): Int {
   return a.zip(b).map{it.first*it.second}.sum()
}
*/