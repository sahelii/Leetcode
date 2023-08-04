/*
 * @lc app=leetcode id=49 lang=java
 *
 * [49] Group Anagrams
 */

// @lc code=start
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, List<String> > map = new HashMap<>();
        for(String i:strs){
            char arr[] = i.toCharArray();
            Arrays.sort(arr);
            String newSortedi= new String(arr);
            if(!map.containsKey(newSortedi)){
                map.put(newSortedi, new ArrayList<>());

            }
            map.get(newSortedi).add(i);
        }
        return new ArrayList<>(map.values());
        
    }
}
// @lc code=end

