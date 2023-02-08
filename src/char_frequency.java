import java.util.*;
class char_frequency
{
    public static void main(String args[])
    {
        int c=0,f=0;char x;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String st=sc.nextLine();
        st=st.trim(); st=st.toUpperCase();
        System.out.println("Character\tFrequency");
        for(char i='A';i<='Z';i++)
        {
            f=0;c=0;
            for(int j=0;j<st.length();j++)
            {
                x=st.charAt(j);
                if(x==i)
                {
                    f=1; c++;
                }
            }
            if(f==1)
                System.out.print("   "+i+"\t  \t"+c+"\n");
        }

    }
}