// this pgm calculates consecutive ones of the binary array
import java.util.*;
class Conones{
    public static void main (String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE  SIZE OF THE ARRAY ");
        int n=sc.nextInt();
        int[] nums=new int[n];
        for(int i=0;i<n;i++)
        {
            nums[i]=sc.nextInt();

        }
        Conones obj = new Conones();
        System.out.println(obj.check(nums));

        

    }
    public int check(int[] nums)
    {
       int mcount=0;
       int ccount=0;
       for(int i=0;i<nums.length;i++)
       {
        if(nums[i]==1)
        {
            ccount++;
            mcount=Math.max(mcount,ccount);

        }
        else
        {
            ccount=0;

        }
       }
       return mcount;

    }
    


}