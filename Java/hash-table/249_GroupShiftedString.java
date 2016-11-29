/*
 * Given a string, we can "shift" each of its letter to its successive letter, 
 * for example: "abc" -> "bcd". We can keep "shifting" which forms the sequence:
 *
 * "abc" -> "bcd" -> ... -> "xyz"
 * Given a list of strings which contains only lowercase alphabets, 
 * group all strings that belong to the same shifting sequence.
 *
 * For example, given: ["abc", "bcd", "acef", "xyz", "az", "ba", "a", "z"], 
 * A solution is:
 * 
 * [
 *  ["abc","bcd","xyz"],
 *  ["az","ba"],
 *  ["acef"],
 *  ["a","z"]
 * ]
 */

class Solution {
    public List<List<String>> groupStrings(String[] strings) {
    //Create a hashmap. key is a number (the offset compared to its first char), 
    //value is a list of strings which have the same offset.
    //For each string, convert it to char array 
    //Then subtract its first character for every character
    //eg. "abc" -> "0,1,2,"        "am"->"0,12,"
        List<List<String>> result = new ArrayList<List<String>>();
        Map<String,List<String>> map = new HashMap<String, List<String>>();
        for(String str : strings){
            int offset = str.charAt(0) - 'a';
            String key = "";
            for(int i = 0; i< str.length(); i++){
                char c = (char)(str.charAt(i) - offset);
                if(c < 'a')
                    c += 26;
                key += c;
            }
            if(!map.containsKey(key)){
                List<String> list = new ArrayList<String>();
                map.put(key, list);
            }
            map.get(key).add(str);
        }
        for (String key : map.keySet()) {
            List<String> list = map.get(key);
            Collections.sort(list);
            result.add(list);
        }
        return result;
    }
}