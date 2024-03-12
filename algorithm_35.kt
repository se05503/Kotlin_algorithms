fun main() {

    val price = 5
    print("지금 가지고 있는 돈을 입력해주세요 : ")
    val money = readLine()!!.toInt()
    print("놀이기구를 몇번 탈 것인지 입력해주세요 : ")
    val count = readLine()!!.toInt()

    println(solution(price, money, count))
}

fun solution(price: Int, money: Int, count: Int): Long {
    if (price in 1..2500 && money in 1..1000000000 && count in 1..2500) {
        var answer: Long = -1
        var sum: Long = 0L
        for (i in 1..count) sum += price * i
        if (money >= sum) answer = -1L
        else answer = sum - money.toLong()
        return answer
    } else {
        throw IllegalArgumentException("조건이 충족하지 않습니다!")
    }
}