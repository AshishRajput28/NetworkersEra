import java.util.*;
class ShowRoom
{
    void add(int a , int b)
    {
        int c=a+b;
        System.out.println("value of c is "+c);
    }
    void multiply(int a, int b)
    {
        int c=a*b;
        System.out.println("multiply "+c);
    }
    public static void  main(String  args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int xx=sc.nextInt();
        int yy=sc.nextInt();
        ShowRoom aryan=new ShowRoom();
        aryan.add(x,y);
        aryan.multiply(xx,yy);
    }
}