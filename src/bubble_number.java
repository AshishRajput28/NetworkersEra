import java.util.*;
class bubble_number
{
    public static void main(String[] args)
    {
        System.out.println("enter size of array");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        System.out.println("enter number in array");
        for (int i = 0; i < a.length; i++)
        {
            a[i] = sc.nextInt();
        }
        System.out.println("display");
        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println();
        int temp;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted array");
        for (int i = 0; i < a.length; i++)
        {
            System.out.print(a[i] + " ");
        }
    }
}

