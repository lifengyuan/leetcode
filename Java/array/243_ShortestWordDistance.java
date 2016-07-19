/************************************************************************************************
 * Given a list of words and two words word1 and word2, return the shortest distance			*
 * between these two words in the list.															*
 * 																								*
 * For example,																					*
 * Assume that words = ["practice", "makes", "perfect", "coding", "makes"].						*
 * 																								*
 * Given word1 = “coding”, word2 = “practice”, return 3.										*
 * Given word1 = "makes", word2 = "coding", return 1.											*
 * 																								*
 * Note:																						*
 * You may assume that word1 does not equal to word2, and word1 and word2 are both in the list.	*
 * Tag: Array																					*
 ************************************************************************************************/
class Solution {
	/* One Pass Solution
	 * keeping two indices i1 and i2 where we store the most recent locations 
	 * of word1 and word2. Each time we find a new occurrence of one of the words, 
	 * we do not need to search the entire array for the other word, since we already 
	 *have the index of its most recent occurrence.
	 *
	 *Time Complexity: O(n), linear
	 *Space Complexity:O(1)*/
    public int shortestDistance(String[] words, String word1, String word2) {
        int w1 = -1, w2 = -1, miniDistance = words.length;
        for(int i = 0; i < words.length; i++){
            if(words[i].equals(word1))
            w1 = i;
            else if (words[i].equals(word2))
            w2 = i;
            if(w1 != -1 && w2 != -1)
            miniDistance = Math.min(miniDistance, Math.abs(w1 - w2));
        }
        return miniDistance;
    }
}