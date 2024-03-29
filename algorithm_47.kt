// 알고리즘 47번(문자열 내 마음대로 정렬하기)
fun main() {
    var str1 = arrayOf("sun","bed","car")
    var str2 = arrayOf("abce", "abcd", "cdx")

    // find 함수를 사용하게 되면 두번째 케이스에서 문제가 생김(find 함수는 첫번째 원소만 가져옴)
    // trouble shooting = filter 함수를 적용했을때는 리스트 형태로 들어갔는데, 튜터님께 여쭤보니 find 함수를 사용하라고 말씀하셨다! 그랬더니 리스트가 아닌 string 형태로 들어간다.
    // filter, find, map

    val object1 = Solution()
    println(object1.solution(str1,1))
    println(object1.solution(str2,2))
}

class Solution {
    fun solution(str: Array<String>, n: Int): Array<String> {
        var str1 = str
        var str2 = charArrayOf()
        var str3 = Array(str.size) { "" }

        for(element in str) {
            str2+=element[n]
        }
        str2.sort()

        for(i in 0 until str2.size) {
            str3[i] = str1.filter {
                it[n] == str2[i] // ["abce","abcd"]
            }.sorted().first() // ["abcd","abce"] → "abcd"
            str1 = str1.filter { // str3에 넣었으면 해당 원소를 str1에서 삭제시켜보기
                it!=str3[i]
            }.toTypedArray()
        }
        return str3
    }
}