import java.util.*;
class fibostring
{
    public static void main(String args[])
    {
        String s1="a",s2="b";
        System.out.print(s1+" "+s2);
        int n=1;
        while (n<4)
        {
            String s3=s2+s1;
            System.out.print(" "+s3);
            s1=s2;
            s2=s3;
            n++;
        }
    }
}