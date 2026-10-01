class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean fin = false;
        HashMap<Integer,Boolean> res = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(res.containsKey(nums[i])){
                fin = true;
            }else{
                res.put(nums[i],true);
            }
        }
        return fin;
        
    }
}