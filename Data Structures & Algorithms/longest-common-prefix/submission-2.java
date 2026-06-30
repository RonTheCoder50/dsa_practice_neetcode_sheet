class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs[0].length() == 0) return "";
        StringBuilder sb = new StringBuilder();
        int k=0;

        for(int i=0; i<strs[0].length(); i++) {
            char ch = strs[0].charAt(k);

            for(int j=1; j<strs.length; j++) {
                if(strs[j].length() <= k || strs[j].length() == 0) {
                    return sb.toString();
                } else if(ch != strs[j].charAt(k)) {
                    return sb.toString();
                }
            }

            sb.append(ch);
            k++;
        }

        return sb.length() == 0 ? "" : sb.toString(); 
    }
}