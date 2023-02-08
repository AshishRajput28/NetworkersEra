import java.util.*;
public class ClaritNumber
{
    public static boolean isClaritNumber(int n)
    {
        int[] count = new int[10];
        while (n > 0)
        {
            int digit = n % 10;
            count[digit]++;
            n /= 10;
        }
        int maxCount = 0;
        for (int i = 0; i < count.length; i++)
        {
            if (count[i] > maxCount)
            {
                maxCount = count[i];
            }
        }
        return maxCount == count[0];
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        if (isClaritNumber(n))
        {
            System.out.println(n + " is a clarit number");
        } else
        {
            System.out.println(n + " is not a clarit number");
        }
    }
}
