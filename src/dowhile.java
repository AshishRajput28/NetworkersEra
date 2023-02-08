import java.util.*;
class dowhile
{
    public static void main(String args[])
    {
        int i=1;
        do
        {
           if(i%7==0 || i%10==7)
           {
               System.out.println(i);
           }
        }
        while (i++<=100);
    }
}