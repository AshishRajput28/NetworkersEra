import java.util.*;
class model1
{
    public static void main(String args[])
    {
        int A[]=new int[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int positive_even=0,negative_odd=0;
        for(int i=0;i<A.length;i++)
        {
            A[i]=sc.nextInt();
        }
        for(int i=0;i<A.length;i++)
        {
            System.out.print(" "+A[i]);
        }
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0 && A[i]>0)
            {
                positive_even++;
            }
            if(A[i]%2==1 && A[i]<0)
            {
                negative_odd++;
            }
        }
        int B[]=new int[positive_even]; int C[]=new int[negative_odd];
        System.out.println("\ndisplay"); int b=0,c=0;
        for(int i=0;i<A.length;i++)
        {
            if(A[i]%2==0 && A[i]>0)
            {
                B[b++]=A[i];
            }
            if(A[i]%2==1 && A[i]<0)
            {
                C[c++]=A[i];
            }
        }
        System.out.println("Positive even no="+positive_even);
        for(int i=0;i<B.length;i++)
        {
            System.out.print(" "+B[i]);
        }
        System.out.println("\n negative odd no="+negative_odd);
        for(int i=0;i<C.length;i++)
        {
            System.out.print(" "+C[i]);
        }
    }
}