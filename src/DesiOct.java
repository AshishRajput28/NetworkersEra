import java.util.*;
class DeciOct
{
    public int n;
    public int oct;
    DeciOct()
    {
        n = 0;
        oct = 0;
    }
    void getnum(int nn)
    {
        n = nn;
    }
    void deci_oct()
    {
        int t = n;
        int r = 0;
        int s;
        while (t !=0)
        {
            s = t % 8;
            r = 10 * r + s;
            t = t / 8;
        }
        oct = 0;
        while (r!= 0)
        {
            int p = r % 10;
            oct = 10 * oct + p;
            r = r / 10;
        }
    }
    void show()
    {
        System.out.println("The decimal number is " + n);
        System.out.println("The octal of " + n + " is " + oct);
    }
    public static void main(String args[])
    {
        int nn;
        System.out.println("enter a number");
        Scanner sc=new Scanner(System.in);
        nn=sc.nextInt();
        DeciOct obj1=new DeciOct();
        obj1.getnum(nn);
        obj1.deci_oct();
        obj1.show();
    }
}

