class Solution {
    public int maxArea(int[] heights) {
        int lp = 0;
        int rp = heights.length-1;
        int maxarea = 0;
        for(int i= 0 ; i<heights.length ; i++){
            while(lp < rp){
              int height = Math.min(heights[lp] ,heights[rp] );
              int width = rp-lp;
              int area = height * width;
               maxarea = Math.max(area , maxarea);
              if(heights[lp] < heights[rp]){
                lp++;
              }
              else{
                rp--;
              }
            }
        }
        return maxarea;
    }
}
