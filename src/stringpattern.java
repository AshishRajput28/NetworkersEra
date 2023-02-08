import java.util.*;
class stringpattern
{
    public static void main(String args[])
    {
        int i, j, k;
        for (i = 3; i > 0; i--)
        {
            for (j = 1; j < i; j++)
            {
                System.out.print("-");
            }
            for (k = 3; k >= j; k--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}