import java.util.*;
class triangular
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number=");
        int n = sc.nextInt();
        if (n < 3)
        {
            System.out.println("invalid");
            return;
        }
        System.out.println("triangular numbers from 3-"+n+":");
        int sum = 3;
        for (int i=3;sum<=n;i++)
        {
            System.out.println(sum);
            sum += i;
        }
    }
}
