// 알고리즘 29번 → 티스토리 작성 시 다른 사람 풀이도 정리하고 풀어보기
//    println(arr1.toList()) //ArrayList 의 경우에는 [4,3,2] 이런 식으로 출력됨
//    println(arr2.toList()) //IntArray 의 경우 [4,3,2] 이런 식으로 출력 안되고 해시코드 값이 나옴
class Solution {
    fun solution(arr: IntArray): IntArray {
    var answer = intArrayOf()
// 배열에서 값을 집어넣을 때는 arr += 3 (원소:3) 이렇게 쓸 수 있지만, 값을 뺄 때는 arr -= 3(이미 배열에 있는 원소) 이렇게 쓸 수 없다.
    // answer = arr.filter{it!=arr.minOf{it}}.toIntArray()
    answer = arr.filter{it!=arr.minOrNull()}.toIntArray()  //ArrayList → IntArray
    if(answer.size==0) answer += -1
    return answer
}
}
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

알고리즘 30번

fun solution(s: String): String {
    var answer = ""
    val len = s.length
    if(len%2==0) {
      answer += s[len/2-1]
      answer += s[len/2]
    } else {
        answer += s[(len-1)/2]
    }
    return answer
}

fun solution(s: String): String {
    var answer = ""
    val len = s.length
    //answer = s.slice((len-1)/2..len/2)
    answer = s.substring((len-1)/2..len/2)
    return answer
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

과제 최종 lv2 구현 완료

package com.example.calculatorassignment

fun main() {
    // 잘 모르겠으니 지금까지 배운 내용 전부 써본다는 느낌으로 먼저 가자!
    println("==================계산기====================")
    while (true) {
        print("덧셈:1 뺄셈:2 곱셈:3 나눗셈:4 나머지:5 종료:-1 \n숫자를 입력해주세요:")
        var opt = readLine()!!.toInt()

        if (opt == -1) break

        var calculator = Calculator(opt)

        when (calculator.opt) {
            1 -> calculator.add()
            2 -> calculator.sub()
            3 -> calculator.mul()
            4 -> calculator.div()
            5 -> calculator.res()
            else -> println("처음부터 다시 입력하세요!")
        }
    }
    println("=======프로그램이 종료되었습니다======")
}

class Calculator(opt:Int) {
    var opt: Int = 0

    init {
        this.opt=opt
    }

    fun add() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1+num2}")
            print("덧셈 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }

    fun sub() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1-num2}")
            print("덧셈 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }

    fun div() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1/num2}")
            print("나눗셈 몫 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }

    fun mul() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1*num2}")
            print("곱셈 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }

    fun res() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1%num2}")
            print("나눗셈 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

lv3

부모가 사용자로부터 인자를 전달받지 않는 경우의 자식 클래스
class Chicken : Bird() {}

부모가 사용자로부터 인자를 전달받는 경우 자식 클래스
open class Bird(name:String) {}
class Chicken(name:String) : Bird(name) {}

myCaculator.kt

package com.example.calculatorassignment

fun main() {
    println("==================계산기====================")
    while (true) {
        print("덧셈:1 뺄셈:2 곱셈:3 나눗셈:4 종료:-1 \n숫자를 입력해주세요:")
        var opt = readLine()!!.toInt()

        if (opt == -1) break

        var calculator = Calculator(opt)
        var addCalculator = AddOperation(opt)
        var divCalculator = DivideOperation(opt)
        var mulCalculator = MultiplyOperation(opt)
        var subCalculator = SubstractOperation(opt)

        when (calculator.opt) {
            1 -> addCalculator.cal()
            2 -> subCalculator.cal()
            3 -> mulCalculator.cal()
            4 -> divCalculator.cal()
            else -> println("처음부터 다시 입력하세요!")
        }
    }
    println("=======프로그램이 종료되었습니다======")
}

AddOperation
package com.example.calculatorassignment

class AddOperation(opt:Int) : Calculator(opt) {
//    var _opt:Int=0
//
//    init {
//        this._opt=opt
//    }  → 자식 클래스는 해당 부분을 쓸 필요가 없는 것 같음

    override fun cal() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1+num2}")
            print("덧셈 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }

}

Calculator
package com.example.calculatorassignment
// 변수 명시 안해서 부생성자 쓸 예정
open class Calculator {
    var opt:Int=0

    constructor(_opt:Int) {
        opt=_opt
    }

    open fun cal() {
        println("와우!")
    }
}

DivideOperation
package com.example.calculatorassignment

class DivideOperation(opt:Int):Calculator(opt) {
//    var _opt:Int=0
//
//    init {
//        this._opt=opt
//    }  → 자식 클래스는 해당 부분을 쓸 필요가 없는 것 같음

    override fun cal() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1/num2}")
            print("나눗셈 몫 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }
}

MultiplyOperation
package com.example.calculatorassignment

class MultiplyOperation(opt:Int) : Calculator(opt) {
//    var _opt:Int=0
//
//    init {
//        this._opt=opt
//    }

    override fun cal() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1*num2}")
            print("곱셈 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }
}

SubstractOperation
package com.example.calculatorassignment

class SubstractOperation(opt:Int):Calculator(opt) {
//    var _opt:Int=0
//
//    init {
//        this._opt=opt
//    }

    override fun cal() {
        while(true) {
            print("첫번째 인자를 입력해주세요 : ")
            var num1 = readLine()!!.toInt()
            print("두번째 인자를 입력해주세요 : ")
            var num2 = readLine()!!.toInt()
            println("결과 값: ${num1-num2}")
            print("덧셈 연산을 계속하고 싶으시면 1 아니면 0을 입력해주세요:")
            val opt = readLine()!!.toInt()
            if(opt==0) break
        }
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

2. git branch -M main : 원래 처음의 branch는 master 이다. 어느 순간 master에서 main으로 바뀌어 있다. -> 기본 브랜치를 master에서 main으로 바꾼다.

fun main() {
    while(true) {
        try {
            var num1 = readLine()!!.toInt()
            println("내가 입력한 숫자는 ${num1}입니다.")
            break
        } catch(e:java.lang.NumberFormatException) {
            println("잘못 입력하셨습니다.숫자를 입력해주세요!")
        } finally {
            println("오늘도 수고했습니다.")
        }
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {
    var s1 = Student()
    s1.name="참새"
    s1.displayInfo()

    s1.age=10
    s1.displayInfo()
}

class Student {
//    var name:String="" (이전 방식)
    lateinit var name:String // 정수와 달리 문자열은 초기에 값을 정의하기 어렵다?
    var age:Int=0
//    lateinit var age:Int → 오류 뜨는 코드

    fun displayInfo() {
        println("이름 : ${name}")
        println("나이 : ${age}")
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {
    var s1 = Student()
    s1.name = "참새"
    s1.displayInfo()

    s1.age = 10
    s1.displayInfo()
}

class Student {
    //    var name:String="" (이전 방식)
    lateinit var name: String // 정수와 달리 문자열은 초기에 값을 정의하기 어렵다?
    var age: Int = 0
//    lateinit var age:Int → 오류 뜨는 코드

    fun displayInfo() {
        if (this::name.isInitialized) {
            println("이름 : ${name}")
            println("나이 : ${age}")
        } else {
            println("이름 값을 초기화해주세요!")
        }
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {
    var s1 = Student()
    s1.name = "참새"
    s1.displayInfo()

    s1.age = 10
    s1.displayInfo()
}

class Student {
    //    var name:String="" (이전 방식)
    lateinit var name: String // 정수와 달리 문자열은 초기에 값을 정의하기 어렵다?
    var age: Int = 0
    val address: String by lazy {
        println("address 초기화")
        "seoul"
    }
//    lateinit var age:Int → 오류 뜨는 코드

    fun displayInfo() {
        if (this::name.isInitialized) {
            println("이름 : ${name}")
            println("나이 : ${age}")
            println("주소 : ${address}")
        } else {
            println("이름 값을 초기화해주세요!")
        }
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

04. 널 세이프티

// 주소를 저장하는 address변수는 null을 저장할 수 있다고 String?으로 선언해요
fun main() {
    var s = Student()
    s.name = "참새"
    s.address = "서울"
    s.displayInfo()

}

class Student {
    lateinit var name: String
    var address: String? = null

    fun displayInfo() {
        println("이름 : ${name}")
        println("주소 : ${address}")
    }
}

fun main() {

    // null 값이 아님이 !! 로 보증되기 때문에 var data = readLine()!!.toInt() 라고 쓰는게 더 간결하다
    var inputdata = readLine()!!
    var data = inputdata.toInt()
    println("Null이 아닌 값 : ${data}")
//    var s = Student()
//    s.name = "참새"
//    s.address = "서울"
//    s.displayInfo()

}

/*
- ?.키워드로 Null인지 확인하고 Null이 아닐때만 참조하는 메소드를 실행하도록 작성해요
    - 주소를 저장하는 address는 초기값이 null이기때문에 null위협에 놓여있어요
    - Null이 아님을 보장해야하는데 강제로 !!를 사용하는것은 현상황에 바람직하지 않아요
    - ?. 는 **안전 호출연산자(safe-calls)**라고 해요
    
*/
// 주소를 저장하는 address변수는 null을 저장할 수 있다고 String?으로 선언해요
fun main() {
    var s = Student()
    s.name = "참새"
    s.displayAddressLength()

    s.address="서울"
    s.displayAddressLength()
    s.displayInfo()
}

class Student {
    lateinit var name: String
    var address: String? = null

    fun displayInfo() {
        println("이름 : ${name}")
        println("주소 : ${address}")
    }

    fun displayAddressLength() {
        println("주소의 길이는: ${address?.length}입니다.")
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

package com.example.algorithms

import java.lang.NumberFormatException
/*
- ?.키워드로 Null인지 확인하고 Null이 아닐때만 참조하는 메소드를 실행하도록 작성해요
    - 주소를 저장하는 address는 초기값이 null이기때문에 null위협에 놓여있어요
    - Null이 아님을 보장해야하는데 강제로 !!를 사용하는것은 현상황에 바람직하지 않아요
    - ?. 는 **안전 호출연산자(safe-calls)**라고 해요

*/
// 주소를 저장하는 address변수는 null을 저장할 수 있다고 String?으로 선언해요
fun main() {
    var s = Student()
    s.name = "참새"
    s.displayAddressLength()
    s.address="서울"
    s.displayAddressLength()
}

class Student {
    lateinit var name: String
    var address: String? = null

    fun displayInfo() {
        println("이름 : ${name}")
        println("주소 : ${address}")
    }

    fun displayAddressLength() {
        println("주소의 길이: ${address?.length ?: "존재하지 않습니다"}")
    }
}


ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

