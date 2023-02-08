import java.util.*;
class stringfunction
{
    public static void main(String args[])
    {
        int m=5,n=2;
        double o=m%n+(m/n)*2;
        System.out.println(o);
        Scanner sc=new Scanner(System.in);
        System.out.println("enter choice");
        int s=sc.nextInt();
        switch (n)
        {
            case 1:
                for(char a='A';a<='Z';a++)
                {
                    System.out.println(a+" its ascii value is "+(int)a);
                }
                break;
            case 2:
                for(int i=1;i<=5;i++)
                {
                    for(int j=1;j<=i;j++)
                    {
                        System.out.print(j);
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("wrong choice");
        }
    }
}
