import java.util.*;
class Palindrome
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter an integer");
        int num=obj.nextInt();
        int temp=num;
        int rev=0;
        if(num<0)
        {
            num=-num;

        }
        while(temp!=0)
        {
            int digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }
        if (num==rev)
        {
            System.out.println("true");
        }
        else 
        {
            System.out.println("false");
        }

    }
}