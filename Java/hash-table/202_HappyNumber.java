/*
 * Write an algorithm to determine if a number is "happy".
 * 
 * A happy number is a number defined by the following process:
 *  Starting with any positive integer, replace the number by the sum of 
 * the squares of its digits, and repeat the process until the number equals 1 
 * (where it will stay), or it loops endlessly in a cycle which does not include 1.
 *  Those numbers for which this process ends in 1 are happy numbers.
 * 
 * Example: 19 is a happy number
 * 
 * 1^2 + 9^2 = 82
 * 8^2 + 2^2 = 68
 * 6^2 + 8^2 = 100
 * 1^2 + 0^2 + 0^2 = 1
 * */
public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> loop = new HashSet<Integer>();
        while(loop.add(n)){
            int remain, sum =0;
            do{
                remain = n % 10;
                n = n / 10;
                sum += remain*remain;
            }while(n > 0);
            if(sum != 1)
            n = sum;
            else return true;
        }
        return false;
    }
}