class Solution {
    public int maxArea(int[] heights) {
        int res = 0;
        int fp = 0;
        int sp = heights.length-1;

        while(fp < sp){
            int height = Math.min(heights[fp],heights[sp]);
            int area = (sp - fp) * height;
            
            res = Math.max(res,area);

            if(heights[fp] < heights[sp]){
                fp++;
            }
            else if(heights[sp] < heights[fp]){
                sp--;
            }
            else{
                fp++;
            }
        }
        return res;
    }
}
