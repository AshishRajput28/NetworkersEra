import java.util.*;
class MatRev
{
    int arr[][],m,n;
    MatRev(int mm, int nn)
    {
        m=mm;n=nn;
        arr=new int[m][n];
    }
    void fillArray( )
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter matrix elements");
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
    }
    int reverse(int x)
    {
        int rev=0;
        for(int i=x; i!=0; i/=10)
            rev=rev*10+i%10;
        return rev;
    }
    void revMat(MatRev p)
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                this.arr[i][j]=reverse(p.arr[i][j]);
            }
        }
    }
    void show()
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of rows=");
        int x=sc.nextInt();
        System.out.print("enter number of columns=");
        int y=sc.nextInt();
        MatRev obj1=new MatRev(x, y);
        MatRev obj2=new MatRev(x, y);
        obj1.fillArray();
        obj2.revMat(obj1);
        System.out.println("original Matrix is");
        obj1.show();
        System.out.println("reverse matrix");
        obj2.show();
    }
}