class Solution {
    public boolean isPalindrome(String s) {
        String alpha = s.replaceAll("[^0-9A-Za-z]","").toLowerCase();
        String a = alpha.replace(" ","");

        String rev = new StringBuilder(a).reverse().toString();
        if(a.equals(rev)){
            return true;
        }
        return false;
        
    }
}
