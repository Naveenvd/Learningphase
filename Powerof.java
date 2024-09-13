import java.util.*;
class Powerof
{
    // this program return true if only the number is power of 2
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int num = sc.nextInt();
        Powerof obj=new Powerof();
        boolean res=obj.checkpow(num);
        System.out.println(res);
    }
    public boolean checkpow(int n)
    {
        if(n<=0){
            return false;
        }
        while(n%2==0)
        {
            n/=2;
        }
        return n==1;
        
    }
}