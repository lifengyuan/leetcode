/********************************************************************
 * Given an index k, return the kth row of the Pascal's triangle.	*
 *																	*
 * For example, given k = 3,										*
 * Return [1,3,3,1].												*
 * 																	*
 * Note:															*
 * Could you optimize your algorithm to use only O(k) extra space?  *
 ********************************************************************/

public class PasclasTriangle2 {
	/*Time Complexity: O(n)
	 *Space Complexity: O(1)*/
    public List<Integer> getRow(int rowIndex) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i = 0;i<rowIndex+1;i++){
    	    	result.add(1);
    		    for(int j=i-1;j>0;j--) {
    			    result.set(j, result.get(j-1) + result.get(j));
    		    }
        }
        return res;
    }
}