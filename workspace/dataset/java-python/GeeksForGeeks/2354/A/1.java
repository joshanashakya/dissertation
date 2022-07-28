

// Java program to find the minimum number of  
// binary Strings to represent a number 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to find the minimum number of 
    // binary Strings to represent a number 
    static void minBinary(int n) 
    { 
        int[] digit = new int[10]; 
        int len = 0; 
  
        while (n > 0)  
        { 
            digit[len++] = n % 10; 
            n /= 10; 
        } 
  
        // Storing digits in correct order 
        digit = reverse(digit, 0, len - 1); 
  
        int ans = 0; 
  
        // Find the maximum digit in the array 
        for (int i = 0; i < len; i++)  
        { 
            ans = Math.max(ans, digit[i]); 
        } 
  
        System.out.print("Minimum Number of binary" +  
                   " Strings needed: " + ans + "\n"); 
  
        // Traverse for all the binary Strings 
        for (int i = 1; i <= ans; i++) 
        { 
            int num = 0; 
            for (int j = 0; j < len; j++)  
            { 
                // If digit at jth position is greater 
                // than 0 then substitute 1 
                if (digit[j] > 0)  
                { 
                    num = num * 10 + 1; 
                    digit[j]--; 
                } 
                else
                { 
                    num *= 10; 
                } 
            } 
            System.out.print(num + " "); 
        } 
    } 
  
    static int[] reverse(int str[],  
                         int start, int end) 
    { 
  
        // Temporary variable to store character 
        int temp; 
        while (start <= end) 
        { 
            // Swapping the first and last character 
            temp = str[start]; 
            str[start] = str[end]; 
            str[end] = temp; 
            start++; 
            end--; 
        } 
        return str; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 564; 
  
        minBinary(n); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

