import java.util.Stack;

class Solution{
    public static boolean balancedBracket(String bracket){
    	if (bracket.length() <= 1) return false; 
        Stack<Character> stack = new Stack<Character>();
        for(int i = 0; i < bracket.length(); i++){
            char l = bracket.charAt(i);
            if(l == '['|| l == '{' || l == '('){
                stack.push(l);
            }else{
                if (stack.empty()){
                    return false;
                }else{
                    Character cb = stack.pop();
                    if (cb == '{' && l != '}' || cb == '[' && l != ']' || cb == '(' && l != ')'){
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] arg){
        System.out.println(balancedBracket("{[([])]}"));
        System.out.println(balancedBracket("{[{])]}"));
    }   
}

