class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() <= 1) return true;

        int lp = 0, rp = s.length()-1;
        while(lp <= rp) {
            //avoid non-ascii chars!
            while (lp < rp && !Character.isLetterOrDigit(s.charAt(lp))) {
                lp++;
            }

            while (lp < rp && !Character.isLetterOrDigit(s.charAt(rp))) {
                rp--;
            }

            if(lp < rp && Character.toLowerCase(s.charAt(lp)) 
            != Character.toLowerCase(s.charAt(rp))) {
                return false;
            } 

            lp++;
            rp--;
        }

        return true;
    }
}
