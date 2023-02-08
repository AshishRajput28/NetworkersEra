import java.util.*;
class linear_searching
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter number in array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter number to search");
        int number=sc.nextInt(); int c=0;
        for(int i=0;i<a.length;i++)
        {
            if(number==a[i])
            {
                c++;
                System.out.println("number found at "+i+" index number");
            }
        }
        if(c==0)
            System.out.println("number not found");
        else
            System.out.println("number found "+c+" times");
    }
}