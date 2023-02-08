import java.util.*;
class change_row_column
{
    void exchangeAnyTwoRows(int matrix[][], int row, int col)
    {
        int[] temp=matrix[row-1];
        matrix[row-1]=matrix[col-1];
        matrix[col-1]=temp;
        printMatrix(matrix);
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
    public static void main(String[] args)
    {
        int row=2, col=3;
        System.out.println("array elements");
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
        change_row_column obj=new change_row_column();
        obj.exchangeAnyTwoRows(a,row,col);
    }
}
