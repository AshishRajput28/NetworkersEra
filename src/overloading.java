import java.util.*;
class overloading
{
    void Number(int num , int d)
    {
        int count=0;
        while (num>0)
        {
            int rem=num%10;
            if(rem==d)
            {
                count++;
            }
            num=num/10;
        }
        if(count==0)
            System.out.println("not found");
        else
        System.out.println(d+" present " + count +" times ");
    }
    void Number(int n1)
    {
        int sum=0;
        while (n1>0)
        {
            int rem=n1%10;
            if(rem%2==0)
            {
                sum+=rem;
            }
            n1=n1/10;
        }
        System.out.println("sum of even digit is "+sum);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int d=sc.nextInt();
        int n1=sc.nextInt();
        overloading obj=new overloading();
        obj.Number(num,d);
        obj.Number(n1);
    }
}