class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, List<Integer>> map = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int num = nums[i];

            //if not present loop on list & check is valid find or not
            if(map.containsKey(num)) {
                for(int j=map.get(num).size()-1; j>=0; j--) {
                    int val = map.get(num).get(j);
                    if(Math.abs(val - i) <= k) {
                        return true;
                    }
                }
                map.get(num).add(i);
            } else {
                map.put(num, new ArrayList<>());
                map.get(num).add(i);
            }
        }

        return false;
    }
}