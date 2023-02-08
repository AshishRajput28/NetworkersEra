import java.util.*;
class prime_number
{
    public static void main(String args[])
    {
        int[] a={10,20,30,40,50,60,70,80};
        int number=60,low=0,high=a.length-1,min=(low+high)/2;
        while(low<=high)
        {
            if(a[min]==number)
            {
                System.out.println(" found " +  min );
                break;
            }
            else if(a[min]<number)
            {
                low=min+1;
            }
            else
            {
                high=min-1;
            }
            min=(low+high)/2;
        }
    }
}