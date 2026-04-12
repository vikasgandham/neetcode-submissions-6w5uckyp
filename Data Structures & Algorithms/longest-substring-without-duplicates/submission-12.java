class Solution {
    public int lengthOfLongestSubstring(String s) {

        //zxyzxyz
        //i=0
        //j=1

        Map<Character, Integer> seen = new HashMap<Character, Integer>();
        int i =0;
        int maxLen = 0;
        for (int j=0; j < s.length(); j++){
            
            if (seen.containsKey(s.charAt(j))){
                i = Math.max(seen.get(s.charAt(j)) + 1,i);
            } 
            seen.put(s.charAt(j), j);
            maxLen = Math.max(maxLen, j-i+1);
      
        }
        return maxLen;

        
    }
}
