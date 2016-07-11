/****************************************************************************************************
 * Given an array and a value, remove all instances of that value in place and return the new length*
 *																									*
 * Do not allocate extra space for another array, you must do this in place with constant memory.	*
 *																									*
 * The order of elements can be changed. It doesn't matter what you leave beyond the new length.	*
 * 																									*
 * Example:																							*
 * Given input array nums = [3,2,2,3], val = 3														*
 * 																									*
 * Your function should return length = 2, with the first two elements of nums being 2.				*					*
 *																									*
 *  Tag: array, two-pointer																			*
 ***************************************************************************************************/

class RemoveElement{
	
	/* Two pointer, catch from both side. 
	 * When we encounter nums[i] = val, we can swap the current element out with the last one 	*
	 * and dispose the last one. This could reduce the array's size by 1. Even the last element	*
	 * that we swapped is the value that need to be remove, we still check this element in the  *
	 * next iteration.																			*
	 * Time complexitly: O(n), Both i and j traverse at most n steps. The numer of assignment   *
	 * operation is equal to the number of element to remove, so it is more efficient.          *
	 * Space complexity: O(1)																	*/
    public int removeElement(int[] nums, int val) {
        if (nums == null || nums.length == 0)
        return 0; //No element could be remove.
        int i = 0;
        int j = nums.length;
        while(i < j){
            if(nums[i] == val){
                nums[i] = nums[j - 1];
                j--;
            }
            else
                i++;
        }
        return j;
    }
	 
	/* Two pointer copycat																		*
	 * Use two pointer, where i is the slow-runner, j is the fast-runner. 						*
	 * When nums[j] equal to the given value, skip this element by incrementing j. As long as   *
	 * nums[j] not equal to val, we copy nums[j] to nums[i] and increment both indexes at the   *
	 * same time. Repeat the process util j reaches the end of the array and the new length is i*
	 * Time complexitly: O(n), Assume the array has a total of n elements, both i and j traverse*
	 * at most 2n steps																			*
	 * Space complexity: O(1)																	*/
	public int removeElement(int[] nums, int val) {
	    int i = 0;
	    for (int j = 0; j < nums.length; j++) {
	        if (nums[j] != val) {
	            nums[i] = nums[j];
	            i++;
	        }
	    }
	    return i;
	}
}
