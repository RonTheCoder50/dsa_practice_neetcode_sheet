class Solution {
    public void rotate(int[] nums, int k) {
        if(k >= nums.length) {
            k = k % nums.length;
        }
        
        //reverse full array
        reverse(nums, 0, nums.length-1);

        //rotate first half from 0 to k-1
        reverse(nums, 0, k-1);

        //rotate second half from k to n-1
        reverse(nums, k, nums.length-1);
    }

    public void reverse(int nums[], int lp, int rp) {
        while(lp <= rp) {
            int tmp = nums[lp];
            nums[lp] = nums[rp];
            nums[rp] = tmp;

            lp++;
            rp--;
        }
    }
}