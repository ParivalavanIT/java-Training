import java.util.*;
public class ParanthesisMatching{
    static Stack<Character>  checkStack = new Stack<>();
    static Boolean isBracketmatching(char open,char close){
        return (((open == '(')&&(close == ')'))||((open == '{')&&(close == '}'))||((open == '[') &&(close == ']')));
    }
    static Boolean isMatch(String s){
        
        if(s.length()==1 || s.length()==0){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if((c == '(')||(c == '{')||(c == '[')){ //Check the open bracket
                checkStack.push(c);
            }
            else if((c == '}')||(c == ')')||(c == ']')){ //Check the close bracket
                if(checkStack.isEmpty()){
                    return false;
                }
                char top = checkStack.pop();

                if(!isBracketmatching(top, c)){ //CheCks the bracket matching
                    return false;
                }
            }
        }
        return checkStack.isEmpty();
    }
    public static void main(String[] args) {
        System.out.println(isMatch("}}}}}}}}}}")?"The String is Balanced ":"The String is not Balanced");
    }
}