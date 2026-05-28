class Solution {
    public String encode(List<String> strs) {
        StringBuilder word = new StringBuilder();
        for(String str : strs){
            int len = str.length();
            word.append(len);
            word.append('#');
            word.append(str);
        }
        return word.toString(); 
    }

    public List<String> decode(String str) {
        List<String>ans = new ArrayList<>();
        int i = 0;

        while(i < str.length()){
            int j = i;

            while(str.charAt(j) != '#'){
                j++;
            }
            int len = Integer.parseInt(str.substring(i,j));
            i = j + 1;
            j = i + len;
            ans.add(str.substring(i,j));
            i = j;
        }

        return ans;


    }
}
