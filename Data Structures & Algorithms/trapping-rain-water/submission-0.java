class Solution {
    public int trap(int[] height) {
        if(height==null || height.length == 0){
            return 0;
        }
        int n = height.length;
        int leftmax = height[0],rightmax=height[n-1];
        int i=1,j=n-2;
        int total=0;
        while(i<=j){
            if(leftmax<=rightmax){
                if(leftmax>height[i]){
                    total += (leftmax - height[i]);
                }else{
                    leftmax = height[i];
                }
                i++;
            }else{
                if(rightmax>height[j]){
                    total+=(rightmax - height[j]);
                }else{
                    rightmax = height[j];
                }
                j--;
            }
        }

        return total;
        
    }
}
