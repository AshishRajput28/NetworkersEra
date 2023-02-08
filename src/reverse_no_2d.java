import java.util.*;
class reverse_no_2d
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int row=sc.nextInt();
        System.out.println("enter column");
        int col=sc.nextInt();
        int a[][]=new int[row][col];
        System.out.println("enter number in array");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print("a"+i+j+" = ");
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("display");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
        System.out.println("reverse");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                int sum=0;
                int num=a[i][j];
                while (num>0)
                {
                    int rem=num%10;
                    sum=sum*10+rem;
                    num=num/10;
                }
                a[i][j]=sum;
            }
        }
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(" "+a[i][j]);
            }
            System.out.println();
        }
    }
}