

// Java implementation of the approach 
import java.util.*; 
class GFG 
{ 
  
// Function for returning the 
// min of two elements 
static int min(int a, int b) 
{ 
    return (a > b) ? b : a; 
} 
  
static int minCostJumpsDP(int []A, int k) 
{ 
    // for calculating the number of elements  
    int size = A.length; 
  
    // Allocating Memo table and  
    // initializing with INT_MAX 
    int []x = new int[size]; 
    Arrays.fill(x, Integer.MAX_VALUE);  
  
    // Base case 
    x[0] = 0; 
  
    // For every element relax every reachable  
    // element ie relax next k elements 
    for (int i = 0; i < size; i++) 
    { 
        // reaching next k element 
        for (int j = i + 1;  
                 j < i + k + 1 &&  
                 j < size; j++)  
        { 
            // Relaxing the element 
            x[j] = min(x[j], x[i] +  
              Math.abs(A[i] - A[j])); 
        } 
    } 
  
    // return the last element in the array 
    return x[size - 1]; 
} 
  
// Driver Code 
public static void main(String []args)  
{ 
    int []input = { 83, 26, 37, 35, 33, 35, 56 }; 
    System.out.println(minCostJumpsDP(input, 3)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

