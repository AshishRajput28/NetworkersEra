import java.util.*;
class switchclass10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        char n=sc.next().charAt(0);
        switch (n)
        {
            case 'a':
                char chai='A';
                for(int i=0;i<3;i++)
                {
                    chai='A';
                    for(int j=0;j<=i;j++)
                    {
                        System.out.print(chai++);
                    }
                    System.out.println();
                }
                break;
            case 'b':
                for(int i=1;i<=3;i++)
                {
                    for(int j=3;j>i;j--)
                    {
                        System.out.print("*");
                    }
                    for(int t=i;t>=1;t--)
                    {
                        System.out.print(t);
                    }
                    System.out.println();
                }
                break;
            case 'c':
                char c='A';
                for(int i=1;i<=4;i++)
                {
                    for(int j=4;j>=i;j--)
                    {
                        System.out.print(" ");
                    }
                    for(int t=i;t>=1;t--)
                    {
                        System.out.print(c++);
                    }
                    c='A';
                    System.out.println();
                }
                break;
            case 'd':
                char d='A';
                for(int i=1;i<=3;i++)
                {
                    for(int j=3;j>i;j--)
                    {
                        System.out.print(" ");
                    }
                    for(int t=i;t>=1;t--)
                    {
                        int x=(int)d+t;
                        System.out.print((char)--x);
                    }
                    System.out.println();
                }
                break;
            case 'e':
                String  st="ICSE";
                for(int i=0;i<=3;i++)
                {
                    for(int j=0;j<=i;j++)
                    {
                        char ch= st.charAt(i);
                        System.out.print(ch);
                    }
                    System.out.println();
                }
                break;
            case 'f':
                String s1="ICSE";
                for(int i=0;i<=3;i++)
                {
                    int a=s1.length()-1;
                    for(int j=0;j<=i;j++)
                    {
                        char ch= s1.charAt(a--);
                        System.out.print(ch);
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("wrong");
        }
    }
}