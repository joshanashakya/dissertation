

// Java code to find Even Fibonacci  
// Series using normal Recursion 
  
class GFG{ 
   
// Function which return  
// nth even fibonnaci number  
static long evenFib(int n) 
{ 
    if (n < 1) 
    return n; 
  
    if (n == 1)  
    return 2; 
  
    // calculation of  
    // Fn = 4*(Fn-1) + Fn-2 
    return ((4 * evenFib(n-1)) +  
                 evenFib(n-2));  
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int n = 7; 
    System.out.println(evenFib(n));  
} 
} 
  
// This code is contributed by 
// Smitha Dinesh Semwal 

