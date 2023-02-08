class callbyvalue
{
    static void callbyvalue(int checkvalue)
    {
        System.out.println("value "+checkvalue);
        //modifying the parameter
        checkvalue = 15;
        System.out.println("modified value "+checkvalue);
    }
    public static void main(String[] args)
    {
        int test = 50;
        System.out.println("before method call "+test);
        callbyvalue(test);
        System.out.println("after method call "+test);
    }
}