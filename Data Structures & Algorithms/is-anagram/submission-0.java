class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> countMap = new HashMap<Character, Integer>();
        for (char c: s.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
        }
        
        for (char c: t.toCharArray()){
            if(countMap.containsKey(c)){
                countMap.put(c,countMap.get(c)-1);
            }else{
                return false;
            }
        }


        for(int value : countMap.values()){
            if(value != 0){
                return false;
            }
        }
        return true;

    }
}
