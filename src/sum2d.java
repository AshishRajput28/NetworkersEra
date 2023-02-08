import java.util.*;
class sum2d
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        System.out.println("enter number in array a");
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
               System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
        System.out.println("pattern"); int c=0,i,j,k;
        for(i=2;i>=0;i--)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(" ");
            }
            for(k=0;k<=j;k++)
            {
                System.out.print(a[i][k]);
            }
            System.out.println();
        }
    }
}