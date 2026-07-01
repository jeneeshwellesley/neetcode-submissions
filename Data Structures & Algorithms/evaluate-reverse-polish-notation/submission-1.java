class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>stack = new Stack<>();

        for(String str : tokens){
            if(str.equals("*") || str.equals("+") || str.equals("-") || str.equals("/")){
                int num2 = stack.pop();
                int num1 = stack.pop();

                if(str.equals("+")){
                    stack.push(num1 + num2);
                } 
                else if(str.equals("*")){
                    stack.push(num1 * num2);
                }
                else if(str.equals("/")){
                    stack.push(num1 / num2);
                }
                else{
                    stack.push(num1 - num2);
                }
            }
            else{
                int inte = Integer.parseInt(str);
                stack.push(inte);
            }
        }
        return stack.pop();
    }
}
