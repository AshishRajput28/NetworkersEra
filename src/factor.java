import java.util.*;
class factor
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt(); int i=1,count=0;
        while (i<=n)
        {
            if(n%i==0)
            {
                System.out.println("factor of "+n + " is :"+i);
                count++;
            }
            i++;
        }
        if(count==2)
            System.out.println("number is prime");
        else
            System.out.println("not prime");
    }
}