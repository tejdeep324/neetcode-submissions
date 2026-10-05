class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length==0){
            return 0;
        }

        HashSet<Integer> res = new HashSet<>();
        for(int num:nums){
            res.add(num);
        }

        int longval = 0;
        for(int num:nums){
            if(!res.contains(num-1)){
                int currentSum = num;
                int currentval = 1;

                while(res.contains(currentSum + 1)){
                    currentSum +=1;
                    currentval +=1;
                }
                longval =  Math.max(longval,currentval);
                
            }
        }

        
        return longval;
        
    }
}
