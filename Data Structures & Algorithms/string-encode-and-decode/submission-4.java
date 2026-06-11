class Solution {

    public String encode(List<String> strs) {
        if(strs.isEmpty()){
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            int len = str.length();
            sb.append(len).append('#').append(str);
        }
        return new String(sb);
    }

    public List<String> decode(String str) {
        if(str.length() <= 0){
            return new ArrayList<>();
        }
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
