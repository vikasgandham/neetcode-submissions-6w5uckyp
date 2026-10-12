class Solution {
    /*
     4,5,6,1,2,3 1

     5,6,7,8,9,10,1,2,3,4

     l=0 r= 5
     mid = 2

     nums[mid] = 5
     [6,1,2] l = 3 r=5
     mid = 4

     3,5,6,

     */


    public int search(int[] nums, int target) {

        int l=0;
        int r=nums.length-1;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if (nums[mid] == target){
                return mid;
            }
            //left sorted
            if (nums[l] <= nums[mid]){
                if(nums[l]<= target && nums[mid] > target){
                    r = mid-1;
                }else{
                    l = mid+1;
                }
            }else{
                // right sorted 
                if (nums[mid] < target && target <= nums[r]){
                    l = mid+1;
                }else{
                    r = mid-1;
                }

            }
        }

        return -1;
        
    }
}
