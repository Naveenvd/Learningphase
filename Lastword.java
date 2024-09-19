import java.util.*;
public class Lastword 
{
    public static void main(String[] args)
    {
     Scanner sc=new Scanner(System.in);
     System.out.println("ENTER THE STRING");
     String s=sc.nextLine();
     Lastword obj=new Lastword();

     System.out.println(obj.len(s));

    }
    public int len(String s)
    {
        String str=s.stripTrailing();
        int count=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)!=' ')
            {
                count++;

            }
            else
            {
                break;

            }
            

        }
        return count;



    }
}
