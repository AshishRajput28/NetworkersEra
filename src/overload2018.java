import java.util.*;
class overload2018
{
    double volume(double R)
    {
        double V=4/3*22/7*R*R*R;
        System.out.println("volume of sphere="+V);
        return V;
    }
    double volume(double H, double R)
    {
        double V=22/7*R*R*H;
        System.out.println("volume of cy="+V);
        return V;
    }
    double volume(double L, double B, double H)
    {
        double V=L*B*H;
        System.out.println("volume of cuboid="+V);
        return V;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of L");
        double L=sc.nextDouble();
        System.out.println("R");
        double R=sc.nextDouble();
        overload2018 obj=new overload2018();
        obj.volume(R);
        obj.volume(L,R);
    }
}