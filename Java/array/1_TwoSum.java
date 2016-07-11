import java.util.*;
/********************************************************************************************
 * Given an array of integers, return indices of the two numbers such that  				*
 * they add up to a specific target.														*
 * You may assume that each input would have exactly one solution.							*
 *																							*
 * Example:																					*
 * Given nums = [2, 7, 11, 15], target = 9,													*
 *																							*
 * Because nums[0] + nums[1] = 2 + 7 = 9,													*
 * return [0, 1].																			*
 * UPDATE (2016/2/13):																		*
 * The return format had been changed to zero-based indices. Please read the above 			*
 * updated description carefully.															*
 *																							*
 * Subscribe to see which companies asked this question										*
 *																							*
 *  Tag: array, hashtable																	*
 ********************************************************************************************/

class TwoSum{
	
	/* One-pass hash table. 
	 * While iterate and inserting element into the table, we also check if current element's 	*
	 * complement already exists in the table. If it exists, we return the solution immediately	*
	 * Time complexitly: O(n), Each look up in the table costs O(1)								*
	 * Space complexity: O(n)																	*/
	public int[] twoSum(int[] nums, int target) {
   	 	Map<Integer, Integer> map = new HashMap<>();
    	for (int i = 0; i < nums.length; i++) {
       	 int complement = target - nums[i];
       	 if (map.containsKey(complement)) {
           	 return new int[] { map.get(complement), i };
       	  }
       	 map.put(nums[i], i);
   	  	}
   	 throw new IllegalArgumentException("No two sum solution");
 	}
	 
	/* Two-pass hash table																		*
	 * Use two iterations. In the first iteration, we add each elements' value and its index to *
	 * the table. Then, in the second one, we check if each element's complements exists in the *
	 * table, except num[i] itself.																*
	 * Time complexitly: O(n), we traverse the list containing n twice, but since the hash table*
	 * reduces the look up time to O(1), the time complexitly is still O(n)						*
	 * Space complexity: O(n)																	*/
     public int[] twoSum2(int[] nums, int target) {
         Map<Integer, Integer> map = new HashMap <Integer, Integer>();
         for (int i = 0; i< nums.length; i++){
             map.put(nums[i], i);
         }
         for(int i = 0; i < nums.length; i++){
             int new_target = target - nums[i];
			 //O(1) search per time
             if(map.containsKey(new_target) && i != map.get(new_target)){ // can't be same indices
                 return new int[] {i, map.get(new_target)};
             }  
         }
         throw new IllegalArgumentException("No two sum solution");
     }
}
