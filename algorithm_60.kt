import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    Solution().solution(5, 3, 2)
    Solution().solution(10, 3, 2)
}

/*
시간 복잡도 O(n)에 대하여 알 수 있는 알고리즘 문제였다.
어떤 원소를 찾기 위해서 일일히 도는 것은 런타임 에러 즉, 시간 부족을 일으킬 수 있다.
이를 위해서는 시간 복잡도가 줄어들 수 있도록 코드를 짜는 것도 중요하다.
이때, 소수의 개수를 구하는 방법에 대해 시간 복잡도를 줄일 수 있는 코드를 알 수 있게 된 좋은 문제였다.
 */
class Solution {
    fun solution(number: Int, limit: Int, power: Int): Int {
        var sum: Int
        val warriors = IntArray(number) { it + 1 } // [1,2,3,4,5]
        val originPower = IntArray(number)
        for (i in warriors.indices) {
            val warrior = warriors[i]
            sum = 0
            for(i in 1 ..sqrt(warrior.toDouble()).toInt()) {
                if(i.toDouble().pow(2.0).toInt() ==warrior) sum+= 1 // 약수의 개수가 홀수인 경우
                else if(warrior%i==0) sum+= 2
                if(sum>limit) {
                    sum = power
                    break
                }
            }
//            for (i in 1..warrior) { // 이 부분에서 시간 복잡도가 O(warrior) 즉 O(n)이어서 런타임 에러가 걸린 것임
//                if (warrior % i == 0)
//                    sum++
//            }
            originPower[i]=sum
        }
//        for(i in originPower.indices) { // 해당 코드도 시간 복잡도를 O(n)으로 만들어줘서 불필요한 search 낭비를 하게 됨
//            if(originPower[i]>limit) originPower[i]=power
//        }
        return originPower.sum()
    }
}