import java.util.*;
class switch_class9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter choice");
        char n=sc.next().charAt(0);
        switch (n)
        {
            case 'a':
                System.out.println("using while");
                int i=1;
                while (i<=10)
                {
                    if(i%2==0)
                        System.out.println("even="+i);
                    else
                        System.out.println("odd="+i);
                    i++;
                }
                break;
            case 'b':
                System.out.println("using for"); int sum=0;
                for(int j=1;j<=10;j++)
                {
                    sum = sum + j;
                }
                System.out.println("sum of 10 number is="+sum);
                break;
            default:
                System.out.println("shi enter karo");
        }
    }
}