import java.util.Scanner;
import java.util.Stack;

public class BalancingSymbols {
    public static boolean checkSymbols(String str){
        Stack<Character> st = new Stack<>();
        for(char i:str.toCharArray()){
            if(i=='('){
                st.push(')');
            }
            else if(i=='['){
                st.push(']');
            }
            else if(i=='{'){
                st.push('}');
            }
            else if(!st.isEmpty() && st.peek() == i){
                st.pop();
            }
        }
        if(st.isEmpty()){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        String str = inp.next();
        System.out.println(checkSymbols(str));
    }
}