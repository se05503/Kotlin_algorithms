fun solution(absolutes: IntArray, signs: BooleanArray): Int {
    var answer: Int = 123456789
    var signs_map = intArrayOf()
    var sum = 0
    if (absolutes.size in 1..1000 && absolutes.all { it in 1..1000 }) {
        for (i in 0 until signs.size) if (signs[i] == true) signs_map += 1 else signs_map += -1
        for (i in 0 until signs.size) sum += absolutes[i] * signs_map[i]
        answer = sum
    }
    return answer
}

/*
// 두 번째 풀이
fun solution(absolutes: IntArray, signs: BooleanArray): Int {
    val sum = absolutes.foldIndexed(0) { idx, sum, num -> sum + if(signs[idx]) num else -num}
    return sum
}
*/