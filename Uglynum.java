import java.util.*;
class Uglynum
{
    public static void main(String[] args)
    {
     Scanner obj=new Scanner(System.in);
     System.out.println("ENTER A NUMBER:");
     int num=obj.nextInt();
     Uglynum ob=new Uglynum();
     boolean res=ob.isugly(num);
     System.out.println(res);
    }
    public boolean isugly(int num)
    {
        if(num<=0)
        {
            return false;
        }
        return PrimeFactors(num)==1;
    }
    private static int PrimeFactors(int n) {
        if (n % 2 == 0) {
            return PrimeFactors(n / 2);
        }
        if (n % 3 == 0) {
            return PrimeFactors(n / 3);
        }
        if (n % 5 == 0) {
            return PrimeFactors(n / 5);
        }
        return n;
    }
}