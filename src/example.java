import java.util.*;
class example
{
    static boolean prime(int n)
    {
        int count=0;
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                count++;
            }
        }
        if(count==2)
        {
            return true;
        }
        else
            return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt();
       boolean a= prime(n);
       if(a==false)
       {
           System.out.println("not prime");
       }
       else
       {
           int sum=0;
           while (n>0)
           {
               int rem=n%10;
               sum=sum*10+rem;
               n=n/10;
           }
           boolean b=prime(sum);
           if(b==true)
           {
               System.out.println("twin prime");
           }
           else
           {
               System.out.println("not twin prime");
           }
       }
    }
}