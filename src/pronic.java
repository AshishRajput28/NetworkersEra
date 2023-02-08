import java.util.Scanner;
public class pronic
{
    public static void main(String args[])
    {
        System.out.println("enter number");
        int n=new Scanner(System.in).nextInt();
        int i=1,count=0;
        while (i<=n)
        {
            if(n==i*(i+1))
            {
                count++;
                System.out.println("pronic");
            }
            i++;
        }
        if(count==0)
        {
            System.out.println("number is not pronic");
        }
    }
}
