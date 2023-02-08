import java.util.*;
class EqMat
{
    int a[][];
    static int m, n;
    EqMat(int mm, int nn)
    {
        m=mm; n=nn;
        a=new int[m][n];
    }
    void readArray( )
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
    }
    static boolean check(EqMat p, EqMat q)
    {
        boolean check=true;
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(p.a[i][j]!=q.a[i][j])
                    return false;
            }
            System.out.println(p+" "+q);
        }
        return check;
    }
    void print()
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[ ])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("number of rows=");
        int rows=sc.nextInt();
        System.out.print("number of columns=");
        int columns=sc.nextInt();
        EqMat obj1=new EqMat(rows, columns);
        EqMat obj2=new EqMat(rows, columns);
        System.out.println("enter elements of first matrix");
        obj1.readArray();
        System.out.println("enter elements of second matrix");
        obj2.readArray();
        System. out.println("first matrix");
        obj1.print();
        System.out.println("second matrix");
        obj2.print();
        System.out.println("obj1 ="+obj1 + " obj2 ="+obj2);
        if(check(obj1, obj2))
            System.out.println("both matrices same");
        else
            System.out.println("matrices not equal");
    }
}