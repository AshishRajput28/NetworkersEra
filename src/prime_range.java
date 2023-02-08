import java.util.*;
class prime_range
{
    public static void main(String args[])
    {
        int i=1,n=1,count=0;
        while(n<=100)
        {
            int a=n;
            while(i<=a)
            {
                if(a%i==0)
                {
                    count++;
                }
                i++;
            }
            if(count==2)
            {
                System.out.println(a);
            }
            i=1; count=0; n++;
        }
    }
}