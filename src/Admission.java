import java.util.*;
class Admission
{
    int adno[];
    Admission()
    {
        adno=new int[7];
    }
    public void fillArray()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbers in ascending order");
        for(int i=0;i<adno.length;i++)
        {
            adno[i]=sc.nextInt();
        }
    }
    public int binSearch(int l, int u, int v)
    {
        int m=(l+u)/2;
        if(l>u)
            return-1;
        else if(v==adno[m])
        return 1;
        else if(v>adno[m])
        return binSearch(m+l,u,v);
        else
        return binSearch(l,m-l,v);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        Admission obj=new Admission();
        obj.fillArray();
        System.out.print("enter number to search=");
        int number=sc.nextInt();
        int result=obj.binSearch(0,4,number);
        if(result==1)
            System.out.println(number+" found");
        else
            System.out.println(number +" not found");
    }
}