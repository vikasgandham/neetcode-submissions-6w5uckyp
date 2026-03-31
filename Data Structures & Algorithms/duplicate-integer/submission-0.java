

class Solution {
    public boolean hasDuplicate(int[] nums) {

        HashMap<Integer, Integer> countMap = new HashMap<Integer, Integer>();
        for(int num: nums){
            countMap.put(num, countMap.getOrDefault(num, 0) + 1);
        }

        for (int value : countMap.values()) {
            if (value > 1){
                return true;
            }
        }
        return false;        
    }
}