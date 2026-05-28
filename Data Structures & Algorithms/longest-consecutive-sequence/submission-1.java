class Solution {
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer>set = new HashSet<>();

        for(int num : nums){
            set.add(num);
        }

        for(int num : set){
            int longest = 1;

            if(!set.contains(num-1)){
                while(set.contains(num + longest)){
                    longest++;
                }
            }

            ans = Math.max(longest,ans);
        }

        return ans;
        
    }
}
