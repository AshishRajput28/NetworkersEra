import java.util.*;
class srarray
{
    public static void main(String args[])
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter size of array a");
       int sizea=sc.nextInt();
       int a[]=new int[sizea];
        System.out.println("enter size of array b");
        int sizeb=sc.nextInt();
        int b[]=new int[sizeb];
        int c[]=new int[sizea+sizeb];
       System.out.println("enter element in array a");
       for(int i=0;i<a.length;i++)
       {
            a[i]=sc.nextInt();
       }
        System.out.println("enter element in array b");
        for(int i=0;i<b.length;i++)
        {
            b[i]=sc.nextInt();
        }
       System.out.println("combining"); int count=0;
       for(int i=0;i<a.length;i++)
       {
           c[i]=a[i];
           count++;
       }
       for (int i=0;i<b.length;i++)
       {
           c[count++]=b[i];
       }
       System.out.println("afte combining");
        for(int i=0;i<c.length;i++)
        {
            System.out.print(" "+c[i]);
        }
    }
}