

// Java Implementation of above method 
import java.lang.*; 
  
class GFG { 
      
static final int mod = 1000000007; 
  
// Finding number of possible number with 
// n digits excluding a particular digit 
static int digitNumber(long n) { 
  
    // Checking if number of digits is zero 
    if (n == 0) 
    return 1; 
  
    // Checking if number of digits is one 
    if (n == 1) 
    return 9; 
  
    // Checking if number of digits is odd 
    if (n % 2 != 0) { 
  
    // Calling digitNumber function 
    // with (digit-1)/2 digits 
    int temp = digitNumber((n - 1) / 2) % mod; 
      
    return (9 * (temp * temp) % mod) % mod; 
    }  
    else { 
  
    // Calling digitNumber function 
    // with n/2 digits 
    int temp = digitNumber(n / 2) % mod; 
      
    return (temp * temp) % mod; 
    } 
} 
  
static int countExcluding(int n, int d) { 
      
    // Calling digitNumber function 
    // Checking if excluding digit is 
    // zero or non-zero 
    if (d == 0) 
    return (9 * digitNumber(n - 1)) % mod; 
    else
    return (8 * digitNumber(n - 1)) % mod; 
} 
  
// Driver function to run above program 
public static void main(String[] args) { 
      
    // Initializing variables 
    int d = 9; 
    int n = 3; 
    System.out.println(countExcluding(n, d)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

