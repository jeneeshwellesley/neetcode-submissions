class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 0){
            return 0;
        }
        Set<Integer>set = new HashSet<>();

        for(int i = 0;i<nums.length;i++){
            set.add(nums[i]);
        }
        int ans = 1;
        
        for(Integer num : set){
            if(!set.contains(num-1)){
                int longest = 1;
                int curr = 1;

                while(set.contains(num + longest)){
                    curr++;
                    longest++;
                }
                ans = Math.max(ans,curr);
            }

        }
        return ans;





        
    }
}
