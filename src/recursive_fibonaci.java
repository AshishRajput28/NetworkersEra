import java.util.*;
class recursive_fibonaci
{
    /*static int fib1(int n)
    {
        if (n==1||n==2)
        {
            return 1;
        }
        return fib1(n-1)+fib1(n-2);
    }*/
    static int fib2(int n)
    {
        int a=0, b=1, c=0;
        for (int i=3; i<=n; i++)
        {
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }
    public static void main(String args[])
    {
        System.out.println("enter value of n");
        int n = new Scanner(System.in).nextInt();
    }
}
