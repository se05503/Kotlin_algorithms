// Init(주 생성자)의 사용 예시
// 클래스 선언부에 생성자를 명시한다.
class Character(_name: String, _hairColor: String, _height: Double) {
    var name: String = ""
    var hairColor: String = ""
    var height: Double = 0.0

    // 매개변수를 넘기지 않는다.
    // Init(주 생성자)
    init {
        println("매개변수없는 생성자 실행 완료")
    }

    fun fireBall() {
        println("파이어볼!")
    }

    fun compositing(device1: String, device2: String): String {
        var device3 = device1 + device2
        println("새로운 무기인 ${device3}입니다")
        return device3
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// Constructor(부 생성자)
class Character {
    var name: String = ""
    var hairColor: String = ""
    var height: Double = 0.0

    // 명시적 생성자 (Constructor)
    // 생성자에 변수를 넘긴다.
    constructor(_name:String, _hairColor:String, _height:Double) {
        println("${_name}을 생성자로 넘겼어요")
        println("${_hairColor}를 생성자로 넘겼어요")
        println("${_height}를 생성자로 넘겼어요")
    }

    fun fireBall() {
        println("파이어볼!")
    }

    fun compositing(device1: String, device2: String): String {
        var device3 = device1 + device2
        println("새로운 무기인 ${device3}입니다")
        return device3
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// Constructor(부 생성자)
class Character {
    var name: String = ""
    var hairColor: String = ""
    var height: Double = 0.0
    var age:Int = 0
    var gender:String=""

    // 명시적 생성자 (Constructor)
    constructor(_name:String, _hairColor:String, _height:Double) {
        println("${_name}을 생성자로 넘겼어요")
        println("${_hairColor}를 생성자로 넘겼어요")
        println("${_height}를 생성자로 넘겼어요")
    }

    // 여러 개의 부생성자를 만들 수 있다.
    constructor(_name:String, _hairColor:String, _height:Double, _age:Int, _gender:String) {
        println("${_name}을 생성자로 넘겼어요")
        println("${_hairColor}를 생성자로 넘겼어요")
        println("${_height}를 생성자로 넘겼어요")
        println("${_age}를 생성자로 넘겼어요")
        println("${_gender}를 생성자로 넘겼어요")
    }

    fun fireBall() {
        println("파이어볼!")
    }

    fun compositing(device1: String, device2: String): String {
        var device3 = device1 + device2
        println("새로운 무기인 ${device3}입니다")
        return device3
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {
    val worldName = "메이플스토리"

    println("메이플스토리에 오신걸 환영합니다. 캐릭터 이름을 생성해주세요 : ")
    var myName = readLine()!!

    println("나이를 입력해주세요")
    var myAge = readLine()!!.toInt()

    println("직업을 입력해주세요")
    var myJob = readLine()!!

    println("성별을 입력해주세요")
    var myGender = readLine()!!

    println("초기자본을 입력해주세요")
    var myMoney = readLine()!!.toInt()

    println("초기체력을 입력해주세요")
    var myHp = readLine()!!.toInt()
    var myMp = 0

    var isNamePass = true
    var isAgePass = true
    var isJobPass = true

    var names = arrayOf("참새", "꿩", "비둘기")
    for (name in names) {
        if (myName == name) {
            println("중복된 이름이 존재합니다.")
            isNamePass = false
            break
        }
    }

    if (myAge < 12) {
        println("12세 미만은 이용할 수 없습니다.")
        isAgePass = false
    }
    if (myJob == "전사") {
        println("일시적으로 전사를 이용할 수 없습니다.")
        isJobPass = false
    }

    if (isNamePass && isAgePass && isJobPass) {
        //본격 시작
        displayInfo(worldName, myName, myAge, myJob)

        if (myJob == "마법사") {
            println("마법사는 초기 mp도 입력해주세요")
            myMp = readLine()!!.toInt()
            // 가장 중요한 객체 생성 부분
            var myCharacter = Wizard(myName, myAge, myGender, myMoney, myHp, myMp)

            println("던전을 선택해주세요")
            println("[1] 엘레니아 동쪽 산숲, [2] 좀비마울")
            var selectWorld = readLine()!!.toInt()
            selectWorldByWizard(selectWorld,myCharacter)
        } else if (myJob == "궁수") {
            println("궁수를 선택했군요")
            var myCharacter = Archer(myName, myAge, myGender, myMoney, myHp)

            println("던전을 선택해주세요")
            println("[1] 슬라임동굴, [2] 좀비마을")
            var selectWorld = readLine()!!.toInt()
            selectWorldByArcher(selectWorld, myCharacter)
        }
    }


}

fun displayInfo(worldName: String, myName: String, myAge: Int, myJob: String) {
    println("==================${worldName}에 오신것을 환영합니다==================")
    println("당신의 정보는 다음과 같습니다.")
    println("이름: ${myName}입니다.")
    println("나이: ${myAge}입니다.")
    println("직업: ${myJob}입니다.")
    println("모험을 떠나 볼까요?")
}

fun selectWorldByWizard(selectWorld:Int, myCharacter:Wizard) {
    if(selectWorld==1) {
        var slime1 = Slime("엘레니아슬라임","파랑",10.0,30,5)
        slime1.attack()
        slime1.jumpAttack()
        myCharacter.fireBall()
    } else if(selectWorld ==2) {
        var zombie1 = Zombie("파랑좀비", "파랑", 142.2, 500, 25)
        zombie1.virus()
        myCharacter.fireBall()
    }
}

fun selectWorldByArcher(selectWorld:Int, myCharacter: Archer) {
    if(selectWorld == 1) { // 슬라임 던전
        var slime1 = Slime("초록슬라임", "초록", 30.2, 200, 10)
        slime1.attack()
        myCharacter.windArrow()

    } else if(selectWorld == 2) { // 좀비 던전
        var zombie1 = Zombie("파랑좀비", "파랑", 142.2, 500, 25)
        zombie1.virus()
        myCharacter.windJump("건물1")
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {
    var bird = Bird()
    var chicken = Chicken()
    var sparrow = Sparrow()
    var pigeon = Pigeon()

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
}

open class Bird {
    fun fly() {
        println("새는 날아요~")
    }
}

// 전부 Bird 클래스를 상속을 받는다.
class Chicken : Bird() {}
class Sparrow : Bird() {}
class Pigeon : Bird() {}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {
    var bird = Bird("새")
    var chicken = Chicken("닭")
    var sparrow = Sparrow("참새")
    var pigeon = Pigeon("비둘기")

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
}

// 명시적생성자 중 주생성자로 인자를 받아오는 경우
open class Bird(name:String) {
    var name : String = ""
    init {
        this.name = name
    }

    fun fly() {
        println("${name}는 날아요~")
    }
}

// 전부 Bird 클래스를 상속을 받는다.
class Chicken(name:String) : Bird(name) {}
class Sparrow(name:String) : Bird(name) {}
class Pigeon(name:String) : Bird(name) {}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {
    var bird = Bird("새")
    var chicken = Chicken("닭", 2)
    var sparrow = Sparrow("참새", "갈색")
    var pigeon = Pigeon("비둘기", "서울")

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
}

open class Bird(name: String) {
    var name: String = ""

    init {
        this.name = name
    }

    // open → 오버리이딩 허용 (기존엔 상수여서 오버라이딩 허용 안됨)
    open fun fly() {
        println("${name}는 날아요~")
    }
}

// 전부 Bird 클래스를 상속을 받는다.
class Chicken(name: String, age: Int) : Bird(name) {
    var age: Int = 0

    init {
        this.age = age
    }

    override fun fly() {
//        super 객체는 부모의 객체를 의미하며 자동으로 생성됨
//        부모객체의 fly 메소드를 부르는 행위임
//        필요없으니 주석처리
//        super.fly()
        println("${age}살의 ${name}가 날아봅니다~꼬끼오!")
    }
}

class Sparrow(name: String, color: String) : Bird(name) {
    var color:String=""
    init {
        this.color=color
    }

    override fun fly() {
//        super.fly()
        println("${color}의 색을 가진 ${name}이 납니다~짹짹!")
    }
}

class Pigeon(name: String, address: String) : Bird(name) {
    var address :String =""
    init {
        this.address=address
    }

    override fun fly() {
//        super.fly()
        println("${address}에서 사는  ${name}이 납니다~구구!")
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {
    var bird = Bird("새")
    var chicken = Chicken("닭")
    var sparrow = Sparrow("참새")
    var pigeon = Pigeon("비둘기")
    var duck = Duck("오리")

    bird.fly()
    chicken.fly()
    sparrow.fly()
    pigeon.fly()
    duck.swim()
}

// 부모 클래스
open class Bird(name:String) {
    var name:String=""
    init {
        this.name=name
    }
    fun fly() {
        println("${name} 날아요~")
    }
}

class Chicken(name:String) : Bird(name) {}
class Sparrow(name: String) : Bird(name) {}
class Pigeon(name: String) : Bird(name) {}

//인터페이스
class Duck(name:String) : Bird(name), WaterBirdBehavior {
    override fun swim() {
        println("${name}가 수영해요~")
    }
}
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

//level 1
fun main() {
    var calculator = Calculator()
    println(calculator.add(3,5))
    println(calculator.sub(10,3))
    println(calculator.mul(10,10))
    println(calculator.div(20,7))
}

class Calculator {
    fun add(num1:Int, num2:Int):Int {return num1+num2}
    fun sub(num1:Int, num2:Int):Int {return num1-num2}
    fun div(num1:Int, num2:Int):Int {return num1/num2}
    fun mul(num1:Int, num2:Int):Int {return num1*num2}
}
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

//level 2
package com.example.calculatorassignment

fun main() {
    // 잘 모르겠으니 지금까지 배운 내용 전부 써본다는 느낌으로 먼저 가자!
    println("==================계산기====================")
    while (true) {
        print("덧셈:1 뺄셈:2 곱셈:3 나눗셈:4 나머지:5 종료:-1 \n숫자를 입력해주세요:")
        var opt = readLine()!!.toInt()

        if (opt == -1) break

        print("첫번째 인자를 입력해주세요 : ")
        var num1 = readLine()!!.toInt()
        print("두번째 인자를 입력해주세요 : ")
        var num2 = readLine()!!.toInt()

        var calculator = Calculator(num1, num2)

        when (opt) {
            1 -> {
                println("계산 결과 : ${calculator.add()}")
                println("====================================")
            }

            2 -> {
                println("계산 결과 : ${calculator.sub()}")
                println("====================================")
            }

            3 -> {
                println("계산 결과 : ${calculator.mul()}")
                println("====================================")
            }

            4 -> {
                println("계산 결과 : ${calculator.div()}")
                println("====================================")
            }

            5 -> {
                println("계산 결과 : ${calculator.res()}")
                println("====================================")
            }

            else -> {
                println("다시 입력하세요!")
                println("====================================")
            }
        }
    }
    println("=======프로그램이 종료되었습니다======")
}

class Calculator(num1: Int, num2: Int) {
    var num1: Int = 0
    var num2: Int = 0

    init {
        this.num1 = num1
        this.num2 = num2
    }

    fun add(): Int {
        return num1 + num2
    }

    fun sub(): Int {
        return num1 - num2
    }

    fun div(): Int {
        return num1 / num2
    }

    fun mul(): Int {
        return num1 * num2
    }

    fun res(): Int {
        return num1 % num2
    }
}

// Calculator "클래스에" 출력 이후 추가 연산을 가능하도록 코드를 추가하기 에 맞는 코드 작성해보가..
package com.example.calculatorassignment

fun main() {
    // 잘 모르겠으니 지금까지 배운 내용 전부 써본다는 느낌으로 먼저 가자!
    println("==================계산기====================")
    while (true) {
        print("덧셈:1 뺄셈:2 곱셈:3 나눗셈:4 나머지:5 종료:-1 \n숫자를 입력해주세요:")
        var opt = readLine()!!.toInt()

        if (opt == -1) break

        print("첫번째 인자를 입력해주세요 : ")
        var num1 = readLine()!!.toInt()
        print("두번째 인자를 입력해주세요 : ")
        var num2 = readLine()!!.toInt()

        var calculator = Calculator(num1, num2)

        when (opt) {
            1 -> calculator.add()
            2 -> calculator.sub()
            3 -> calculator.mul()
            4 -> calculator.div()
            5 -> calculator.res()
            else -> println("다시 입력하세요!")
        }
    }
    println("=======프로그램이 종료되었습니다======")
}

class Calculator(num1: Int, num2: Int) {
    var num1: Int = 0
    var num2: Int = 0

    init {
        this.num1 = num1
        this.num2 = num2
    }

    fun add(): Int {
        while(true) {

        }
        return num1 + num2
    }

    fun sub(): Int {
        return num1 - num2
    }

    fun div(): Int {
        return num1 / num2
    }

    fun mul(): Int {
        return num1 * num2
    }

    fun res(): Int {
        return num1 % num2
    }
}