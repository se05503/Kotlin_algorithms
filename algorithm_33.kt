fun solution(left: Int, right: Int): Int {
    if (left in 1..right && right in left..1000) {
        var answer: Int = 0
        for (i in left..right) {
            var num: Int = 0 // 약수의 개수를 다시 초기화해야함
            for (j in 1..i) {
                if (i % j == 0) num++
            }
            if (num % 2 == 0) answer += i else answer -= i
        }
        return answer
    } else throw IllegalArgumentException("1<=left<=right<=1000 조건을 충족해야합니다!")
}

/*
가장 맨 위에 올라온 간결한 코드 (이해하고 3번 따라 써봄)
fun solution(left: Int, right: Int): Int {
    return (left..right).map{i -> if((1..i).filter { i%it==0 }.size%2==0) i else -i}.sum()
}
*/