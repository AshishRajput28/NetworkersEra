import java.util.*;
class shuffle
{
    void shuffle(int[][] a)
    {
        Random random = new Random();
        for (int i = a.length - 1; i > 0; i--)
        {
            for (int j = a[i].length - 1; j > 0; j--)
            {
                int m = random.nextInt(i + 1);
                int n = random.nextInt(j + 1);
                int temp = a[i][j];
                a[i][j] = a[m][n];
                a[m][n] = temp;
            }
        }
        printMatrix(a);
    }
    void printMatrix(int[][] matrix)
    {
        for (int i=0; i<matrix.length; i++)
        {
            for (int j=0; j<matrix[0].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        int row=2, col=3;
        int a[][] = { { 2, 1, 4 }, { 1, 2, 3 }, { 3, 6, 2 } };
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("shuffle");
        shuffle obj=new shuffle();
        obj.shuffle(a);
    }
}