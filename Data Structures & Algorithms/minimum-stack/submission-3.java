class MinStack {
    int[]stack = new int[500];
    int[]min = new int[500];
    int top = -1;

    public MinStack() {
        
    }
    
    public void push(int val) {
        if(top < 0){
            top++;
            min[top] = val;
            stack[top] = val;
        }
        else{
            if(min[top] > val){
            top++;
            min[top] = val;
            stack[top] = val;
        }
        else{
            int mi = min[top];
            top++;
            min[top] = mi;
            stack[top] = val;
        }
        }
    }
    
    public void pop() {
        min[top] = 0;
        stack[top] = 0;
        top--;
    }
    
    public int top() {
        return stack[top];
    }
    
    public int getMin() {
        return min[top];
    }
}
