class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer>map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            int tarNum = target - nums[i];

            if(map.containsKey(tarNum)){
                return new int[]{map.get(tarNum),i};
            }
            else{
                map.put(nums[i], i);
            }
        }
        return new int[]{};
    }
}
