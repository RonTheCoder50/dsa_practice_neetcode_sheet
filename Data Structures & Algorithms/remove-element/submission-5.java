class Solution {
    public int removeElement(int[] nums, int val) {
        //why replacing same array via k?
        // notice we want to return total count not a proper order array so we shift non-val at front
        // by setting [k++] = nums[i] ? [i] != val.
        int k = 0;

        for(int i=0; i<nums.length; i++) {
            if(nums[i] != val) {
                nums[k++] = nums[i];
            }
        }

        return k;
    }
}