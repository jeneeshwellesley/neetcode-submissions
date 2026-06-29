class MinStack {
    Stack<Integer>stack;
    Stack<Integer>minStack;
    public MinStack(){
        stack = new Stack<>();
        minStack = new Stack<>();
    }
    
    public void push(int val) {
        if(stack.isEmpty()){
            stack.push(val);
            minStack.push(val);
        }
        else{
            if(val < minStack.peek()){
                minStack.push(val);
                stack.push(val);
            }
            else{
                int minVal = minStack.peek();
                minStack.push(minVal);
                stack.push(val);
            }
        }
    }
    
    public void pop() {
        stack.pop();
        minStack.pop();
    }
    
    public int top() {
       return stack.peek();
    }
    
    public int getMin() {
        return minStack.peek();
    }
}
