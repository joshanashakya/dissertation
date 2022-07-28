

// Java implementation of above approach: 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG 
{ 
  
// Function to find profit 
static int solve(int N, int M,  
                 int cp[], int sp[]) 
{ 
    Integer []profit = new Integer[N]; 
  
    // Calculating profit for each gadget 
    for (int i = 0; i < N; i++) 
        profit[i] = sp[i] - cp[i]; 
  
    // sort the profit array  
    // in decending order 
    Arrays.sort(profit, Collections.reverseOrder());  
  
    // variable to calculate total profit 
    int sum = 0; 
  
    // check for best M profits 
    for (int i = 0; i < M; i++) 
    { 
        if (profit[i] > 0) 
            sum += profit[i]; 
        else
            break; 
    } 
  
    return sum; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int N = 5, M = 3; 
    int CP[] = { 5, 10, 35, 7, 23 }; 
    int SP[] = { 11, 10, 0, 9, 19 }; 
  
    System.out.println(solve(N, M, CP, SP)); 
} 
} 
  
// This code is contributed 
// by Subhadeep Gupta 

