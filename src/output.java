import java.util.*;
class output
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int marks[]=new int[n];
        String name[]=new String[n];
       System.out.println("enter marks");
        for(int i=0;i<n;i++)
        {
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+marks[i]);
        }
        System.out.println("\nenter names");
        for(int j=0;j<n;j++)
        {
            name[j]=sc.nextLine();
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+name[i]);
        }
    }
}