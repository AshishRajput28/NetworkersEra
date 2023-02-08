import java.util.*;
class quad
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        int a[]=new int[size]; int sum=0;
        System.out.println("enter number in array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("user enter karo");
        int n=sc.nextInt(); int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]==n)
            {
                System.out.println("number found at "+i+" index");
                c++;
            }
        }
        if(c==0)
            System.out.println("nhi mila");
        else
            System.out.println("number found "+c+" times");
    }
}