class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for(String str : tokens){
            if(str.equals("+") ||
             str.equals("-") || str.equals("/") || str.equals("*")){
                int val2 = stack.pop();
                int val1 = stack.pop();

                if(str.equals("+")){
                    stack.push((val1) + val2);
                }
                else if(str.equals("-")){
                    stack.push((val1) - val2);
                }
                else if(str.equals("/")){
                    stack.push((val1) / val2);
                }
                else{
                    stack.push((val1) * val2);
                }
             }
             else{
                stack.push(Integer.parseInt(str));
             }
        }
        return stack.pop();
    }
}
