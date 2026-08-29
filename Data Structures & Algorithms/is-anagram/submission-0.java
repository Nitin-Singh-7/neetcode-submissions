class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length() != t.length()){
            return false;
        }

        int[] letters = new int[26];
        for(int i = 0; i < s.length(); i++){
            int slot = s.charAt(i) - 'a';
            letters[slot] += 1;
        }

        for(int i = 0; i < t.length(); i++){
            int slot = t.charAt(i) - 'a';
            letters[slot] -= 1;
        }

        for(int i = 0; i < letters.length; i++){
            if(letters[i] != 0){
                return false;
            }
        }
        return true;
    }
}
