class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int maxlen = 0;
        HashSet<Character> res = new HashSet<>();
        for(int right=0;right<s.length();right++){
            char curr = s.charAt(right);

            while(res.contains(curr)){
                res.remove(s.charAt(left));
                left++;
            }

            res.add(s.charAt(right));
            maxlen = Math.max(maxlen,right-left+1);

        }
        return maxlen;
        
    }
}
