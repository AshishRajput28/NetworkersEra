import java.util.*;
class sharad
{
    public static void main(String args[])
    {
        int countfactor=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        int n=sc.nextInt(); int i=1;
        while (i<=n)
        {
            if (n%i==0)
            {
                countfactor++;
            }
            i++;
        }
        if(countfactor==2)
        {
            System.out.println("prime");
        }
        else
        {
            System.out.println("not prime");
        }
    }
}