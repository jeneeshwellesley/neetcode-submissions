class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer>map = new HashMap<>();

        for(int i = 0;i < numbers.length;i++){
            int curr = target - numbers[i];
            if(!map.containsKey(curr)){
                map.put(numbers[i],i);
            }
            else{
                return new int[]{map.get(target - numbers[i]) + 1,i + 1};
            }
        }
        return new int[0];
    }
}
