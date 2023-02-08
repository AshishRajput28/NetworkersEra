import java.util.*;
class wordarrangelength
{
    public static void main(String args[])
    {
        String ar[]={"kanpur","agra","delhi","lucknow","chennai"};
        int len=0; String temp;
        for(int i=0;i<ar.length-1;i++)
        {
            if(ar[i].compareTo(ar[i+1])>0)
            {
                temp=ar[i];
                ar[i]=ar[i+1];
                ar[i+1]=temp;
            }
        }
        for(int i=0;i<ar.length;i++)
        {
            System.out.print(ar[i]+" ");
        }
    }
}