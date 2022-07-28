

// Java implementation of above approach 
class GFG 
{ 
  
// Function to check whether  
// a number is prime 
static boolean isPrime(long n)  
{ 
    if (n < 2) return false; 
      
    for (long i = 2; i <= Math.sqrt(n); i++) 
    { 
        if (n % i == 0) return false; 
    } 
    return true; 
} 
  
// reverse the String 
static String reverse(String s) 
{ 
    String s1 = ""; 
    for(int i = s.length() - 1; i >= 0; i--) 
        s1 += s.charAt(i); 
      
    return s1; 
} 
  
// function to generate next  
// smalongest prime palindrome 
static long nextPrimePalindrome(long N)  
{ 
    for (long k = 1; k < 1000000l; k++)  
    { 
          
        // Check for odd-length palindromes 
        String s = ""+k; 
        String z; 
        z = reverse(s); 
      
        // eg. s = '1234' to x = int('1234321') 
        long x = Long.parseLong(s + z.substring(1, z.length())); 
      
        if (x >= N && isPrime(x))  
            return x; 
      
        // Check for even-length palindromes 
        s = ""+(k); 
        z = s; 
        z = reverse(z); 
      
        // eg. s = '1234' to x = int('12344321') 
        x = Long.parseLong(s + z); 
      
        if (x >= N && isPrime(x)) return x; 
    } 
    return -1; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    long N = 7000000000l; 
      
    // Function calong to print answer 
    System.out.println( nextPrimePalindrome(N) ); 
} 
} 
  
// This code is contributed by Arnab Kundu 

