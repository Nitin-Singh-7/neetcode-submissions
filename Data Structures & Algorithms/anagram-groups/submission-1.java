class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        HashMap<String, List<String>> map = new HashMap<>();

        for(String str : strs){
            String freqStr = getFrequency(str);
            
            if(map.containsKey(freqStr)){
                map.get(freqStr).add(str);
            }
            else{
                List<String> strList= new ArrayList<>();
                strList.add(str);
                map.put(freqStr, strList);
            }
        }
        return new ArrayList<>(map.values());
    }

    public static String getFrequency(String str){
        int[] freq = new int[26];

        for(char c : str.toCharArray()){
            freq[c - 'a']++;
        }

        StringBuilder sb = new StringBuilder();
        char c = 'a';
        for(int i : freq){
            sb.append(c);
            sb.append(i);
            c++;
        }
        return sb.toString();
    }
}
