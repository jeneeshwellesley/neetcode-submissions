class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr = new int[2];
        Map<Integer, Integer>map1 = new HashMap<>();

        for(int i = 0;i < nums.length;i++){
            int diff = target - nums[i];
            if(map1.containsKey(diff)){
                arr[0] = map1.get(diff);
                arr[1] = i;
                return arr;
            }
            else{
                map1.put(nums[i],i);
            }
        }
        return arr;
    }
}
