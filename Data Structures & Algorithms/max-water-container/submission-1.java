class Solution {
    public int maxArea(int[] heights) {
        if(heights==null || heights.length==0){
            return 0;
        }

        int n = heights.length;
        int area = 0;
        
        int left=0;
        int right = heights.length-1;
        while(left<right){
            int minval = Math.min(heights[left],heights[right]);
            area = Math.max(area,minval*(right-left));

            if(heights[left]>heights[right]){
                right--;
            }else{
                left++;
            }
            
        }

        return area;
        
    }
}
