class Solution {
    public boolean isValid(String s) {
        int len = s.length();
        if(len <= 0){
            return false;
        }

        Stack<Character>stack = new Stack<>();

        int pos = 0;

        while(pos < len){
            char curr = s.charAt(pos);
            if(curr == '(' || curr == '{' || curr == '['){
                stack.push(curr);
                pos++;
                continue;
            }
            if(stack.size() <= 0){
                return false;
            }
            char top = stack.peek();

            if(curr == ')' && top != '('){
                return false;
            }
            if(curr == ']' && top != '['){
                return false;
            }
           if(curr == '}' && top != '{'){
                return false;
            }
            else{
                stack.pop();
                pos++;
            }
        }
        return stack.isEmpty()?true:false;
    }
}
