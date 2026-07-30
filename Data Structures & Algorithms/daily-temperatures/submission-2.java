class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stk = new Stack<>();
        int result[] = new int[temperatures.length];
        stk.push(0);

        for(int i=1; i<temperatures.length; i++) {
            int curr = temperatures[i];
            while(!stk.isEmpty() && curr > temperatures[stk.peek()]) {
                int val = stk.pop();
                result[val] = i - val; 
            }

            stk.push(i);
        }

        return result;
    }
}
