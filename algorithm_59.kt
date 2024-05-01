fun main() {
    Solution().solution2(8,4, intArrayOf(2,3,6))
    Solution().solution2(5,4, intArrayOf(1,3))
    Solution().solution2(4,1, intArrayOf(1,2,3,4))
}

/*
solution: 내가 직접 작성한 코드
solution2, solution3 ... : 프로그래머스에서 다른 사람 코드 참고
3일동안 엄청난 삽질과 예외 경우를 고려해서 만든 클래식한 코드..
새로운 개념에 대한 공부가 더 필요하다
클래식한 방식(while,if,for...) 으로는 이제 한계가 있다..
그래도 클래식한 방식에 대해 좀 더 익숙해진 좋은 시간이었다.
 */

class Solution {
    fun solution(n: Int, m: Int, section: IntArray): Int {
        var count = 0
        var i = section[0]-1 // 초기 값 설정
        var j = i
        val wall = IntArray(n)
        var k = 0

        while(true) {
            //만약에 지정한 벽이 다 칠해졌으면 전체 for문을 탈출하라!(break)

            while(k < section.size) { // k:3
                if(wall[section[k]-1]==1) k++ // 해당 처리가 중요할 듯
                else {
                    i = section[k]-1
                    j = i
                    break
                } // 더 칠하러 가자!
            }

            if(k==section.size) break // 드디어 처리했다 !!!!! 이미 칠할 부분이 다 칠해진 경우 반복문을 벗어난다.

            for(index in 1..m) {
                if(j==wall.size) break
                wall[j]=1
                j++
            }

            count++
        }

        return count
    }

    /*
    다른 사람들 코드 핵심 : section을 기준으로 잡았다. (for문) → 기준점이 필요하다!
    forEachIndexed,forEach 함수 다음에 내 코드에 적용해보기
     */
    // 프로그래머스 최상단 코드 → 성민님 코드와 유사
    fun solution2(n: Int, m: Int, section: IntArray): Int {
        var answer = 0
        var nextSection = 1
        section.forEach {
            if (it >= nextSection) {
                answer++
                nextSection = it + m
            }
        }
        return answer
    }

    /*
    이성민님 풀이 → 이해됨
    section의 for문을 돌 때까지 코드를 수행한다.
    forEachIndexed를 통해 인덱스와 해당 인덱스의 원소값을 같이 접근할 수 있도록 했다.
    index 개념을 신경쓰지 않아도 된다는 것을 알게 되었다.
     */
    fun solution3(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 0
        var check = 0
        section.forEachIndexed{ i, c ->
            if(i == 0){ // 아직 안칠한 경우
                answer ++
                check = c
            }
            else if(c >= check+m){
                answer ++
                check = c
            }
        }
        return answer
    }

    fun solution4(n: Int, m: Int, section: IntArray): Int {
        var answer: Int = 1
        var check = section[0]
        section.forEach{
            if(it >= check+m){ // check+m : 칠해야할 곳
                answer ++
                check = it
            }
        }
        return answer
    }
}