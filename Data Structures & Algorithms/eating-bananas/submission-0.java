class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;//minimum k
        int right =0;
        for(int pile:piles){
            right = Math.max(pile,right);//maximum k
        }

        int result = right;

        while(left<=right){
            int k = left + (right-left)/2;

            long hoursneeded = 0;
            for(int pile:piles){
                hoursneeded += (pile + k -1)/k;

            }

            if(hoursneeded <= h){
                result = k;
                right = k-1;
            }else{
                left = k+1;
            }

        }
        return result;
        
        
    }
}
