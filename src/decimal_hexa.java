import java.util.*;
class decimal_hexa
{
    public static void main(String args[])
    {
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,rem;
        int copyofn=n;
        while (n>0)
        {
            rem=n%8;
            sum=sum*10+rem;
            n=n/8;
        }
        n=sum;
        int sum1=0;
        while (n>0)
        {
            rem=n%10;
            sum1=sum1*10+rem;
            n=n/10;
        }
        System.out.println("decimal "+copyofn+ " to octal "+sum1);
    }
}