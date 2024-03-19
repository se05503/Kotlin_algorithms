fun solution(n: Int, m: Int): IntArray {
    require(n in 1..1000000 && m in 1..1000000) { "n과 m은 1과 1000000 사이의 수여야 합니다!"}
    var result = intArrayOf()
    var arr = intArrayOf(n, m)
    var res = 0 // 초기값
    var a = arr.maxOf { it }
    var b = arr.minOf { it }
    while (b != 0) {
        res = a % b
        a = b
        b = res
    }
    result += a // 최대 공약수
    result += n*m/a //최소 공배수
    return result
}