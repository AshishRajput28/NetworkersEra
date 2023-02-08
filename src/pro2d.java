import java.util.*;
class pro2d
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        int b[][]=new int[3][3];
        int c[][]=new int[3][3];
        System.out.println("enter number in array A ");
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
        /*for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if((i!=j&&(i+j)!=2))
                {
                    System.out.println(" "+a[i][j]);
                }
            }
        }*/
        System.out.println("enter number in array B");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("display");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(" "+b[i][j]);
            }
            System.out.println();
        }
        int j;
        for(int i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                int sum=0;
               for(int k=0;k<3;k++)
               {
                   sum=sum+a[i][k]*b[k][j];
               }
                c[i][j]=sum;
            }
        }
        for(int i=0;i<3;i++)
        {
            for(j=0;j<3;j++)
            {
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
    }
}