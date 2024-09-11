import java.util.*;
class Factorial
{
    public  static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER  A NUMBER ");
        int num=sc.nextInt();
        Factorial obj=new Factorial();
        int result=obj.fact(num);
        System.out.printf("FACTORIAL of  %d = %d",num,result);

    }
    public int fact(int n)
    {
        if(n==0)
        {
            return 1;
        }
        else
        {
            return n * fact(n-1);
        }
    }

}