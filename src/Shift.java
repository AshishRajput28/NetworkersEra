import java.util.*;
class Shift
{
    int mat[][],m,n;
    Shift(int mm, int nn)
    {
        m=mm;n=nn;m=3;n=3;
        mat=new int[m][n];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        for(int i=0; i<m; i++)

            for(int j=0; j<n; j++)
        {
                System.out.print("matrix: "+i+", "+j+":");
                mat[i][j]=sc.nextInt();
        }
    }
    void cyclic(Shift p)
    {
        for(int i=0; i<m; i++)
            for(int j=0; j<n; j++)
            {
                if(i==0)
                    this.mat[m-1][j]=p.mat[i][j];
                else
                    this.mat[i-1][j]=p.mat[i][j];
            }
    }
    public void display()
    {
        for(int i=0; i<m; i++)
        {
            for(int j=0; j<n; j++)
                System.out .print(mat[i][j]+"\t");
            System.out.println();
        }
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("M=");
        int mm=sc.nextInt();
       System.out.print("N=");
        int nn = sc.nextInt();
        Shift obj1=new Shift(mm,nn);
        Shift obj2=new Shift(mm,nn);
        obj1.input();
        System.out.println("matrix:");
        obj1.display();
        obj2.cyclic(obj1);
        System.out.println("shifted matrix:");
        obj2.display();
    }
}