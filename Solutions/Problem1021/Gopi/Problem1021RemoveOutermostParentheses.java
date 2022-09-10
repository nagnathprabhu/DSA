package Solutions.Problem1021.Gopi;

import java.util.Stack;

public class Problem1021RemoveOutermostParentheses {
 
    public String removeOuterParentheses(String s) {
        
        StringBuilder resultString = new StringBuilder();

        Stack<Character> stackStore = new Stack<Character>();
        char[] store = s.toCharArray();
        
        for(int i=0; i< store.length; i++) {

            if((stackStore.size() >= 1)){
                if(stackStore.size() == 1 && store[i] != ')') {
                    resultString.append(store[i]); 
                }
                else if(stackStore.size() > 1) {
                    resultString.append(store[i]);
                }
                
            }

            if(store[i] == '(') stackStore.push(store[i]);
            else if(store[i] == ')') stackStore.pop();
        }

        return resultString.toString();
    }

    public static void main(String[] args) {
        Problem1021RemoveOutermostParentheses obj = new Problem1021RemoveOutermostParentheses();

        String ans = obj.removeOuterParentheses("()()");

        System.out.println(ans);

    }
}
