class Solution {
    public int removeElement(int[] nums, int val) {
        // i stay still until stored value that is != val.
        // so everytime --n and found non-val value so can exchange with i
        // & next time i can -> i++ coz now [i] != val.

        int i = 0, n = nums.length;

        while(i < n) {
            if(nums[i] == val) {
                nums[i] = nums[--n];
            } else {
                i++;
            }
        }

        return i;
    }
}