

// Java program for computing 
// x^x^x^x.. %m 
class GFG 
{ 
  
// Function to compute 
// the given value 
static int calculate(int x,  
                     int k, int m) 
{ 
    int result = x; 
    k--; 
  
    // compute power k times 
    while (k --> 0) 
    { 
        result = (int)Math.pow(result, x); 
  
        if (result > m) 
            result %= m; 
    } 
  
    return result; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int x = 5, k = 2, m = 3; 
  
    // Calling function 
    System.out.println( calculate(x, k, m)); 
} 
} 
  
// This code is contributed by Arnab Kundu 

