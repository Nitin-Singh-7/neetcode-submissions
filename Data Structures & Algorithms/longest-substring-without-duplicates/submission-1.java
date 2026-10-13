class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int left = 0;
        int right = 0;
        //int count = 1;
        int currCount = 0;
        int maxCount = 0;

        // x = 120, y = 121, z = 122,

        HashSet<Character> seen = new HashSet<>();

        while(right < s.length()){
            char currentRightChar = s.charAt(right);
            if(!seen.contains(currentRightChar)){
                seen.add(currentRightChar);
                currCount++;

                if(currCount > maxCount){
                maxCount = currCount;
                }
                right++;
            }
            else{
                char charAtLeft = s.charAt(left);
                seen.remove(charAtLeft);
                currCount--;
                left++;
            }
            
        }

        return maxCount;
    }
}

// z x -> x y -> y z -> 
