import java.util.*;
public class Sqrt 
{
    public static void main(String[] args)
    {
        Scanner  obj=new Scanner(System.in);
        System.out.println("Enter an number");
        int num=obj.nextInt();
        Sqrt obj1=new Sqrt();
          int soln=obj1.sqrt(num);
         System.out.println(soln);


    }
    public int sqrt(int x)
    {
     double sqrt1=Math.sqrt(x);
     int ans=(int)sqrt1;
     return ans;

    }
    
}
