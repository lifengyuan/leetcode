/************************************************************************************
 * Given an array of size n, find the majority element. 							*
 * The majority element is the element that appears more than ⌊ n/2 ⌋ times.		*
 * 																					*
 * You may assume that the array is non-empty and the majority element always exist	* 
 * in the array.																	*
 ************************************************************************************/
class Solution {
	/*
     * Time Complexity: O(n)
	 * Space Complexity: O(1)
	 */
    public int majorityElement(int[] nums) {
        int counter = 1;
        int majority = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(counter == 0){
                majority = nums[i];
                counter = 1;
            }
            else if(majority == nums[i]){
                counter ++;
            }
            else counter --;
        }
        return majority;
    }
}