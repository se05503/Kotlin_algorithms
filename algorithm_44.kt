fun main() {
    val arr = arrayOf(intArrayOf(60, 50), intArrayOf(30, 70), intArrayOf(60, 30), intArrayOf(80, 40))
    val object1 = Solution()
    println(object1.solution(arr))
}

class Solution {
    var maxValue1 = 0
    var maxValue2 = 0 // 60 -> 70 -> 80
    var smallIdx = 0 // 0 -> 1 -> 0
    var largeIdx = 0 // 0 -> 1 -> 3
    var result = 0

    fun solution(arr: Array<IntArray>): Int {
        for (i in 0 until arr.size) { // i : 0 -> 1 -> 2 -> 3
            if (maxValue1 <= arr[i][0]) { 
                maxValue1 = arr[i][0]
                smallIdx = 0
                largeIdx = i
            }
            if (maxValue1 <= arr[i][1]) {
                maxValue1 = arr[i][1]
                smallIdx = 1
                largeIdx = i
            }
        }

        // 0, 1, 2, 3 → 0, 1, 2
        when (smallIdx) {
            0 -> {
                for (i in (0 until arr.size).filter { it != largeIdx }) { // i : 0,1,2,3 -> 0,1,2
                    if (arr[i][0] < arr[i][1]) { // i : 0 -> 1 -> 2
                        val temp = arr[i][0] // temp : 30
                        arr[i][0] = arr[i][1] 
                        arr[i][1] = temp
                    }
                }
                for (element in arr) {
                    if (maxValue2 < element[1]) maxValue2 = element[1] // maxValue2 : 50
                }
            }

            1 -> {
                for (i in (0 until arr.size).filter { it != largeIdx }) {
                    if (arr[i][0] > arr[i][1]) {
                        val temp = arr[i][0]
                        arr[i][0] = arr[i][1]
                        arr[i][1] = temp
                    }
                }
                for (element in arr) {
                    if (maxValue2 < element[0]) maxValue2 = element[0]
                }
            }
        }
        result = maxValue1 * maxValue2
        return result
    }
}