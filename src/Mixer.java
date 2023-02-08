import java.util.*;
class Mixer
{
    int arr[];
    int n;
    static Scanner sc=new Scanner(System.in);
    Mixer(int nn)
    {
        n=nn;
        arr=new int[n];
    }
    void accept()
    {
        System.out.println("Enter"+ n+ " elements in ascending order");
        for(int i=0; i<n; i++)
            arr[i]=sc.nextInt();
    }
    Mixer mix(Mixer A)
    {
        Mixer B=new Mixer(n+A.n);
        int x=0, y=0, z=0;
        if(x>A.arr[y])
        {
            B.arr[z]=A.arr[y];
            y++;
        }
        else
        {
            B.arr[y]=arr[x];
            x++;
        }
        z++;
        while(x<n)
        B.arr[z++]=arr[x++];
        while(y<A.n)
        B.arr[z++]=A.arr[y++];
        return B;
    }
    void display()
    {
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
    }
    public static void main(String args[])
    {
        Mixer obj=new Mixer(5);
        obj.accept();
        obj.display();
    }
}