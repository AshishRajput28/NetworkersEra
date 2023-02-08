import java.util.*;
class star_pattern
{
    public static void main(String args[])
    {
        int n=15,sum,j;
        for(int i=1;i<=n/2+1;i++)
        {
            sum=0;
            for(j=i;j<=n/2+1;j++)
            {
                sum=sum+j;
                if(sum==n)
                    break;
            }
            if(j<=n/2+1)
            {
                for(int k=i;k<=j;k++)
                    System.out.print(k+"");
                System.out.println();
            }
        }
    }
}
