import java.util.*;
public class matrix_center
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = in.nextInt();
        if (n <= 0)
        {
            System.out.println("Invalid Input");
            return;
        }
        int arr[] = new int[n];
        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++)
        {
            arr[i] = in.nextInt();
        }
        /*
         * Steps to arrange the array:
         * 1. Sort the array
         * {5, 11, 12, 14, 31}
         * 2. Get elements at odd indexes in the array
         * to the right
         * {5, 12, 31, 11, 14}
         * 3. Reverse the sub-array from 0 to (n-1) / 2
         * {31, 12, 5, 11, 14}
         */
        //Step 1: Sort the array
        for (int i = 0; i < n - 1; i++)
        {
            for (int j = 0; j < n - i - 1; j++)
            {
                if (arr[j] > arr[j + 1])
                {
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
            }
        }
        //Step 2: Get elements at odd indexes to the right
        int endIdx = n - 1;
        int startIdx;
        if (n % 2 == 0)
        {
            startIdx = n - 1;
        }
        else
        {
            startIdx = n - 2;
        }
        while (startIdx > 0)
        {
            int t = arr[startIdx];
            int idx = startIdx;
            while (idx != endIdx)
            {
                arr[idx] = arr[idx + 1];
                idx++;
            }
            arr[idx] = t;
            startIdx -= 2;
            endIdx -= 1;
        }
        //Step 3: Reverse the sub-array from 0 to (n-1) / 2
        for (int i = 0, j = (n - 1) / 2; i < j; i++, j--)
        {
            int t = arr[i];
            arr[i] = arr[j];
            arr[j] = t;
        }
        //Print the final array
        for (int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
}