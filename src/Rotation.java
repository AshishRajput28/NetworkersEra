import java.util.*;
class Rotation
{
    public static void main (String args[])
    {
        Scanner sc=new Scanner(System.in);
        int i,j,p,x,l;
        String s;
        char ch;
        System.out.println("Enter a sentence");
        s = sc.nextLine(); s=s.trim(); s=s+' ';
        l = s.length();
        String a[] = new String[l];
        x=0; p=0;
        //Store the words in a string array
        for(i=0; i< l; i++)
        {
            ch = s.charAt(i);
            if(ch == ' ' || ch == '.')
            {
                a[x++] = s.substring(p,i);
                p = i+1;
            }
        }
        System.out.println("\nOUTPUT:");
        //Print the sentence in rotation of words
        for(i=0; i< x; i++)
        {
            for(j=i; j< x; j++)
            {
                System.out.print(a[j]+ " ");
            }
            for(j=0; j< i; j++)
            {
                System.out.print(a[j]+ " ");
            }
            System.out.println();
        }
    }//end of main
}//end of class