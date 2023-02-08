import java.util.*;
class wonder
{
    public static void main(String args[])
    {
        String wonder[]={"a","b","c","d","e"};
        String location[]={"kanpur","jaipur","mirzapur","delhi","aligarh"};
        Scanner sc=new Scanner(System.in);
        String user=sc.nextLine();
        int c=786;
        for(int i=0;i<location.length;i++)
        {
            if(user.equals(location[i]))
            {
                System.out.println(location[i]+"-"+wonder[i]);
                c++;
                break;
            }
        }
        if(c==786)
        {
            System.out.println("SORRY NOT FOUND!");
        }
    }
}