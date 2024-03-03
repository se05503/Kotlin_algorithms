class Solution {
    fun solution(n: Int) = (1..n).first{n%it==1}
}

/*
// 다른 사람 코드 참고
class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 1
        while(n%answer!=1) {
            answer++
        }
        return answer
    }
//commit
*/

/*
// 무수히 시도한 나의 코드들...
class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var numList = mutableListOf<Int>()
        
        numList=(1..n).filter{n%it==1}
        answer = numList.minValue()
        return answer
    }
}

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var numSet = mutableSetOf<Int>()
        
        for(i in 1..n) {
            if(n%i==1) {
                numSet.add(i)
            }
        }
        answer = numSet.minValue()
        return answer
    }
}

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        var numSet = mutableSetOf<Int>()
        
        numSet.addAll((1..n).filter{n%it==1})
        for (elem in numSet) {
            var minValue = elem
            if(minValue<elem) 
            
        }
        answer = numSet.minValue()
        return answer
    }
}

class Solution {
    fun solution(n: Int): Int {
        var answer: Int = 0
        answer = (1..n).filter{n%it==1}.min()
        return answer
    }
}
*/