class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<int[]>stack = new Stack<>();
        int[]ans = new int[n];

        for(int i = 0;i < n;i++){
            if(!stack.isEmpty()){
                while(!stack.isEmpty() && temperatures[i] > stack.peek()[0]){
                    int[]curr = stack.pop();
                    ans[curr[1]] = i - curr[1];
                }
            }
            stack.push(new int[]{temperatures[i],i});
        }
        return ans;

}
}

