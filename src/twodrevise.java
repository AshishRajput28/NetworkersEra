import java.util.*;
class twodrevise
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("original array ");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                int sum=0;
                while (a[i][j]>0)
                {
                    int rem=a[i][j]%10;
                    sum=sum*10+rem;
                    a[i][j]/=10;
                }
                a[i][j]=sum;
            }
        }
        System.out.println("reverse array");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}