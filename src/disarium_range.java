class disarium_range
{
    public static void main(String args[])
    {
        int n=135,t=1,n2=0,k=0,p=0,sum=0,copy=0,sum1=0,rev=0;
        while(n<1000)
        {
            copy=n;
            n2=n;
            while(n2>0)
            {
                k=n2%10;
                rev=rev*10+k;
                n2=n2/10;
            }
            while(rev>0)
            {
                p=rev%10;
                sum1=(int)(sum1+(Math.pow(p,t++)));
                rev/=10;
            }
            if(n==sum1)
            {
                System.out.println(sum1);
            }
            n++;
            t=1;
            rev=0;
            sum1=0;
        }
    }
}
