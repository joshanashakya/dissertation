

// A naive approach of Java program of finding nth 
// palindrome of k digit 
import java.util.*; 
  
class GFG 
{ 
// Utility function to reverse the number n 
static int reverseNum(int n) 
{ 
    int rem, rev = 0; 
    while (n > 0) 
    { 
        rem = n % 10; 
        rev = rev * 10 + rem; 
        n /= 10; 
    } 
    return rev; 
} 
  
// Boolean Function to check for palindromic 
// number 
static boolean isPalindrom(int num) 
{ 
    return num == reverseNum(num); 
} 
  
// Function for finding nth palindrome of k digits 
static int nthPalindrome(int n, int k) 
{ 
    // Get the smallest k digit number 
    int num = (int)Math.pow(10, k-1); 
  
    while (true) 
    { 
        // check the number is palindrom or not 
        if (isPalindrom(num)) 
            --n; 
  
        // if n'th palindrome found break the loop 
        if (n == 0) 
            break; 
  
        // Increment number for checking next palindrome 
        ++num; 
    } 
  
    return num; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 6, k = 5; 
    System.out.println(n + "th palindrome of " + k + " digit = " + nthPalindrome(n, k)); 
  
    n = 10; k = 6; 
    System.out.println(n + "th palindrome of " + k + " digit = " + nthPalindrome(n, k)); 
} 
} 
  
// This code is contributed by mits 

