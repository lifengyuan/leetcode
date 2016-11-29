/****************************************************************************************
 * Given an array of integers, find if the array contains any duplicates. 				*
 * Your function should return true if any value appears at least twice in the array, 	*
 * and it should return false if every element is distinct.								*
 * Tag: Array, Hashtable, Sort
 ****************************************************************************************/
class Solution {
	/* Time Complexity: O(n)
	 * Space Complexity: O(n)*/
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>(nums.length);
        for(int x: nums){
            if(set.contains(x)) return true;
            else set.add(x);
        }
        return false;
    }
	/* Time complexity : O(n \log n)O(nlogn). 
	 * Sorting is O(nlogn) and the sweeping is O(n). The entire algorithm is 
	 * dominated by the sorting step, which is O(nlogn).
	 * Space complexity : O(1). Space depends on the sorting implementation which, 
	 * usually, costs O(1)O(1) auxiliary space if heapsort is used.*/
	public boolean containsDuplicateSort(int[] nums) {
	    Arrays.sort(nums);
	    for (int i = 0; i < nums.length - 1; ++i) {
	        if (nums[i] == nums[i + 1]) return true;
	    }
	    return false;
	}
}