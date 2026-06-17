class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>>res = new ArrayList<>();

        for(int i = 0;i<nums.length;i++){
            if(i != 0 && nums[i] == nums[i-1]){
                continue;
            }
            else if(nums[i]>0){
                break;
            }
            int fp = i+1;
            int sp = nums.length-1;

            while(fp < sp){
                int sum = nums[i] + nums[fp] + nums[sp];

                if(sum > 0){
                    sp--;
                }
                else if(sum < 0){
                    fp++;
                }
                else{
                    res.add(new ArrayList<>(List.of(nums[i],nums[fp],nums[sp])));
                    sp--;
                    fp++;
                    while(fp < sp &&  nums[fp] == nums[fp-1]){
                        fp++;
                    }
                    while(fp < sp && nums[sp] == nums[sp + 1]){
                        sp--;
                    }
                }
            }
        }

        return res;

    }
}