fun solution(phone_number: String): String {
    var answer = ""
    var phoneArr = phone_number.toCharArray()
    for (i in 0..phone_number.length - 5) phoneArr[i] = '*'
    answer = String(phoneArr)
    return answer
}

/*
fun solution(phone_number: String): String {
    var answer = ""
    for(i in 0..phone_number.lastIndex-4) answer += '*'
    answer += phone_number.slice(phone_number.lastIndex-3..phone_number.lastIndex)
    return answer
}
*/