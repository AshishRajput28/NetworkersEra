import java.util.*;
class hexa_decimal
{
    public static void main(String args[])
    {
        System.out.println("enter a word");
        Scanner sc=new Scanner(System.in);
        String help=sc.nextLine();
        String digits = "0123456789ABCDEF";
        help = help.toUpperCase();
        int val = 0;
        for (int i = 0; i < help.length(); i++)
        {
            char c = help.charAt(i);
            int sum = digits.indexOf(c);
            val = 16*val + sum;
        }
        System.out.println(val);
    }
}