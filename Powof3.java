import java.util.*;
public class Powof3 
{
    public static void main(String[] args)
{
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER THE NUMBER");
    int num=sc.nextInt();
    Powof3 obj=new Powof3();
    boolean soln=obj.checkpow(num);
    System.out.println(soln);
}
public boolean checkpow(int x)
{
    if(x<=0)
    {
        return false;
    }
    if(x==1)
    {
        return true;
    }
    return (x%3==0 && checkpow(x/3));
}
}
