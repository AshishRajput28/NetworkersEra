class sorting_alpha
{
    public static void main(String[] args)
    {
        int[] a={1,2,3,4,5,6,7,8};
        int item=6; int low=0;
        int high=a.length-1;
        int min=(low+high)/2;
        while(low<=high) // paap mat karoo
        {
            if(a[min]==item)
            {
                System.out.println(" found " +  min );
                break;
            }
            else if(a[min]<item)
            {
                low=min+1;
            }
            else
            {
                high=min-1;
            }
            min=(low+high)/2;
        }
    }
}