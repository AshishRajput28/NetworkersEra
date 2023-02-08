import java.util.*;
public class starpattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int n=sc.nextInt(); int sum=0; int temp=n;
        while (n>0)
        {
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        } int sumo=0;
        if(sum==10)
        {
            while (sum>0)
            {
                int mod=sum%10;
                sumo+=mod;
                sum/=10;
            }
            if(sumo==1)
            {
                System.out.println("magic no");
            }
            else
            {
                System.out.println("no magic");
            }
        }
    }
}



