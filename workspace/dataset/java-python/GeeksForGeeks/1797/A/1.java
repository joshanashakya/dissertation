

// Java implementation of the approach 
  
class GFG  
{ 
  
// Function to print the good permutation 
// of first N natural numbers 
static int printPermutation(int n) 
{ 
    // If n is odd 
    if (n % 2 != 0) 
    { 
        System.out.println("-1"); 
    } 
  
    // Otherwise 
    else
        for (int i = 1; i <= n / 2; i++) 
        { 
            System.out.print(2 * i + " " + ((2 * i) - 1) + " "); 
        } 
          
    return n; 
      
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int n = 4; 
    printPermutation(n); 
} 
} 
  
// This code contributed by Rajput-Ji 

