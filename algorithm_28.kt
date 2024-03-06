fun solution(numbers: IntArray): Int {
    var answer = 0
    for (i in 0..9)
        if (numbers.contains(i)) continue else answer += i
        // if (i in numbers) continue else answer += i 도 가능하다
    return answer
}

/*
fun solution(numbers: IntArray): Int {
    var answer = 0
    answer = (0..9).filterNot(numbers::contains).sum()
    return answer
}
*/

/*
fun solution(numbers: IntArray): Int {
    return (0..9).sum() - numbers.sum()
}
*/