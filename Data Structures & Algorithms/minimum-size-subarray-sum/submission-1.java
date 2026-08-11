class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int sum = 0;
        int minLen = nums.length+1;
        int k = 0;

        for(int i=0; i<nums.length; i++) {
            sum += nums[i];

            while(k <= i && sum >= target) {
                minLen = Math.min(minLen, i-k+1);
                sum -= nums[k++];
            }
        }        

        return minLen == nums.length+1 ? 0 : minLen;
    }
}