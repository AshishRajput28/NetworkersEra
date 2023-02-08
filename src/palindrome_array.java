import java.util.*;
class B
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter elements in array");
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("display");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("pallindrome number");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int sum=0;
                int n=a[i][j];
                while (n>0)
                {
                    int rem=n%10;
                    sum=sum*10+rem;
                    n=n/10;
                }
                if(sum==a[i][j])
                {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
    }
}