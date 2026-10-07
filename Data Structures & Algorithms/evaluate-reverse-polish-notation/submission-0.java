class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for(String s:tokens){
            
            switch(s){
                case "+":
                stack.push(stack.pop()+stack.pop());
                break;

                case "-":
                int b = stack.pop();
                int a = stack.pop();
                stack.push(a-b);
                break;

                case "*":
                stack.push(stack.pop()*stack.pop());
                break;

                case "/":
                int c = stack.pop();
                int d = stack.pop();
                stack.push(d/c);
                break;

                default:
                stack.push(Integer.parseInt(s));
                break;
            }
        }

        return stack.pop();
        
    }
}
