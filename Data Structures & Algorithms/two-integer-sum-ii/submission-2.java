class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[]ans = new int[2];
        Map<Integer,Integer>map = new HashMap<>();

        for(int i = 0;i<numbers.length;i++){
            int low = 1;
            int high = numbers.length-1;

            int tempTar = target - numbers[i];
            if(!map.containsKey(tempTar)){
                map.put(numbers[i],i);

                while(low <= high){
                    int mid = low + (high-low) / 2;
                    int value = numbers[mid];

                    if(value < tempTar){
                        low = mid + 1;
                    }
                    else if(value > tempTar){
                        high = mid - 1;
                    }
                    else{
                        if(map.containsKey(target - value)){
                            int ind = map.get(target-value);
                            return new int[]{ind + 1,mid + 1};
                        }
                    }
                }
            }
        }

return ans;
    }
   
}
