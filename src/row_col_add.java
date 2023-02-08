import java.util.*;
public class row_col_add
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of rows (n): ");
        int n = in.nextInt();
        System.out.print("Enter number of columns (m): ");
        int m = in.nextInt();
        int arr[][] = new int[n][m];
        System.out.println("Enter array elements");
        for (int i = 0; i < n - 1; i++)
        {
            System.out.println("Enter Row " + (i + 1) + " :");
            for (int j = 0; j < m - 1; j++)
            {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println("Input Array:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        //Row-wise & Column-wise Sum
        for (int i = 0; i < n - 1; i++)
        {
            int rSum = 0, cSum = 0;
            for (int j = 0; j < m - 1; j++)
            {
                rSum += arr[i][j];
                cSum += arr[j][i];
            }
            arr[i][m - 1] = rSum;
            arr[n - 1][i] = cSum;
        }
        System.out.println("Array with Sum:");
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
