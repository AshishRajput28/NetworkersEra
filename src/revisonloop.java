import java.util.*;
class revisonloop
{
    public static void main(String args[])
    {
        System.out.println("enter number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); int i=1;
        while (i<=n)
        {
            if(n%i==0)
            {
                System.out.println("factor of "+n+" is : "+i);
            }
            i++;
        }
    }
}