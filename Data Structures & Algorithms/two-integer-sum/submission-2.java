class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[][] ans = new int[nums.length][2];
        for(int i=0;i<nums.length;i++){
            ans[i][0] = nums[i];
            ans[i][1] = i;
        }

        Arrays.sort(ans,(a,b)->Integer.compare(a[0],b[0]));
        int left = 0;
        int right = nums.length - 1;
        while(left<right){
            int currentSum = ans[left][0] + ans[right][0];
            if(currentSum == target){
                return new int[] { Math.min(ans[left][1],ans[right][1]),Math.max(ans[left][1],ans[right][1])};
            }else if(currentSum < target){
                left++;
            }else if(currentSum > target){
                right--;
            }
        }

        return new int[]{};
        
    }
}
