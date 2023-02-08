import java.util.*;
class square_in_array
{
    public static void main(String args[])
    {
        System.out.println(8.1%2);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        int a[]=new int[n];
        System.out.println("enter elements in array");
        for(int i=0;i<a.length;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("perfect square are ");
        for(int i=0;i<a.length;i++)
        {
            int sq=a[i];
            for(int j=1;j<sq;j++)
            {
                if(j*j==sq)
                {
                    System.out.println(sq);
                    break;
                }
            }
        }
    }
}