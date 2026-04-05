class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> res = new ArrayList<>();
        // -4, -1, -1, 0, 1, 2
        int len = nums.length;
        for (int i=0; i < len-2; i++){
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int left = i+1;
            int right = len -1;
            int target = -nums[i];

            while (left < right){
                int sum = nums[left] + nums[right];
                if (sum == target){
                    res.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    left += 1;
                    right -= 1;
                }
                else if(sum < target){
                    left += 1;
                }
                else{
                    right -= 1;
                }
            }
        }
        return res;   
    }
}
