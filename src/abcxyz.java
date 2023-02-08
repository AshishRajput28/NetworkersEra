import java.util.*;
public class abcxyz
{
    void quad(int n, char ch)
    {
        for(int i=1;i<=n;i++)
        {
            for(int p=1;p<=n;p++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    void quad(int x, int y)
    {
        for(int i=1;i<=x;i++)
        {
            for(int p=1;p<=y;p++)
            {
                System.out.print("@");
            }
            System.out.println();
        }
    }
    public static void main (String args [])
    {
        abcxyz mp=new abcxyz();
        mp.quad(3,'#');
        mp.quad(2,5);
    }
}
