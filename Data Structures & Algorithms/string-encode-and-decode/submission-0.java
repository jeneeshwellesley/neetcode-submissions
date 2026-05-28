class Solution {
    public String encode(List<String> strs){
        StringBuilder word = new StringBuilder();
        for(String str : strs){
            word.append(str.length()).append('#').append(str);
        }
        return word.toString();
    }
    public List<String> decode(String str){
        int i = 0;
        List<String>ans = new ArrayList<>();

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
