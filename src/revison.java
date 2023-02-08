import java.util.Scanner;
public class revison
{
    public static void main(String args[])
    {
       int n,sum=0,sumeven=0,sumodd=0;
       Scanner sc=new Scanner(System.in);
       n=sc.nextInt();
       int soorajatharav[]=new int[n];
       System.out.println("element in array");
       for (int i=0;i<soorajatharav.length;i++)
       {
           soorajatharav[i]=sc.nextInt();
       }
       for(int i=0;i<n;i++)
       {
           sum=sum+soorajatharav[i];
       }
       System.out.println("sum of array element ="+sum);
       for(int i=0;i<5;i++)
       {
           if(soorajatharav[i]%2==0)
           {
               sumeven+= soorajatharav[i];
               System.out.println("even number=" + soorajatharav[i]);
           }
           else
           {
               sumodd+=soorajatharav[i];
               System.out.println("odd number=" + soorajatharav[i]);
           }
       }
       System.out.println("sum of even number="+sumeven);
       System.out.println("sum of odd number="+sumodd);
    }
}
