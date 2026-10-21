class Solution {
    /*

 
    */
    public int lengthOfLongestSubstring(String s) {
        int l=0;
        int maxLen=0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(int r=0;r<s.length();r++){

            char currentChar = s.charAt(r);
            if(map.containsKey(currentChar)){
                l = Math.max(map.get(currentChar)+1, l);
            }
            map.put(currentChar, r);
            maxLen = Math.max(maxLen, r-l+1);
            
        }
        return maxLen;
        
    }
}
