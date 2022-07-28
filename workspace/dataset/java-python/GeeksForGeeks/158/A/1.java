

// Java implementation of the  
// above approach 
import java.lang.*; 
import java.util.*; 
  
class GFG 
{ 
// Function to find the largest number 
// smaller than or equal to N 
// that is divisible by k 
static int findNum(int N, int K) 
{ 
    int rem = N % K; 
  
    if (rem == 0) 
        return N; 
    else
        return N - rem; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int N = 45, K = 6; 
  
    System.out.print("Largest number smaller " +  
                       "than or equal to " + N +  
                 "\nthat is divisible by " + K +  
                        " is " + findNum(N, K)); 
} 
} 
  
// This code is contributed  
// by Akanksha Rai(Abby_akku) 

