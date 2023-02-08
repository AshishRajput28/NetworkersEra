import java.util.*;
class arraycombine
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array A");
        int asize=sc.nextInt();
        System.out.println("Enter size of array B");
        int bsize=sc.nextInt();
        int a[]=new int[asize];
        int b[]=new int[bsize];
        int c[]=new int[asize+bsize];
        int help=0;
        System.out.println("enter elements in array a");
        for(int i=0;i<asize;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("enter elements in array b");
        for(int i=0;i<bsize;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.println("combine two array");
        for(int i=0;i<asize;i++)
        {
            c[i]=a[i];
            help++;
        }
        for(int i=0;i<bsize;i++)
        {
            c[help++]=b[i];
        }
        System.out.println("printing combined array");
        for(int i=0;i<c.length;i++)
        {
            System.out.println(c[i]);
        }
    }
}