class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer>set = new HashSet<>();
        int ans = 0;

        for(int num : nums){
            set.add(num);
        }
        for(int num : set){
            if(!set.contains(num - 1)){
                int longest = 1;
                while(set.contains(num + longest)){
                    longest++;
                }
                ans = Math.max(ans, longest);
            
            }
        }

        return ans;
    }
}
