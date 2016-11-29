/**
 * Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a
 * specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must
 * be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 * <p>
 * Tags: Array, Two Pointers, Binary Search
 * Similar: Problems (E) Two Sum
 */
public class TwoSum2 {
    /**
        * Two pointers.
        * Use two indices from both ends of the array and compare sum with target.
        * If target is larger, move the end index.
        * If target is smaller, move the start index.
        * Stop till we find the target.
        */
    public int[] twoSum(int[] numbers, int target) {
        int head = 0, tail = numbers.length -1;
        while(head<tail){
            long sum = numbers[head] + numbers[tail];
            if(sum > target)
                tail--;
            else if(sum < target)
                head++;
            else 
                break;
        }
        return new int[]{head+1, tail+1}; //both should add 1, cannot be ++
        
    }
}