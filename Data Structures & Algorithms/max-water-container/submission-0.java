class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int fp = 0;
        int sp = heights.length-1;

        while(fp < sp){
            int minH = 0;

            if(heights[fp] < heights[sp]){
                minH = heights[fp];
            }
            else if(heights[sp] < heights[fp]){
                minH = heights[sp];
            }
            else{
                minH = heights[fp];
            }
            int area = minH * (sp-fp);

            res = Math.max(res,area);

            if(heights[fp] < heights[sp]){
                fp++;
            }
            else{
                sp--;
            }
        }
        return res;
    }
}
