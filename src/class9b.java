import java.util.*;
class ifelse
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter word");
        String  st=sc.nextLine(); int f,c = 0; char x;
        st=st.toUpperCase();
        for(char i='A';i<='Z';i++)
        {
            f=0;c=0;
            for(int j=0;j<st.length();j++)
            {
                x=st.charAt(j);
                if(x==i)
                {
                    c++;
                }
            }
            if(c==2)
                break;
        }
        if(c<=0)
            System.out.println("yes");
        else
            System.out.println("no");

    }
}