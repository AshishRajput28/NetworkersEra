import java.util.*;
class prime
{
    int input()
    {
        System.out.println("enter number ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        return n;
    }
    boolean prime(int n)
    {
        int count=0,i=1;
        while (i<=n)
        {
            if(n%i==0)
            {
                count++;
            }
            i++;
        }
        if(count==2)
            return true;
        else
            return false;
    }
    void display()
    {
        System.out.println("number is prime");
    }
    public static void main(String  args[])
    {
        prime obj=new prime();
        obj.prime(obj.input());
        obj.display();
    }
}