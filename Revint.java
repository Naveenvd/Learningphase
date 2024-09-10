import java.util.*;
class Revint
{
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=sc.nextInt();
        
        Revint obj=new Revint();
        int soln = obj.revinteger(num);
        System.out.println("The reversed integer is :"+soln);
    }
    public int revinteger(int x)
    {         int reversed = 0;
        while (x != 0) {
            int digit = x % 10; 
            x /= 10; 

           
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0; 
            }
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0; 
            }

            reversed = reversed * 10 + digit; 
        }
        return reversed;
    }
    
}