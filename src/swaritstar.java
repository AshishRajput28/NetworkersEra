public class swaritstar
{
    public static void main(String args[])
    {
        int c=1;
        for(int i=2;i>=0;i--)
        {
            for(int k=1;k<=i;k++)
            {
                System.out.print("-");
            }
            for(int p=c;p>0;p--)
            {
                System.out.print(p);
            }
            System.out.println();
            c++;
        }
    }
}
