import java.util.*;
class chirkutlogonkliey
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter s1");
        String s1=sc.nextLine();
        System.out.println("enter s2");
        String s2=sc.nextLine(); String sum="";
        int i=s1.length(); int k=0;
        boolean c=false;
        for(int j=0;j<s1.length();j++)
        {
            sum=s2.substring(k,i);
            if(sum.equalsIgnoreCase(s1))
            {
                c=true;
                break;
            }
            k++; i++;
        }
        if(c==true)
        {
            System.out.println("yes");
            System.out.println(s2.substring(0,k)+s2.substring(i,s2.length()));
        }
        else
        {
            System.out.println("no");
        }
    }
}