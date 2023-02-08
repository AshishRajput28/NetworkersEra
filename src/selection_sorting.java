import java.util.*;
class selection_sorting
{
    public static void main(String[] args)
    {
        System.out.println("enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int  a[] = new int[n]; int min,j;
        System.out.println("enter number in array");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        int temp;
        for (int i = 0; i < a.length; i++)
        {
            min = i;
            for (j = i+1; j < a.length; j++)
            {
                if (a[j]<a[min])
                {
                    min = j;
                }
            }
            temp = a[i];
            a[i] = a[min];
            a[min] = temp;
        }
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}

