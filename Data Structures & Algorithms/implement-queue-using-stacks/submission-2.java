class MyQueue {
    private Stack<Integer> stk;
    private Stack<Integer> tmp;
    private Integer topEle;

    public MyQueue() {
        stk = new Stack<>();
        tmp = new Stack<>();
        topEle = null;
    }
    
    public void push(int x) {
        if(stk.isEmpty()) {
            topEle = x;
        }

        stk.push(x);
    }
    
    public int pop() {
        while(!stk.isEmpty()) {
            tmp.push(stk.pop());
        }

        int val = tmp.pop();
        if(!tmp.isEmpty()) topEle = tmp.peek();

        while(!tmp.isEmpty()) stk.push(tmp.pop());
        return val;
    }
    
    public int peek() {
        return topEle;   
    }
    
    public boolean empty() {
        return stk.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */