class Solution {
    public int maxArea(int[] heights) {
        int lp = 0, rp = heights.length-1;
        int maxWater = 0;

        while(lp < rp) {
            int min = Math.min(heights[lp], heights[rp]);
            int width = rp - lp;
            int water = width * min;
            maxWater = Math.max(water, maxWater);

            if(heights[lp] < heights[rp]) {
                lp++;
            } else {
                rp--;
            }
        }

        return maxWater;
    }
}
