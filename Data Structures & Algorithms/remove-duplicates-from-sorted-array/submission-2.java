class Solution {
    public int removeDuplicates(int[] nums) {
        //left pointer: to set unique elements at first k.
        //right pointer: to find unique elements.
        //always think of abt what will lp do, and what will rp do.

        int lp = 1, rp = 1;
        while(rp < nums.length) {
            if(nums[lp] != nums[lp-1] && lp == rp) {
                lp++;
                rp++;
            } else {
                while(rp < nums.length && nums[rp] == nums[rp-1]) {
                    rp++;
                }

                if(rp < nums.length) nums[lp++] = nums[rp++];
            }
        }

        return lp;
    }
}