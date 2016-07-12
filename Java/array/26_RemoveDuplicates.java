/****************************************************************************************************
 * Given a sorted array, remove the duplicates in place such that each element appear only 			*
 * once and return the new length.																	*
 * 																									*
 * Do not allocate extra space for another array, you must do this in place with constant memory.	*
 * 																									*
 * For example,																						*
 * Given input array nums = [1,1,2],																*
 * 																									*
 * Your function should return length = 2, with the first two elements of nums being 1 and 2 		*
 * respectively. It doesn't matter what you leave beyond the new length.							*
 * Subscribe to see which companies asked this question 											*
 *																									*
 * Tag : array, two pointer																			*
 ****************************************************************************************************/

class RemoveDuplicates{
	/* Since the array is already sorted, we can keep two pointer i and j, where i is the slow one	*
	 * j is the faster one. as long as nums[j] = nums[i], we increment j to skip the duplicate. 	*
	 * When we encounter nums[j]≠nums[i], the duplicate run has ended so we must copy its value 	*
	 * to nums[i+1]. i is then incremented and we repeat the same process again until j reaches the	*
	 * end of array.																				*
	 * Time complexity: O(n) Assume n is length of array. Each of i and j traverses most n steps.	*
	 * Space complexity: O(1)																		*/
	public int removeDuplicates(int [] nums){
		if(nums.length == 0) return 0;
		int i = 0;
		for(int j = 1; j < nums.length; j++){
			if(nums[j] != nums[i]){
				i++;
				nums[i] = nums[j]
			}
		}
		return i + 1;
	}