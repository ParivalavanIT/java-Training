import java.util.*;
public class Postfix{
    static int postfix(String expr){
        Stack<Integer> st= new Stack<>();
        for(int i=0;i<expr.length();i++){
            char s = expr.charAt(i);
            if(s >= '0' && s <= '9'){
                st.push(s-'0');
            }else{
                int v1 = st.pop();
                int v2 = st.pop();
                switch(s){
                    case '+':{ 
                       st.push(v2+v1);
                       break;
                    }
                    case '-': {
                        st.push(v2-v1);
                        break;
                    }
                    case '*': {
                        st.push(v2*v1);
                        break;
                    }
                    case '/': {
                        st.push((v2 < v1) ? v1 / v2 : v2 / v1);
                        break;
                    }
                }
            }

        }
        return st.pop();
    }
    public static void main(String[] args) {
        System.out.println(postfix("231*+9-"));
    }
}