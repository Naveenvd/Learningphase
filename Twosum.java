import java.util.*;
class Twosum
{
    public static void main(String[] args)
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ARRAY LENGTH");
        int n=sc.nextInt();
        int[] num=new int[n];
        System.out.println("ENTER LENGTH OF  ARRAY ");
        for(int i=0;i<n;i++)
        {
         num[i]=sc.nextInt();
        }
       System.out.print("ENTER THE TARGET VALUE");
       int target=sc.nextInt();
       sc.close();
       Twosum obj=new Twosum();
       System.out.println(obj.check(int[] num,target));
    }
    public int[] check(int[] num,int target)
    {
        
    }

}