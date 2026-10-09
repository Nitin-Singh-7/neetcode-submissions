class Solution {
    public int maxArea(int[] nums) {
        int left = 0;
        int right = nums.length-1;

        int currArea = 0;
        int maxArea = 0;
        while(left < right) {
            int min = Math.min(nums[left], nums[right]);
            int steps = right - left;

            currArea = min * steps;

            if(currArea > maxArea){
                maxArea = currArea;
            }

            if(min == nums[left]){
                left++;
            }
            else if(min == nums[right]){
                right--;
            }
            else {
                right--;
            }
            
        }

        return maxArea;
    }


}
