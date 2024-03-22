fun main() {
    println(solution("3141592","271"))
    println(solution("500220839878","7"))
    println(solution("10203","15"))
}

fun solution(t: String, p: String): Int {
    require(p.length in 1..18 && p.length<=t.length&&t.length<=10000&&p[0]!='0'&&t[0]!='0') {"조건을 충족하지 않습니다!"}
    var answer: Int = 0
    for(i in 0 until t.length-p.length+1) {
        if(t.substring(i,i+p.length).toInt()<=p.toInt()) {
//            println(t.substring(i,i+p.length).toInt())
            answer++
        }
    }
    return answer
}