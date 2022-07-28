

   //Java Program to count 
// Number of ways in which two 
// Beautiful girls are in different group 
  
import java.io.*; 
  
class GFG { 
  
// This function will 
// return the factorial of a given number 
static int factorial(int n) 
{ 
    int result = 1; 
    for (int i = 1; i <= n; i++) 
        result = result * i; 
    return result; 
} 
  
// This function will calculate nCr of given 
// n and r 
static int nCr(int n, int r) 
{ 
    return factorial(n) / (factorial(r) * factorial(n - r)); 
} 
  
// This function will 
// Calculate number of ways 
static int calculate_result(int n) 
{ 
    int result = 2 * nCr((n - 2), (n / 2 - 1)); 
    return result; 
} 
  
// Driver Code 
  
    public static void main (String[] args) { 
        int a = 2, b = 4; 
    System.out.println( calculate_result(2 * a)); 
    System.out.print(calculate_result(2 * b)); 
  
    } 
} 
  
// This code is contributed by inder_verma.. 

