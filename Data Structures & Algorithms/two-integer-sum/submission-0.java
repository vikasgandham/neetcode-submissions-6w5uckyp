class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> m = new HashMap<Integer, Integer>();
        for (int i=0; i < nums.length; i++){
            int num = nums[i];
            int look = target-num;
            if (m.containsKey(look)){
                return new int[] {m.get(look), i};
            }else{
                m.put(num, i);
            }
        }
        return new int[] {0, 0};
    }
        
    
}
