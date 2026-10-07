class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        int n=position.length;
        int[][] ans = new int[n][2];
        for(int i=0;i<n;i++){
            ans[i][0]= position[i];
            ans[i][1]=speed[i];
        }

        Arrays.sort(ans,(a,b)->Integer.compare(b[0],a[0]));
        for(int i=0;i<n;i++){
            double time = (double)(target - ans[i][0])/ans[i][1];
            if(stack.isEmpty() || time > stack.peek()){
                stack.push(time);
            }
            

        }

        return stack.size();
        
    }
}
