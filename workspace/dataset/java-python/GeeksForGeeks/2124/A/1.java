

// Java implementation of the approach 
class GFG 
{ 
      
// Function to return the count 
// of N-digit palindrome numbers 
static int nDigitPalindromes(int n) 
{ 
    return (9 * (int)Math.pow(10,  
           (n - 1) / 2)); 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int n = 2; 
  
    System.out.println(nDigitPalindromes(n)); 
} 
} 
  
// This code is contributed by Code_Mech 

