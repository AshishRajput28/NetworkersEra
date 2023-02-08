import java.util.*;
class special2digitrange
{
    public static void main(String args[])
    {
        int sum=0,pro=1,rem;
        for(int i=19;i<100;i++)
        {
            int x=i%10;
            int y=i/10;
            int a=x+y;
            int b=x*y;
            int c=a+b;
            if(i==c)
            {
                System.out.println(c);
            }
        }
    }
}
