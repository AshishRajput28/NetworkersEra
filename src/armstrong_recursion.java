import java.util.*;
class armstrong_recursion
{
    int sum=0;
    int check_ArmstrongNumber(int num)
    {

        if(num!=0)
        {
            sum=(int)(sum+Math.pow(num%10,3));
            check_ArmstrongNumber(num/10);
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner cs=new Scanner(System.in);
        int num;
        System.out.print("enter karo=");
        num=cs.nextInt();
        armstrong_recursion ob=new armstrong_recursion();
        if(ob.check_ArmstrongNumber(num)==num)
            System.out.print("Armstrong Number");
        else
            System.out.print("not an Armstrong Number");
    }
}