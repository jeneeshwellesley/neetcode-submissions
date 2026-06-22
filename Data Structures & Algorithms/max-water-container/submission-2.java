class Solution {
    public int maxArea(int[] heights) {
        int ans = 0;
        int fp = 0;
        int sp = heights.length-1;

        while(fp < sp){
            int height = 0;
            int width = sp - fp;
            if(heights[fp] > heights[sp]){
                height = heights[sp];
            }
            else{
                height = heights[fp];
            }
            int area = height * width;

            ans = Math.max(ans,area);

            if(heights[fp] > heights[sp]){
                sp--;
            }
            else{
                fp++;
            }
        }
        return ans;
    }
}
