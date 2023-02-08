import java.util.*;
class djarray
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int size=sc.nextInt();
        System.out.println("enter elements in array");
        int a[]=new int[size];
        for(int i=0;i<a.length;i++)
        {
           a[i]=sc.nextInt();
        }
        System.out.println("displaying number");
        for(int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }
    }
}