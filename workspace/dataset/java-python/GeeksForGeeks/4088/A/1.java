

// Java implementation of the approach 
class GFG 
{ 
      
// Function to print the count of 
// a, b and c after n seconds 
static void findCount(int n) 
{ 
    long a = 1, b = 0, c = 0; 
  
    // Number of multiples of 60 below n 
    int x = n / 60; 
    a = (long)Math.pow(32, x); 
  
    // Multiple of 60 nearest to n 
    x = 60 * x; 
  
    for (int i = x + 1; i <= n; i++)  
    { 
  
        // Change all a to b 
        if (i % 2 == 0)  
        { 
            b += a; 
            a = 0; 
        } 
  
        // Change all b to c 
        if (i % 5 == 0)  
        { 
            c += b; 
            b = 0; 
        } 
  
        // Change each c to two a 
        if (i % 12 == 0) 
        { 
            a += (2 * c); 
            c = 0; 
        } 
    } 
  
    // Print the updated values of a, b and c 
    System.out.println("a = " + a + ", b = " + 
                           b + ", c = " + c); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 72; 
    findCount(n); 
} 
} 
  
// This code is contributed by mits 

