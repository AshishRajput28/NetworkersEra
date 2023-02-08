class evenoddarrange
{
    public static void main(String args[])
    {
        int a[]={10,1,20,3,40,5,7};
        for(int i=0;i<a.length;i++)
        {
            System.out.print(" "+a[i]);
        }
        System.out.println();
        int even=0,odd=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                even++;
            }
            else
            {
                odd++;
            }
        }
        System.out.println("even numbers "+even);
        System.out.println("odd numbers "+odd);
        int evenar[]=new int[even]; int oddar[]=new int[odd];
        int e1=0,o1=0; int evensum=0,oddsum=0;
        for(int i=0;i<a.length;i++)
        {
            if(a[i]%2==0)
            {
                evensum=evensum+a[i];
                evenar[e1]=a[i];a[i]=0;e1++;
            }
            else
            {
                oddsum=oddsum+a[i];
                oddar[o1]=a[i]; a[i]=0;o1++;
            }
        }
        int combine[]=new int[even+odd]; int count=0;
        for(int i=0;i<evenar.length;i++)
        {
            combine[i]=evenar[i]; count++;
        }
        for(int j=0;j<oddar.length;j++)
        {
            combine[count++]=oddar[j];
        }
        for(int i=0;i<combine.length;i++)
        {
            System.out.print(combine[i]+" ");
        }
        System.out.println("\n"+evensum+" "+oddsum);
    }
}