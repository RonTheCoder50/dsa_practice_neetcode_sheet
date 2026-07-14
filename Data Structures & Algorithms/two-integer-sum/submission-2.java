class Solution {
    public int[] twoSum(int[] nums, int target) {
        //Hashmap O(n) tc & sc
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int curr = nums[i];
            int complement = target - curr;

            if(map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(curr, i);
        }
        
        return new int[]{-1,-1};
    }
}
