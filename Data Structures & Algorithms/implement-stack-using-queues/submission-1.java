class MyStack {

    private Deque dq;

    public MyStack() {
        dq = new ArrayDeque<>();
    }
    
    public void push(int x) {
        dq.addLast(x);
    }
    
    public int pop() {
        return (int) dq.removeLast();
    }
    
    public int top() {
        return (int) dq.peekLast();
    }
    
    public boolean empty() {
        return dq.size() == 0;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */