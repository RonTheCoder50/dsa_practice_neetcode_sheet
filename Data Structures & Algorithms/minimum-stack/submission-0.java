class MinStack {

    private Stack<Integer> stk;
    private Stack<Integer> minStk;

    public MinStack() {
        stk = new Stack<>();
        minStk = new Stack<>();
    }
    
    public void push(int val) {
        stk.push(val);
        if(minStk.isEmpty()) minStk.push(val);
        else if(minStk.peek() >= val) minStk.push(val);
    }
    
    public void pop() {
        int val = stk.pop();
        if(val == minStk.peek()) {
            minStk.pop();
        }
    }
    
    public int top() {
        return stk.peek();
    }
    
    public int getMin() {
        return minStk.peek();
    }
}
