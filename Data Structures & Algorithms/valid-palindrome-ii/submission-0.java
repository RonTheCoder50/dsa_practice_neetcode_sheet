class Solution {
    public boolean validPalindrome(String s) {
        int lp = 0, rp = s.length()-1;

        while(lp < rp) {
            if(s.charAt(lp) != s.charAt(rp)) {
                return isPalin(s, lp+1, rp) || isPalin(s, lp, rp-1);
            }

            lp++;
            rp--;
        }

        return true;
    }

    public boolean isPalin(String str, int lp, int rp) {
        while(lp < rp) {
            if(str.charAt(lp) != str.charAt(rp)) {
                return false;
            }

            lp++;
            rp--;
        }

        return true;
    }
}