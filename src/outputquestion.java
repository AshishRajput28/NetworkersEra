import java.util.*;
class outputquestion
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the no. of students:");
        int n=sc.nextInt();
        int tm[]=new int[n],t1;
        String name[]=new String[n],t2;
        System.out.println("enter total marks:");
        for(int i=0;i<n;i++)
        {
            tm[i]=sc.nextInt();
        }
        System.out.println("marks");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+tm[i]);
        }
        System.out.println("\nenter names");
        for(int i=0;i<n;i++)
        {
            name[i]=sc.nextLine();
        }
        System.out.println("names");
        for(int i=0;i<n;i++)
        {
            System.out.print(" "+name[i]);
        }
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if(tm[j]<tm[j+1])
                {
                    t1=tm[j];tm[j]=tm[j+1];tm[j+1]=t1;
                    t2=name[j];name[j]=name[j+1];name[j+1]=t2;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.println("\n"+name[i]+"\t\t"+tm[i]);
        }
    }
}