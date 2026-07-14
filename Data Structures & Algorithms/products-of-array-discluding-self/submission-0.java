class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] ans = new int[n];

        for(int idx=0; idx<n; idx++) {
            int prod = 1;
            int left = idx-1, right = idx+1;

            while(left >= 0) {
                prod *= nums[left--];
            }

            while(right < n) {
                prod *= nums[right++];
            }

            ans[idx] = prod;
        }

        return ans;
    }
}  
