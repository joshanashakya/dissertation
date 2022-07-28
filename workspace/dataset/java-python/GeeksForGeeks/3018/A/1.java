

// Java implementation of the above approach 
class GFG 
{ 
      
// Implementation of factorial function 
static int factorial(int n) 
{ 
    return (n == 1 || n == 0) ? 1 : factorial(n - 1) * n; 
} 
  
// Function to find GCD of factorial of  
// elements from array 
static int gcdOfFactorial(int []arr, int n) 
{ 
    // find the minimum element of array 
    int minm = arr[0]; 
    for (int i = 1; i < n; i++) 
        minm = minm > arr[i] ? arr[i] : minm; 
  
    // return the factorial of minimum element 
    return factorial(minm); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int []arr = { 9, 12, 122, 34, 15 }; 
    int n = arr.length; 
    System.out.println(gcdOfFactorial(arr, n)); 
} 
} 
  
// This code is contributed by mits 

