import java.util.*;
class twodarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("printing array elements");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("left diagonal");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if(i==j)
                {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
        System.out.println();
        System.out.println("right diagonal");
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                if((i+j)==(a.length-1))
                {
                    System.out.print(a[i][j]+" ");
                }
            }
        }
        System.out.println();
        System.out.println("printing reverse number at index");
        int areverse[][]=new int[3][3];
        int sum=0;
        for(int i=0;i<3;i++)
        {
            int k=0;
            for(int j=0;j<3;j++)
            {
                int n=a[i][j];
                while (k<a.length)
                {
                    n=a[i][j];
                    while (n>0)
                    {
                        int rem=n%10;
                        sum=sum*10+rem;
                        n=n/10;
                    }
                    areverse[i][k]=sum;
                    sum=0;
                    k++;
                    j++;
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(areverse[i][j]+" ");
            }
            System.out.println();
        }
    }
}