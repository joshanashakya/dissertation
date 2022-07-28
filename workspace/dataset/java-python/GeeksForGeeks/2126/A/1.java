

// Java implementation of the approach 
import java.io.*; 
  
class GFG 
{ 
  
// Function to return the factorial of n 
static int fact(int n) 
{ 
    int res = 1; 
    for (int i = 2; i <= n; i++) 
        res = res * i; 
    return res; 
} 
  
// Function to return the 
// count of numbers possible 
static int Count_number(int N) 
{ 
    return (N * fact(N)); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int N = 2; 
  
    System.out.print(Count_number(N)); 
} 
} 
  
// This code is contributed by anuj_67.. 

