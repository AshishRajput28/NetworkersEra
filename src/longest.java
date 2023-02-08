import java.util.*;
class longest
{
    public static void main(String args[])
    {
        int a=1, b=2, c=3;
        c-= b++ - --a + c++ - c/b + b%c + b++%++a;
        System.out.println(c);
    }
}