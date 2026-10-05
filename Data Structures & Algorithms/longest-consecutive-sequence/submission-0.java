class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        if(nums.length == 0){
            return 0;
        }

        for(int num : nums){
            set.add(num);
        }

        int start = 0;
        int maxLen = 1;
        int len = 0;
        for(int num : set){
            if(!set.contains(num-1)){
                start = num;
                len = 1;
                
                while(set.contains(start+1)){
                    start++;
                    len++;
                }
            }
            maxLen = Math.max(maxLen, len);
        }
        return maxLen;
    }
}
