import java.util.*;
class mahi
{
    public static void  main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch (choice)
        {
            case 1:
                int a=65;
                for(int i=0;i<5;i++)
                {
                    for(int j=0;j<=i;j++)
                    {
                        System.out.print(" "+(char)a);
                    }
                    System.out.println();
                    a++;
                }
                break;
            case 2:
                String s="ICSE";
                for(int i=0;i<4;i++)
                {
                    for(int j=0;j<=i;j++)
                    {
                        char ch=s.charAt(i);
                        System.out.print(ch);
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("shi enter karo");
        }
    }
}