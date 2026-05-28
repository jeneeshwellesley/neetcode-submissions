class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int fp = 0;
        int sp = numbers.length - 1;

        while(fp < sp){
            int sum = numbers[fp] + numbers[sp];

            if(sum > target){
                sp--;
            }
            else if(sum < target){
                fp++;
            }
            else{
                return new int[]{fp + 1, sp + 1};
            }
        }
        return new int[0];
    }
}
