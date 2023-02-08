class class11
{
   public static void main(String args[])
   {
      for(int i=1;i<=500;i++)
      {
         int rem=i%10;
         int x=i/10;
         int y=x/10;
         int z=x%10;
         if(Math.pow(rem,3)+Math.pow(y,3)+(Math.pow(z,3))==i)
         {
            System.out.println(i);
         }
      }
   }
}