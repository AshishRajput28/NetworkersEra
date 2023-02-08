import java.util.*;
class perfect
{
    public static void main(String args[])
    {
        int a1[]=new int[3];
        int a2[]=new int[4];
        int a3[]=new int[7];
        int count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no in a1");
        for(int i=0;i<a1.length;i++)
        {
            a1[i]=sc.nextInt();
        }
        System.out.println("enter no in a2");
        for(int i=0;i<a2.length;i++)
        {
            a2[i]=sc.nextInt();
        }
        System.out.println("combining array element");
        for(int i=0;i<a1.length;i++)
        {
            a3[i]=a1[i];
            count++;
        }
        for(int i=0;i<a2.length;i++)
        {
            a3[count++]=a2[i];
        }
        for(int i=0;i<a1.length+a2.length;i++)
        {
            System.out.println(a3[i]);
        }
    }
}