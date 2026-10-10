class Solution {
    /*

    [3,4,5,6] t= 7

    {3, 0}
    d=3
    */
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> lookup = new HashMap<Integer, Integer>();

        for(int i=0; i< nums.length; i++){
            int diff = target-nums[i];
            if (lookup.containsKey(diff)){
                return new int[] {lookup.get(diff), i};
            }else{
                lookup.put(nums[i], i);
            }
            
        }
        return new int[] {-1,-1};
    }
}
