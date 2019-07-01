public class ValidParentheses {

/**

Valid Parentheses
Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.

Example 1:

Input: "()"
Output: true
Example 2:

Input: "()[]{}"
Output: true
Example 3:

Input: "(]"
Output: false
Example 4:

Input: "([)]"
Output: false
Example 5:

Input: "{[]}"
Output: true

**/

public static void main(String [] arg){
  ValidParentheses vp = new ValidParentheses();
  String s="()[]{}"
  System.out.println(vp.isValid(s));
}
public boolean isValid(String s){
  Stack<Character> statck= new Stack<Character>();
  for(char c : s){
    if(c=='{') {
      stack.push('}');
      }
    else if(c=='['){
       stack.push(']');
    }else if(c=='('){
       stack.push(')');
    }else if(stack.isEmpty() || stack.pop()!=c){
      return false;
    }
    return stack.isEmpty();
  }
}

}
