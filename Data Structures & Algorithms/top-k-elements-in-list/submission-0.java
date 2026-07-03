class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        //step 1: count freq of all elements
        Map<Integer, Integer> freqMap = new HashMap<>();
        for(int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        
        //step 2: create an bucket with size of array (coz highest freq will be array size)
        List<Integer>[] bucket = new List[nums.length+1];
        for(int i=0; i<nums.length+1; i++) {
            bucket[i] = new ArrayList<>();
        }

        for(int key : freqMap.keySet()) {
            int freq = freqMap.get(key);
            bucket[freq].add(key);
        }

        int ans[] = new int[k];
        int idx = 0;

        //step 3: loop through the bucket from backword & extract all high freq ele.
        for(int i=nums.length; i>0; i--) {
            if(bucket[i].isEmpty()) continue;

            for(int ele: bucket[i]) {
                if(idx == k) break;
                ans[idx++] = ele;
            }
        }

        return ans;
    }
}
