class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[]ans = new int[temperatures.length];
        for(int i = 0;i<temperatures.length;i++){
            int sp = i+1;
            int count = 0;
            boolean isFound = false;

            while(sp <= temperatures.length-1){
                if(temperatures[sp] > temperatures[i]){
                    count++;
                    isFound = true;
                    break;
                }
                else{
                    count++;
                    sp++;
                }
            }
            if(isFound){
                ans[i] = count;
            }
            else{
                ans[i] = 0;
            }
            
        }
        return ans;
    }
}
