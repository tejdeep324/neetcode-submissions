class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxarea = 0;
        int n = heights.length;
        for(int i=0;i<=n;i++){
            int curr = (i==n)?0:heights[i];

            while(!stack.isEmpty() && curr < heights[stack.peek()]){
                int h = heights[stack.pop()];
                int w = stack.isEmpty()? i:i-stack.peek()-1;

                maxarea = Math.max(maxarea,h*w);
            }

            stack.push(i);
        }

        return maxarea;
        
    }
}
