import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.add(1);
        st.add(2);
        st.add(3);
        st.push(4);
        st.push(5);
        st.push(6);
        st.remove(1);
        st.pop();
        System.out.println(st.peek());
        System.out.println(st);
    }
}