import java.util.*;
class recursion_hcf_lcm
{
    int n1,n2,hcf,lcm;
    public void readData()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first number");
        n1=sc.nextInt();
        System.out.println("enter second number");
        n2=sc.nextInt();
    }
    public int hcf(int a, int b)
    {
        if(a==0)
            return b;
        else
            return hcf(b%a,a);
    }
    public int lcm(int a, int b, int hcf)
    {
        return (a*b)/hcf;
    }
    public void display()
    {
        hcf = hcf(n1,n2);
        lcm = lcm(n1,n2,hcf);
        System.out.println("HCF = " +hcf);
        System.out.println("LCM = " +lcm);
    }
    public static void main(String args[])
    {
        recursion_hcf_lcm call = new recursion_hcf_lcm();
        call.readData();
        call.display();
    }
}