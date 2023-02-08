import java.util.*;
class cyclic_number
{
    //Function to arrange the digits stored in the string s in ascending order
    static String sort(String s)
    {
        String t="";
        int i,j;
        char a[] = s.toCharArray();
        for(i = 0; i < a.length; i++)
        {
            for(j = 0; j < a.length-i-1; j++)
            {
                if(a[j] > a[j+1])
                {
                    char r = a[j];
                    a[j] = a[j+1];
                    a[j+1] = r;
                }
            }
        }
        for(i = 0; i < a.length; i++)
            t = t + a[i];
        return t;
    }
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        String w,r,p;
        int i,n;
        boolean flag = true;
        System.out.println("Enter a number");
        n = sc.nextInt();
        // Convert the integer to string
        String str = Integer.toString(n);
        // Sort the number
        w = sort(str);
        for(i = 2; i <= str.length(); i++)
        {
            // Get the multiples of the number
            r = Integer.toString(n*i);
            // Sort the multiple
            p = sort(r);
            if(p.equals(w) == false)
            {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println(n + " is a cyclic number");
        else
            System.out.println(n + " is not a cyclic number");
    }//end of main
}//end of class