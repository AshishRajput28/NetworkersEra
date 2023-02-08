import java.util.*;
class topi
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s="toppi";
        System.out.println("enter char");
        char ch=sc.next().charAt(0);
        System.out.println(s.lastIndexOf(ch));
    }
}