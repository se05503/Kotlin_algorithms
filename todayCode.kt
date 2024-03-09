TextRPG 실습(메인 파일만)
package com.example.algorithms

import java.lang.Exception

fun main() {
    val worldName = "스코월드"
    val myName = inputMyInfo("name").toString()
    var myAge = inputMyInfo("age").toString().toInt()
    var myJob = inputMyInfo("job").toString()
    var myGender = inputMyInfo("gender").toString()
    var myMoney = inputMyInfo("money").toString().toInt()
    var myHp = inputMyInfo("hp").toString().toInt()

    var isNamePass = true
    var isAgePass = true
    var isJobPass = true

    var names = arrayOf("참새", "꿩", "비둘기")
    for(name in names) {
        if(myName == name) {
            println("중복된 이름이 존재합니다.")
            isNamePass = false
            break
        }
    }

    if(myAge < 12) {
        println("12세 미만은 이용할 수 없습니다.")
        isAgePass = false
    }
    if(myJob == "전사") {
        println("일시적으로 전사를 이용할 수 없습니다.")
        isJobPass = false
    }

    // 모든 조건을 통과한 경우에만 환영
    if(isNamePass && isAgePass && isJobPass) {
        displayInfo(worldName, myName, myAge, myJob)

        if(myJob == "마법사") {
            println("마법사는 초기 mp도 입력해주세요")
            var myMp = inputMyInfo("mp").toString().toInt()
            var myCharacter = Wizard(myName, myAge, myGender, myMoney, myHp, myMp)

            println("던전을 선택해주세요")
            println("[1] 슬라임동굴, [2] 좀비마을")
            var selectWorld = inputMyInfo("selectWorld").toString().toInt()
            selectWorldByWizard(selectWorld, myCharacter)

        } else if(myJob == "궁수") {
            println("궁수를 선택했군요")
            var myCharacter = Archer(myName, myAge, myGender, myMoney, myHp)

            println("던전을 선택해주세요")
            println("[1] 슬라임동굴, [2] 좀비마을")
            var selectWorld = inputMyInfo("selectWorld").toString().toInt()
            selectWorldByArcher(selectWorld, myCharacter)
        }
    }
}

fun inputMyInfo(type: String): Any? {
    when (type) {
        "name" -> {
            println("이름을 입력해주세요")
            while (true) {
                try {
                    val onlineName = readLine() // 오류가 날 수 있는 지점
                    if (onlineName?.first() != '_' && onlineName?.first() != '!') { // catch 문으로 안넘어가도 따로 추가적인 예외 사항 설정
                        return onlineName // return 자체도 while 문을 빠져나가는 기능이 있는 것 같음
                    } else {
                        println("처음 글자에는 _ 또는 ! 이 들어갈 수 없습니다.. 다시 입력해주세요")
                    }
                } catch (e: Exception) {
                    println("문자만 입력해주세요!")
                }
            }
        }

        "age" -> {
            println("나이를 입력해주세요")
            while (true) {
                try {
                    var onlineAge: String? = readLine()
                    return onlineAge?.toInt() ?: -1
                } catch (e: Exception) {
                    println("나이를 잘못 입력하셨습니다! 다시 입력해주세요!")
                }
            }
        }

        "job" -> {
            println("직업을 입력해주세요")
            while (true) {
                try {
                    var onlineJob = readLine()
                    // catch 문 넘어가지 않고 값을 받아와도 "도적", "해적" 같은 프로그램 내에 존재하지 않는 직업을 선택할 경우 예외 처리 발생
                    if (onlineJob?.equals("궁수") == true || onlineJob?.equals("마법사") == true) {
                        return onlineJob
                    } else println("직업이 궁수와 마법사밖에 없습니다!")
                } catch (e: Exception) {
                    println("직업을 잘못 입력하셨습니다! 다시 입력해주세요!")
                }
            }
        }

        "gender" -> {
            println("성별을 입력해주세요")
            while (true) {
                try {
                    var onlineGender = readLine()
                    if (onlineGender?.equals("남") == true || onlineGender?.equals("여") == true) {
                        return onlineGender
                    } else println("남 또는 여 로 입력해주세요!")
                } catch (e: Exception) {
                    println("성별을 잘못 입력했습니다! 다시 입력해주세요!")
                }
            }
        }

        "money" -> {
            println("초기 자본을 입력해주세요")
            while (true) {
                try {
                    var onlineMoney:String?= readLine()
                    return onlineMoney?.toInt() ?: -1
                } catch (e: Exception) {
                    println("잘못 입력하셨습니다! 다시 입력해주세요!")
                }
            }
        }

        "hp" -> {
            println("초기 체력을 입력해주세요")
            while (true) {
                try {
                    var onlineHp:String? = readLine()
                    return onlineHp?.toInt() ?: -1
                } catch (e:Exception) {
                    println("잘못된 형식입니다! 다시 입력해주세요!")
                }
            }
        }
        "mp" -> {
            println("초기마나를 입력해주세요")
            while(true) {
                try {
                    var originMp:String? = readLine()
                    return originMp?.toInt() ?: -1
                } catch(e:Exception) {
                    println("초기마나를 다시 입력해주세요")
                }
            }
        }
        "selectWorld" -> {
            println("월드를 선택해주세요")
            while(true) {
                try {
                    var selectWorld:String? = readLine()
                    if(selectWorld?.equals("1")==true||selectWorld?.equals("2")==true) return selectWorld?.toInt() ?: -1
                    else(println("1 또는 2만 입력해주세요!"))
                } catch(e:Exception) {
                    println("월드를 다시 선택해주세요")
                }
            }
        }
        else -> return "no"
    }
}

fun displayInfo(worldName:String, myName:String, myAge:Int, myJob:String) {
    println("==================${worldName}에 오신것을 환영합니다==================")
    println("당신의 정보는 다음과 같습니다.")
    println("이름: ${myName}입니다.")
    println("나이: ${myAge}입니다.")
    println("직업: ${myJob}입니다.")
    println("모험을 떠나 볼까요?")
}

fun selectWorldByArcher(selectWorld:Int, myCharacter: Archer) {
    if(selectWorld == 1) { // 슬라임 던전
        var slime1 = Slime("초록슬라임", "초록", 30.2, 200, 10)
        slime1.attack()
        myCharacter.windArrow()

        slime1.poison()

    } else if(selectWorld == 2) { // 좀비 던전
        var zombie1 = Zombie("파랑좀비", "파랑", 142.2, 500, 25)
        zombie1.virus()
        myCharacter.windJump("건물1")
    }
}

fun selectWorldByWizard(selectWorld:Int, myCharacter: Wizard) {
    if(selectWorld == 1) { // 슬라임 던전
        var slime1 = Slime("파랑슬라임", "파랑", 30.2, 200, 10)
        slime1.attack()
        myCharacter.attack()

        slime1.poison()

    } else if(selectWorld == 2) { // 좀비 던전
        var zombie1 = Zombie("파랑좀비", "파랑", 142.2, 500, 25)
        zombie1.virus()
        myCharacter.fireBall()
    }
}




ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

배열
package com.example.algorithms

import java.util.Arrays

fun main() {
    // 정수형 배열
    val numbers = arrayOf(1,2,3,4,5)
    println(numbers.joinToString())
    // 문자열 배열
    val colors = arrayOf("Red","Green","Blue")
    println(colors.joinToString())

    //다차원 배열
    val matrix = Array(3) {Array(3) {0} }
    for(row in matrix) {
        for(element in row) {
            print("$element ")
        }
        println()
    }

    numbers[2]=30
    println("수정된 정수형 배열: ${numbers.joinToString()}")

    println("정수형 배열의 크기: ${numbers.size}")

    println("문자열 배열 순회")
    for(color in colors) {
        println(color)
    }

}
ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {

    var computers = arrayOf(60, 80, 90)
    for ((idx, score) in computers.withIndex()) {
        println("${idx}번째 점수 : ${score}")
    }

}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

List

package com.example.algorithms

import java.util.ArrayList

//import java.util.Arrays

fun main() {
    // 읽기 전용 리스트
    // 인덱스에 접근해서 값을 변경할 수 없다
    var score1 = listOf(1,2,3)

    // 수정가능 리스트
    // 인덱스에 접근해서 값을 변경할 수 있다.
    var score2 = mutableListOf(1,2,3)
    score2.set(2,5)

    // 수정가능 리스트
    // 인덱스에 접근해서 값을 변경할 수 있다.
    // mutableListOf와 동일하게 사용 가능
    // array로 데이터들을 저장하는 구조
//    var score3 = ArrayList<Int>(1,2,3) // 실행안됨
    var score3 = arrayListOf(1,2,3) // 얘는 실행 가능
    score3.set(1,20)

}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
맵(Map)

fun main() {
    //읽기 전용 map
    //변수명[key값] 으로 데이터 값에 접근 가능하다.
    var myInfo1 = mapOf("height" to 160, "weight" to 50, "age" to 24)
    println(myInfo1["age"])

    // 수정 가능한 map입니다.
    // 변수명[key값]으로 데이터 값에 접근 가능합니다
    var hisInfo2 = mutableMapOf("height" to 173, "weight" to 75, "age" to 25)
    hisInfo2["height"]=180
    println(hisInfo2["height"])

    // map 의 키와 값을  동시에 추출해서 사용할 수 있다.
    for((key,value) in hisInfo2) {
        println("${key} : ${value}")
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {
    // 읽기전용 Set
    var lifeSet = setOf("사랑","연인","행복")

    // 수정 가능 Set
    var lifeSet2 = mutableSetOf("자연","바람","햇빛","범죄")
    lifeSet2.add("가족")
    lifeSet2.remove("범죄")
    println("집합의 크기 : ${lifeSet2.size}")

    var findElement = readLine()!! // null 값을 받아오지 않는다
    if(lifeSet2.contains(findElement))
        println("${findElement} 는 존재합니다.")
    else
        println("${findElement}는 존재하지 않습니다.")
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

var myInfo = setOf("착함","휴학생","24살","귀여움","예쁨","사랑스러움")
    var boyfriendInfo=setOf("졸업생","군인","ROTC","25살","착함","자상함","귀여움")

    //합집합
    var unionInfo=myInfo.union(boyfriendInfo)
    println("합집합:${unionInfo}")

    //교집합
    var intersectInfo=myInfo.intersect(boyfriendInfo)
    println("교집합:${intersectInfo}")

    //차집합
    var myInfo2=myInfo.subtract(boyfriendInfo)
    println("차집합:${myInfo2}")


ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {
    val obj1: Array<String> = arrayOf("c","python","java","kotlin")
    val index = test<String>(obj1,"kotlin")
    println(index)
}

fun <T> test(arr:Array<T>, data:T):Int {
    for(i in arr.indices) {
        if(arr[i]==data) return i
    }
    return -1
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {
    // List
    val numbersList = listOf(1,2,3,4,5) //변경 불가
    println("List: $numbersList") // List: [1, 2, 3, 4, 5]

    // Set
    val colorsSet = setOf("red","green","yellow","purple")
    println("Set: $colorsSet") // Set: [red, green, yellow, purple]

    // Map
    val agesMap = mapOf("박세영" to 24, "정재환" to 25)
    println("Map : $agesMap") // Map : {박세영=24, 정재환=25}

    // List 접근
    println("first element : ${numbersList.first()}")
    println("last element : ${numbersList.last()}")

    // Set 추가
    val colorsSet2 = mutableSetOf("apple","banana")
    colorsSet2.add("grape")
    println("Modified Set : $colorsSet2")

    // Map 수정
    val genderMap = mutableMapOf("박세영" to "여자", "정재환" to "남자")
    genderMap["정재환"] = "여자"
    println("Modified Map : $genderMap")

    // List 순회
    for(element in numbersList) {
        println(element)
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ
가장 종합적인 실습!

fun main() {
    var students = mutableListOf<HumanInfo>() //아직 값을 받지 않은 객체 리스트!
    var averages = mutableMapOf<String, Int>() //key : String, value: Int (key,value) 쌍에 대한 Map

    // 총 3명의 정보를 객체에 저장해서 받아올 것임
    for(idx in 0..2) {
        println("이름을 입력하세요")
        var name=readLine()!!

        println("나이를 입력하세요")
        var age= readLine()!!.toInt()

        println("신장을 입력하세요")
        var height=readLine()!!.toInt()

        println("성별을 입력하세요")
        var gender=readLine()!!

        var person1 = HumanInfo(name,age,height,gender) // 객체 생성
        students.add(person1) // 객체를 수정 가능한 리스트에 넣는다.
        averages[name]=age // (key,value) = (이름,나이) → 리스트처럼 add 함수를 쓰지 않는다
    }

    for(student in students) {
        var age = averages[student.name]
        student.displayInfo()
        println()
        println("map 에서 가져온 정보 : ${student.name}는 ${age} 살 입니다.")
    }
}


class HumanInfo(name:String, age:Int, height:Int, gender:String) {
    var name:String // 굳이 초기값을 설정하지 않아도 됨
    var age:Int
    var height:Int
    var gender:String

    // 매개변수를 선언부에서 받아오는 주생성자 사용
    init {
        this.name=name
        this.age=age
        this.height=height
        this.gender=gender
    }

    fun displayInfo() {
        println("이름 : $name")
        println("나이 : $age")
        println("신장 : $height")
        println("성별: $gender")
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {
    print(add(1,2,3))
}

fun add(n1:Int, n2:Int, n3:Int) = (n1+n2+n3)/3 // 람다식 정의

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

fun main() {
    
    var average = {n1:Int, n2:Int, n3:Int -> (n1+n2+n3)/3} // 람다식 구조 : {매개변수1, 매개변수2 ... -> 코드}
    print(average(10,20,30))
    // 메소드를 선언하지 않고 로직을 저장할 수 있다.
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

// 객체를 생성하지 않고 Bird 클래스의 메소드에 바로 접근할 수 있어요 
fun main() {
    Bird.fly("참새")
}

//object → SingleTon(싱글턴) 선언
object Bird {
    fun fly(name: String) {
        println("${name}가 날아요~")
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ

싱글턴

// 눈에 보이는 객체는 singletonObject1, singletonObject2 두 개이지만, 사실상 SingleTon 때문에 같은 객체를 공유하고 있다!
fun main() {
    var singletonObject1 = MySingletonClass.getInstance(trash = 1)
    singletonObject1.setNum(5)
    println("첫번째 객체의 num 값 : ${singletonObject1.getNum()}")

    var singletonObject2 = MySingletonClass.getInstance(trash=2)
    singletonObject2.setNum(10)

    println("두번째 공유객체가 num 값을 바꾼 후 첫번째 공유 객체의 num 값 : ${singletonObject1.getNum()}")
}

class MySingletonClass private constructor() {

    private var num:Int = 0
    companion object {

        private var instance: MySingletonClass? = null
        private var trash: Int = 0

        fun getInstance(trash: Int): MySingletonClass {
            this.trash = trash
            if (instance == null) {
                // if 안에 있는 부분은 아직 몰라도 됨
                // 설명 : synchronized 로 외부 쓰레드의 접근을 막는다.
                // 쓰레드간의 객체상태 혼돈을 막기위해 사용한다.
                synchronized(this) {
                    instance = MySingletonClass()
                }
            }
            return instance!!
        }
    }

    fun setNum(num:Int) {
        this.num=num
    }

    fun getNum() : Int {
        return this.num
    }
}

ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ


