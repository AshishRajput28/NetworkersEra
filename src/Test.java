import java.util.*;
class Test
{
    void someFun(int x, int y)
    {
        if(x>1)
        {
            if(x%y == 0)
            {
                System.out.print(y+ "");
                someFun(x/y, y);
            }
            else
                someFun(x, y+1);
        }
    }
    public static void main(String[] args)
    {
       Test smjlo=new Test();
       smjlo.someFun(84,2);
    }
}