

// Java program to find the number of integers 
// from 1 to n which contains digits 0's and 1's only 
class GFG 
{ 
      
// Function to find the number of integers 
// from 1 to n which contains 0's and 1's only 
static int countNumbers(int x, int n) 
{ 
    // If number is greater than n 
    if (x > n) 
        return 0; 
  
    // otherwise add count this number and 
    // call two functions 
    return 1 + countNumbers(x * 10, n) + countNumbers(x * 10 + 1, n); 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int n = 120; 
  
    System.out.println(countNumbers(1, n)); 
} 
} 
  
// This code is contributed by chandan_jnu 

