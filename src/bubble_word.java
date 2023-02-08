import java.util.*;
class bubble_word
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of array");
        int n=sc.nextInt();
        System.out.println("enter word in array");
        String ar[]=new String[n];
        for(int i=0;i<n;i++)
        {
            ar[i]=sc.nextLine();
        }
        for(int i=0; i<n-1; i++)
        {
            for(int j=0; j<n-i-1; j++)
            {
                if (ar[j].compareTo(ar[j+1])> 0)
                {
                    String t=ar[j];
                    ar[j]=ar[j+1];
                    ar[j+1]=t;
                }
            }
        }
        System.out.println("sorted array");
        for(int i=0;i<n;i++)
        {
            System.out.println(ar[i]);
        }
    }
}