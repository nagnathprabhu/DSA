var removeOuterParentheses = function(s) {
    
    let stack = [];
    let result = "";
    for(let i=0; i<s.length; i++) {

        if(stack.length >= 1) {

            if(stack.length == 1 && s.charAt(i) != ')') {
                result = result+ s.charAt(i);
            } else if(stack.length > 1) {
                result = result + s.charAt(i);
            }
        }
        
        if(s.charAt(i) == '(') {
            stack.push(s.charAt(i));
        } 
        else if(s.charAt(i) == ')' ) {
            stack.pop();
        }
    }
    return result;
};

removeOuterParentheses("(()())(())");
