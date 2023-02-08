import java.util.*;
class studentmarks
{
    public static void  main(String args[])
    {
        String city[]={"kanpur","agra","delhi","mumbai","lucknow","mirzapur"};
        String  temp;
        for(int i=0;i<6;i++)
        {
            for (int j = 0; j < 6-i-1; j++)
            {
                if (city[j].compareTo(city[j+1]) > 0)
                {
                    temp = city[j];
                    city[j] = city[j + 1];
                    city[j + 1] = temp;
                }
            }
        }
            for (int i=0;i<6;i++)
            {
                System.out.println(city[i]);
            }
        }
    }