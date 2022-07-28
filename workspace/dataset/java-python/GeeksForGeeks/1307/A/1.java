

    
// Java implementation of the approach 
import java.util.*; 
class solution 
{ 
  
// Function to count possible pairs 
static void CountPair(int L, int R) 
{ 
  
    // total count of numbers in range 
    int x = (R - L + 1); 
  
    // Note that if 'x' is odd then 
    // there will be '1' element left 
    // which can't form a pair 
  
    // printing count of pairs 
    System.out.println(x / 2 + "\n"); 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
  
    int L, R; 
  
    L = 1; R = 8; 
    CountPair(L, R); 
  
} 
} 
//contributed by Arnab Kundu 

