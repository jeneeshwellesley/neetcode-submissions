class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>set = new HashSet<>();
        Arrays.sort(nums);

        for(int i = 0;i < nums.length;i++){
            if(nums[i] > 0){
                break;
            }
            int fp = i + 1;
            int sp = nums.length-1;

            while(fp < sp){
                int sum = nums[i] + nums[fp] + nums[sp];
                if(sum > 0){
                   sp--;
                }
                else if(sum < 0){
                    fp++;
                }
                else {
                    List<Integer>temp = new ArrayList<>(List.of(nums[i],
                    nums[fp],nums[sp]));
                    Collections.sort(temp);
                    set.add(temp);
                    fp++;
                    sp--;
                }
            }
        }

        return new ArrayList<>(set);
    }
}
