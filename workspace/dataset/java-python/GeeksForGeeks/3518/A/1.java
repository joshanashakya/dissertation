

// Java program of finding nth palindrome 
// of k digit 
  
  
class GFG{ 
static void nthPalindrome(int n, int k) 
{ 
    // Determine the first half digits 
    int temp = (k & 1)!=0 ? (k / 2) : (k/2 - 1); 
    int palindrome = (int)Math.pow(10, temp); 
    palindrome += n - 1; 
  
    // Print the first half digits of palindrome 
    System.out.print(palindrome); 
  
    // If k is odd, truncate the last digit 
    if ((k & 1)>0) 
        palindrome /= 10; 
  
    // print the last half digits of palindrome 
    while (palindrome>0) 
    { 
        System.out.print(palindrome % 10); 
        palindrome /= 10; 
    } 
    System.out.println(""); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 6, k = 5; 
    System.out.print(n+"th palindrome of "+k+" digit = "); 
    nthPalindrome(n ,k); 
  
    n = 10; 
    k = 6; 
    System.out.print(n+"th palindrome of "+k+" digit = "); 
    nthPalindrome(n, k); 
  
} 
} 
// This code is contributed by mits 

