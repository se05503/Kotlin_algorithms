fun main() {
    var matrix1 = arrayOf(intArrayOf(1, 2, 3, 4), intArrayOf(2, 3, 2, 3))
    var matrix2 = arrayOf(intArrayOf(3, 4, 5, 6), intArrayOf(5, 6, 1, 2))
    print(solution(matrix1, matrix2))
}

fun solution(arr1: Array<IntArray>, arr2: Array<IntArray>): Array<IntArray> {
    var answer = Array<IntArray>(arr1.size, { IntArray(arr1[0].size, { 0 }) }) // 가장 중요한 코드
    if (arr1.size in 1..500 && arr1[0].size in 1..500 && arr2.size in 1..500 && arr2[0].size in 1..500) {
        for (i in 0 until arr1.size) {
            for (j in 0 until arr1[i].size) {
                answer[i][j] = arr1[i][j] + arr2[i][j]
            }
        }
    } else throw IllegalArgumentException("arr1과 arr2 의 행과 열의 사이즈는 1 이상 500 이하입니다!")

    return answer
}