

// Java implementation of above approach 
  
import java.io.*; 
  
class GFG { 
  
// Function to count factors in O(N) 
static int numberOfDivisors(int num) 
{ 
    int c = 0; 
  
    // iterate and check if factor or not 
    for (int i = 1; i <= num; i++) { 
        if (num % i == 0) { 
            c += 1; 
        } 
    } 
    return c; 
} 
  
// Function to count numbers having 
// exactly 9 divisors 
static int countNumbers(int n) 
{ 
    int c = 0; 
  
    // check for all numbers <=N 
    for (int i = 1; i <= n; i++) { 
        // check if exactly 9 factors or not 
        if (numberOfDivisors(i) == 9) 
            c += 1; 
    } 
    return c; 
} 
  
       // Driver Code 
    public static void main (String[] args) { 
    int n = 1000; 
  
    System.out.print(countNumbers(n)); 
    } 
} 
  
// This code is contributed by inder_verma.. 

