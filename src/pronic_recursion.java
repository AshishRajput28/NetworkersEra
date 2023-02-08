class pronic_recursion
{
    static boolean pronic(int x)
    {
        for (int i=1;i<=x;i++)
        {
            if (x==i*(i+1))
            {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        for (int i=1; i<=100; i++)
        {
            if (pronic(i))
            {
                System.out.println(i+" ");
            }
        }
    }
}
