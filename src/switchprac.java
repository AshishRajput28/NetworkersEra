import java.util.*;
class switchprac
{
    public static void main(String args[])
    {
        int i=1,divide=1,sum=0;
        while (i<=100)
        {
            int copyofi=i;
            while (divide<copyofi)
            {
                if(copyofi%divide==0)
                {
                    sum=sum+divide;
                }
                divide++;
            }
            if(sum==i)
            {
                System.out.println("it is perfect "+i);
            }
            sum=0; divide=1; i++;
        }
    }
}