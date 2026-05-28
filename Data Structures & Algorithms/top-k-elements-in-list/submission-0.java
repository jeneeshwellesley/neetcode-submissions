class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer>map1 = new HashMap<>();
        int[] arr = new int[k];

        for(int i = 0;i<nums.length;i++){
            int key = nums[i];
            if(map1.containsKey(key)){
                map1.put(key, map1.get(key)+1);
            }
            else{
                map1.put(key,1);
            }
            
        }

        List<Map.Entry<Integer,Integer>>list = new ArrayList<>(map1.entrySet());

        list.sort((a,b) -> b.getValue() - a.getValue());

        for(int i = 0;i < k;i++){
            arr[i] = list.get(i).getKey();
        }

        return arr;

    }
}
