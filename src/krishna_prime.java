public class krishna_prime
{
    public static void main(String args[])
    {
        int i=1,count=0,n=2;
        while (n<=100)
        {
            while (i<=n)
            {
                if(n%i==0)
                {
                    count++;
                }
                i++;
            }
            if(count==2)
            {
                System.out.println(n);
            }
            n++;
            count=0;
            i=1;
        }
    }
}
