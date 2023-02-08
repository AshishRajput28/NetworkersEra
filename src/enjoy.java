import java.util.*;
class enjoy
{
    public static void main(String args[])
    {
        int n[]={10,20,30,40,50,60}; int c=0;
        for(int i=0;i<n.length-1;i+=2)
        {
            c=n[i];
           n[i]=n[i+1];
           n[i+1]=c;
        }
        for(int i=0;i<n.length;i++)
        {
            System.out.print(n[i]+" ");
        }
    }
}