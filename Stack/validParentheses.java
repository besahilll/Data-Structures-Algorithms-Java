import java.util.*;
class validParentheses{
    public static boolean isValid(String str){
        Stack<Character> s = new Stack<Character>();
        for(int i = 0; i < str.length(); i++){
            char ch=str.charAt(i);
            if((ch == '(') || (ch == '[') || (ch == '{')){
                s.push(ch);
            }
            else{
                //closing bracket
                if(s.isEmpty()){
                    return false;
                }
                if ( (s.peek()=='(' && ch==')') || (s.peek()=='[' && ch==']') || (s.peek()=='{' && ch=='}') ){
                    s.pop();
                }else{
                    return false;
                }
            } 
        }
        if(s.isEmpty()){
            return true;
        }else{
            return false;
        }
    }
    
    public static void main(String[] args){
        String str="{[()]";// false
        System.out.println(isValid(str));
        String str2="{}(){}[]";//true
        System.out.println(isValid(str2));
    }
}
