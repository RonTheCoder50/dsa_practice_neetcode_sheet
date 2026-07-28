class MyStack {

    private Queue<Integer> que;
    private Queue<Integer> tmp;
    private Integer topEle;

    public MyStack() {
        que = new LinkedList<>();
        tmp = new LinkedList<>();
        topEle = null;
    }
    
    public void push(int x) {
        que.offer(x);
        topEle = x;
    }
    
    public int pop() {
        while(que.size() != 1) {
            tmp.offer(que.remove());
        }

        int ele = que.remove();
        
        if(!tmp.isEmpty()) {
            while(!tmp.isEmpty()) {
                int val = tmp.remove();
                que.offer(val);
                topEle = val;
            }
        }

        return ele;
    }
    
    public int top() {
        return topEle;
    }
    
    public boolean empty() {
        return que.isEmpty();
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