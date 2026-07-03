class Solution {
    public int arrangeCoins(int n) {
        int idx = 1, count = 0;

        while(idx <= n) {
            n -= idx;
            count += 1;
            idx += 1;
        }

        return count;
    }
}