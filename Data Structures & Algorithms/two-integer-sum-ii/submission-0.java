class Solution {
    public int[] twoSum(int[] numbers, int target) {
        
        if(numbers==null || numbers.length==0){
            return new int[] {};
        }
        int n = numbers.length;

        int[][] base = new int[n][2];
        for(int i=0;i<n;i++){
            base[i][0] = numbers[i];
            base[i][1] = i;
        }

        Arrays.sort(base,(a,b)->Integer.compare(a[0],b[0]));
        int right = numbers.length - 1;
        int left = 0;
        while(left < right){
            int currentSum = base[left][0] + base[right][0];
            if(currentSum == target){
                return new int[]{Math.min(base[left][1],base[right][1])+1,Math.max(base[left][1],base[right][1])+1};
            }else if(currentSum < target){
                left++;
            }else{
                right--;
            }
        }

        return new int[] {};
        
    }
}
