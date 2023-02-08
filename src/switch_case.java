import java.util.*;
class switch_case
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        //int n=sc.nextInt();
        char a=sc.next().charAt(0);
        switch (a)
        {
            case 'a':
                for(int i=1;i<=4;i++)
                {
                    if(i%2==1)
                    {
                        for(int j=1;j<=i;j++)
                        {
                            System.out.print(" "+"*");
                        }
                    }
                    else
                    {
                        for(int k=1;k<=i;k++)
                        {
                            System.out.print(" "+"#");
                        }
                    }
                    System.out.println();
                }
                System.out.println("-------------");
                break;
            case 'b':
                for(int i=4;i>=0;i--)
                {
                    if(i%2==0)
                    {
                        for(int j=1;j<=i;j++)
                        {
                            System.out.print(" "+"#");
                        }
                    }
                    else
                    {
                        for(int k=1;k<=i;k++)
                        {
                            System.out.print(" "+"*");
                        }
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("wrong choice");
        }
    }
}