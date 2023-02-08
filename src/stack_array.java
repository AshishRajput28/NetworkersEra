import java.util.*;
class stack_array
{
    int top;
    int maxsize=5;
    int stack_arry[]=new int[maxsize];
    stack_array()
    {
        top=-1;
    }
    boolean empty()
    {
        return (top<0);
    }
    boolean push(int val)
    {
        if(top==maxsize-1)
        {
            System.out.println("stack overflow");
            return false;
        }
        else
        {
            top++;
            stack_arry[top]=val;
            return true;
        }
    }
    boolean pop()
    {
        if (top==-1)
        {
            System.out.println("stack underflow");
            return false;
        }
        else
        {

            System.out.println("\nitem pop: " + stack_arry[top--]);
            return true;
        }
    }
    void display()
    {
        System.out.println("printing stack elements");
        //System.out.println("value of top is ="+top);
        for(int i=top;i>=0;i--)
        {
            System.out.print(stack_arry[i] + " ");
        }
    }
    public static void main(String[] args)
    {
        stack_array stck=new stack_array();
        System.out.println("stack Empty ="+stck.empty());
        stck.push(10);
        stck.push(20);
        stck.push(30);
        stck.push(40);
        stck.push(50);
        System.out.println("push operation");
        stck.display();
        stck.pop();
        stck.pop();
        System.out.println("after pop operation");
        stck.display();
    }
}