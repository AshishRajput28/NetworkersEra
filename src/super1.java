//wap where parameterized constructor of the super class can be called from sub class using super()
class one
{
    int i;
    one(int i)
    {
        this.i=i;
    }
}
class two extends one
{
    int i;
    two(int a , int b)
    {
        super(a);
        i=b;
    }
    void show()
    {
        System.out.println("sub class i="+i);
        System.out.println("super class i="+i);
    }
}
class super1
{
    public static void main(String[] args)
    {
        two t=new two(11,22);
        t.show();
    }
}
