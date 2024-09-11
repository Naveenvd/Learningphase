import java.util.*;
class Facttrail
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER:");
        int num = sc.nextInt();
        Facttrail obj=new Facttrail();
        int res = obj.trailnum(num);
        System.out.printf("FACTORIAL TRAIL ZERO OF %d = %d",num,res );

    }
    public static int trailnum(int n)
    {
        int count=0;
        for(int i=5;n/i>=1;i*=5)
        {
            count+=n/i;
        }
        return count;
    }


}