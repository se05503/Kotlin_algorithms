fun solution(n: Int): Int {
    var try_n = 0
    var num : Long = n.toLong()
    while (num != 1L) {
        if (try_n > 500) {
            try_n = -1
            break
        } else {
            if (num % 2 == 0L) {
                num /= 2
                try_n++
            } else {
                num = num * 3 + 1
                try_n++
            }
        }
    }
    return try_n
}

/*
// if else 문을 더욱 간단 명료하게 한 다른 사람의 코드
fun solution(n: Int): Int {
    var count = 0
    var num : Long = n.toLong()
    while (num != 1L) {
        if (count > 500) break

        if (num % 2 == 0L) num /= 2
        else num = num * 3 + 1
        count++
    }
    return if(count>500) -1 else count
}
*/