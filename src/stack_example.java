import java.util.*;
class stack_example
{
    static void stackpush(Stack<Integer> stack)
    {
        for(int i=0; i<=6; i++)
        {
            stack.push(i);
        }
    }
    static void stackpop(Stack<Integer> stack)
    {
        System.out.println("Pop Operation:");
        for(int i=0; i<=6; i++)
        {
            int y=(int)stack.pop();
            System.out.println("pop="+y);
        }
    }
    static void stack_peek(Stack<Integer> stack)
    {
        int element=(int)stack.peek();
        System.out.println("element on top: " + element);
    }
    static void stack_search(Stack<Integer> stack, int element)
    {
        int pos=(int)stack.search(element);
        if(pos==-1)
            System.out.println("not found");
        else
            System.out.println("found at position: "+pos);
    }
    public static void main (String[] args)
    {
        Stack<Integer> stack=new Stack<Integer>();
        stackpush(stack);
        stackpop(stack);
        stackpush(stack);
        //stack_peek(stack);
        stack_search(stack,0);
        stack_search(stack,9);
    }
}
