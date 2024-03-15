fun main(args: Array<String>) {
    while (true) {
        try {
            val (a, b) = readLine()!!.split(' ').map(String::toInt)
            require(a in 1..1000 && b in 1..1000)
            for (i in 1..b) {
                for (j in 1..a) {
                    print("*")
                }
                println()
            }
        } catch (e: Exception) {
            println("잘못 입력했습니다!")
        }
    }
}

//fun main(args: Array<String>) {
//    while (true) {
//        try {
//            val (a, b) = readLine()!!.split(' ').map(String::toInt)
//            require(a in 1..1000 && b in 1..1000)
//            var answer = ""
//            for(i in 1..a) {
//                answer+="*"
//            }
//            for(j in 1..b) {
//                println(answer)
//            }
//        } catch (e: Exception) {
//            println("잘못 입력했습니다!")
//        }
//    }
//}