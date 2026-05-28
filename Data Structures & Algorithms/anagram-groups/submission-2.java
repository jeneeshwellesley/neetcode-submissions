class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length < 1){
            return new ArrayList<>();
        }
        Map<String,List<String>>map = new HashMap<>();

        for(String word : strs){
            char[]arr = word.toCharArray();
            Arrays.sort(arr);
            String wr = new String(arr);

            if(!map.containsKey(wr)){
                map.put(wr,new ArrayList<>());
            }
            map.get(wr).add(word);
        }

        return new ArrayList<>(map.values());
        
    }
}
