class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        //O(n) TC & SC 
        //approach = compare current matching with previous matching (index)
        // & findout is valid or not
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++) {
            int num = nums[i];

            if(map.containsKey(num)) {
                int previousIdx = map.get(num);
                if(Math.abs(i - previousIdx) <= k) {
                    return true;
                }
            }

            map.put(num, i);
        }

        return false;
    }
}