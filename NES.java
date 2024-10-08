/*Given an array, print the Next Smaller Element (NSE) for every element. 
The NSE for an element x is the first smaller element on the right side of x in the array.
 Elements for which no smaller element exist (on the right side), consider NSE as -1.  */
//solution --->
import java.util.*;
public class NES 
{
    public static void main(String[] args)
    {
        Scanner obj=new Scanner(System.in);
        
        System.out.println("ENTER SIZE OF ARRAY");
        int s=obj.nextInt();
        int[] arr=new int[s];
        for(int i=0;i<s;i++)
        {
            arr[i]=obj.nextInt();
        }
        NES  obj1=new NES();
        
        obj1.checknes(arr,s);


    }
    public  void checknes(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            int next=-1;
            for(int j=i+1;j<n;j++)
            {
              if(arr[i]>arr[j]) // for finding the next short element 
              {
                next=arr[j]; // assing the next short element of array to a variable 
                break; // short element occure once is enough 
              }
            }
            System.out.println(arr[i]+"---->"+next);

        }

    }

    
}
