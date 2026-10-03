class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
            sb.append(s.length()).append('#').append(s);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {

        List<String> result = new ArrayList<>();

        // [#5Hello#5World]
        int i = 0;
        while(i < str.length()){

            int hashIndex = str.indexOf('#', i);
            int length = Integer.parseInt(str.substring(i, hashIndex));

            int start = hashIndex + 1;
            int end = start + length;
            String word = str.substring(start, end);
            result.add(word);
            i = end;
        }
        return result;
    }
}
