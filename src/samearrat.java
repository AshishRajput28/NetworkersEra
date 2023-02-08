import java.util.*;
class samearrat
{
    public static void main(String  args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number in array");
        int a[][]=new int[3][3];
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(i + " "+ j+"=");
                a[i][j]=sc.nextInt();
                System.out.println();
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
        System.out.println("pattern"); int c=3;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
            c--;
        }
    }
}