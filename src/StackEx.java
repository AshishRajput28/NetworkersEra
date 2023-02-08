import java.util.*;
public class StackEx
{
    public static void main(String[] args)
    {
        Stack st=new Stack();
        //Stack<Integer> st = new Stack<>();
       st.push(100);
       st.push(200);
       st.push(300);
        System.out.println("Elements of Stack: " +st);
        int a=(int)st.peek();
        System.out.println("Element at the top of stack: " +a);
        System.out.println("Position of element 50: " +st.search(100));
        System.out.println("Position of element 80: " +st.search(300));
    }
}