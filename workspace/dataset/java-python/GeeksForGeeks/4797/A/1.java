

// Java implementation of above approach 
  
import java.util.*; 
  
class GFG 
{ 
    // Function to check if n is palindrome 
    static boolean isPalindrome(int n) 
    { 
        // Find the appropriate divisor 
        // to extract the leading digit 
        int divisor = 1; 
        while (n / divisor >= 10) 
            divisor *= 10; 
      
        while (n != 0) { 
            int leading = n / divisor; 
            int trailing = n % 10; 
      
            // If first and last digits are 
            // not same then return false 
            if (leading != trailing) 
                return false; 
      
            // Removing the leading and trailing 
            // digits from the number 
            n = (n % divisor) / 10; 
      
            // Reducing divisor by a factor 
            // of 2 as 2 digits are dropped 
            divisor = divisor / 100; 
        } 
        return true; 
    } 
      
    // Function to find the largest palindromic number 
    static int largestPalindrome(int []A, int n) 
    { 
      
        // Sort the array 
        Arrays.sort(A); 
      
        for (int i = n - 1; i >= 0; --i) { 
      
            // If number is palindrome 
            if (isPalindrome(A[i])) 
                return A[i]; 
        } 
      
        // If no palindromic number found 
        return -1; 
    } 
      
    // Driver program 
    public static void main(String []args) 
    { 
        int []A = { 1, 232, 54545, 999991 }; 
        int n = A.length; 
      
        // print required answer 
        System.out.println(largestPalindrome(A, n)); 
      
          
    } 
  
} 
  
// This code is contributed  
// by ihritik 

