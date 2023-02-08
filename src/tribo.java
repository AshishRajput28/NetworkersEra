class tribo
{
    public static void main(String args[])
    {
        int a=0,b=0,c=1,d=0,i=1,n=7;
        System.out.print(a+" "+b+" "+c);
        while (i<n)
        {
            d=a+b+c;
            System.out.print(" "+d);
            a=b;
            b=c;
            c=d;
            i++;
        }
    }
}
