class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        List<List<String>>lists = new ArrayList<>();

        for(String word : strs){
            char[]arr = word.toCharArray();
            Arrays.sort(arr);
            String wordd = new String(arr);
            if(map.containsKey(wordd)){
                map.get(wordd).add(word);
            }
            else{
                map.put(wordd, new ArrayList<>(List.of(word)));
            }
        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            lists.add(entry.getValue());
        }
        return lists;

        
    }
}
