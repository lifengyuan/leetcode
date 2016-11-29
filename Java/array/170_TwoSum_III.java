public class TwoSum3 {
    List<Integer> nums = new ArrayList<>();
    HashMap<Integer, Integer> map = new HashMap<>();
    // Add the number to an internal data structure.
	public void add(int number) {
	    nums.add(number);
	    if(!map.containsKey(number))
	        map.put(number,0);
	    map.put(number,map.get(number)+1);
	}

    // Find if there exists any pair of numbers which sum is equal to the value.
	public boolean find(int value) {
	    for(int i = 0; i<nums.size();i++){
	        int num1 = nums.get(i);
	        int num2 = value - num1;
	        if(!map.containsKey(num2))
	        continue;
	        if(num1 == num2 && map.get(num2)>=2)
	        return true;
	        if(num1 != num2 && map.get(num2) > 0)
	        return true;
	    }
	    return false;
	}
}


// Your TwoSum object will be instantiated and called as such:
// TwoSum twoSum = new TwoSum();
// twoSum.add(number);
// twoSum.find(value);