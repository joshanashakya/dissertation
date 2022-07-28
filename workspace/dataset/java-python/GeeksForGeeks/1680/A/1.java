

// Java program to count pairs 
// with XOR giving a even number 
import java.io.*; 
  
class GFG 
{ 
  
// Function to count number of even pairs 
static int findevenPair(int []A, int N) 
{ 
    int i, j; 
  
    // variable for counting even pairs 
    int evenPair = 0; 
  
    // find all pairs 
    for (i = 0; i < N; i++)  
    { 
        for (j = i + 1; j < N; j++) 
        { 
  
            // find XOR operation 
            // check even or even 
            if ((A[i] ^ A[j]) % 2 == 0) 
                evenPair++; 
        } 
    } 
  
    // return number of even pair 
    return evenPair; 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
    int A[] = { 5, 4, 7, 2, 1 }; 
    int N = A.length; 
      
    // calling function findevenPair 
    // and print number of even pair 
    System.out.println(findevenPair(A, N)); 
} 
} 
  
// This code is contributed by inder_verma.. 

