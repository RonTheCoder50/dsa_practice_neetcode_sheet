class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int lp = 0, rp = nums.length-1;

        while(lp <= rp) {
            int mid = lp + (rp - lp) / 2;
            min = Math.min(min, nums[mid]);

            if(nums[mid] <= nums[rp]) {
                rp = mid-1;
            } else {
                lp = mid+1;
            }
        }

        return min;
    }
}
