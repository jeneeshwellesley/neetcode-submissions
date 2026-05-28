class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>map1 = new HashMap<>();

        for(String word : strs){
            char[]arr = word.toCharArray();
            Arrays.sort(arr);
            String sorted = new String(arr);

            if(!map1.containsKey(sorted)){
                map1.put(sorted,new ArrayList<>());
            }
            map1.get(sorted).add(word);
        }

        return new ArrayList<>(map1.values());
    }
}
