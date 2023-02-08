import java.util.*;
class stack2014
{
    int m[],st[];
    int cap, top;
    static Scanner sc=new Scanner(System.in);
    stack2014(int n)
    {
        cap = n;
        top = -1;
        m=new int[cap];
        st=new int[cap];
    }
    void input_marks()
    {
        //System.out.println("Enter "+cap+" elements in ascending order");
        for(int i=0;i<cap;i++)
        {
            m[i]=sc.nextInt();
            pushmarks(m[i]);
        }
    }
    void pushmarks(int v)
    {
        if (top<cap-1)
            st[++top]=v;
        else
            System.out.println("stack is full");
    }
    int popmarks()
    {
        if(top>=0)
            return st[top--];
        else
            return-9999;
    }
    void display()
    {
        for(int i=top;i>=0 ;i--)
            System.out.println(st[i]);
    }
}