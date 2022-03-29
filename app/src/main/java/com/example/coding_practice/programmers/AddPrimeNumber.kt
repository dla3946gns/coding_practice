package com.example.coding_practice.programmers

public class AddPrimeNumber {

    fun isPrime(n: Int): Boolean {
        if (n < 2) {
            return false
        } else if (n < 6) {
            if (n == 4) {
                return false;
            } else {
                return true;
            }
        }
        for (i in 2..Math.sqrt(n.toDouble()).toInt()) {
            if (n % i == 0) {
                return false
            }
        }
        return true
    }

    fun solution(nums: IntArray): Int {
        var answer = 0
        for (i in 0..nums.size - 3){
            for(j in i + 1..nums.size - 2){
                for(k in j + 1 until nums.size){
                    println(nums[i]+nums[j]+nums[k])
                    if(isPrime(nums[i]+nums[j]+nums[k]))answer++
                }
            }
        }

        return answer
    }
}