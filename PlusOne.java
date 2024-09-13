import java.util.*;

public class PlusOne {
    public static int[] plusOne(int[] digits) 
    {
        int n = digits.length;
        for (int i = n - 1; i >= 0; i--) 
        {
            if (digits[i] < 9) 
            {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        
        int[] newDigits = new int[n + 1];
        newDigits[0] = 1;
        return newDigits;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the number of digits:");
        int length = scanner.nextInt();
        
        int[] digits = new int[length];
        System.out.println("Enter the digits:");
        for (int i = 0; i < length; i++) {
            digits[i] = scanner.nextInt();
        }
        
        int[] result = plusOne(digits);
        System.out.println("Resulting array: " + java.util.Arrays.toString(result));
        
        
    }
}
