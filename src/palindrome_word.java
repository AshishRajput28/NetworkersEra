import java.util.*;
class palindrome_word
{
    public static void main(String args[])
    {
        int k=2;
        for(int i=1;i<=3;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(k+" ");
                k=k+2;
            }
            System.out.println();
        }
    }
}