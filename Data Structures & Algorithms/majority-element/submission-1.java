class Solution {
    public int majorityElement(int[] nums) {
        //optimal soln with O(n) Tc & O(1) Sc
        int cand = nums[0];
        int vote = 1;

        for(int num : nums) {
            if(num != cand) {
                if(vote == 1) cand = num;
                else vote -= 1;
            } else {
                vote += 1;
            }
        }

        return cand;
    }
}