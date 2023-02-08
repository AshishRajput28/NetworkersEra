import java.util.*;
class asr
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter choice");
        char n=sc.next().charAt(0);
        switch (n)
        {
            case 'a':
                for(int i=1;i<=4;i++)
                {
                    if(i%2==1)
                    {
                        for(int j=1;j<=i;j++)
                        {
                            System.out.print("@");
                        }
                        System.out.println();
                    }
                    else
                    {
                        for(int k=1;k<=i;k++)
                        {
                            System.out.print("#");
                        }
                        System.out.println();
                    }
                }
                break;
            case 'b':
                for(int i=1;i<=4;i++)
                {
                    for(int j=4;j>i;j--)
                    {
                        System.out.print("*");
                    }
                    for(int k=1;k<=i;k++)
                    {
                        System.out.print(k);
                    }
                    System.out.println();
                }
                break;
        }
    }
}
