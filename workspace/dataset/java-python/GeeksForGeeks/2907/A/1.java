

// Java implementation  
// of above approach 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
      
// Function to find the  
// number of tiles 
static int solve(int M, int N, int s) 
{ 
    // if breadth is divisible 
    // by side of square 
    if (N % s == 0)  
    { 
  
        // tiles required is N/s 
        N = N / s; 
    } 
    else 
    { 
  
        // one more tile required 
        N = (N / s) + 1; 
    } 
  
    // if length is divisible 
    // by side of square 
    if (M % s == 0)  
    { 
  
        // tiles required is M/s 
        M = M / s; 
    } 
    else 
    { 
          
        // one more tile required 
        M = (M / s) + 1; 
    } 
  
    return M * N; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    // input length and breadth of 
    // rectangle and side of square 
    int N = 12, M = 13, s = 4; 
  
    System.out.println(solve(M, N, s)); 
} 
} 
  
// This code is contributed  
// by ChitraNayal 

