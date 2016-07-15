/************************************************************************************************
 * Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array. *
 * 																								*
 * Note:																						*
 * You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold 	*
 * additional elements from nums2. The number of elements initialized in nums1 and nums2 are	* 
 * m and n respectively.																		*
 *																						 		*
 * Tag: array																					*
 ************************************************************************************************/

class MergeSortedArray {
	/* Sorting from behind, We first merge the same number of m elements from nums2 array	*
	 * to nums1, After that, if n > m, nums2 still contain elements, we can put all of the 	*
	 * left element to the front of nums1(because both two array are sorted.)				*
	 * Time complexity: O(m + n)															*
	 * Space complexity: O(1)																*/
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int newIndex = 0;
        int aIndex = m - 1;
        int bIndex = n - 1;
    
        for(newIndex = m + n - 1 ; newIndex >= 0 ; newIndex--){
            if(bIndex < 0){
                //Sorting complete. remaining numbers in nums1 are already sorted
                break;
            }
            if(aIndex >= 0 && nums1[aIndex] >= nums2[bIndex]){
                nums1[newIndex] = nums1[aIndex];
                aIndex--;
            }else{
                nums1[newIndex] = nums2[bIndex];
                bIndex--;
            }
        }
    }
}