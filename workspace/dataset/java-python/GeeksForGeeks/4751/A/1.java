

// Java program to count 
// pairs with even OR 
import java.io.*; 
  
class GFG  
{ 
  
static int findEvenPair(int A[],  
                        int N) 
{ 
    int evenPair = 0; 
    for (int i = 0; i < N; i++)  
    { 
        for (int j = i + 1; j < N; j++) 
        { 
  
            // find OR operation 
            // check odd or even 
            if ((A[i] | A[j]) % 2 == 0) 
                evenPair++; 
        } 
    } 
      
    // return count of even pair 
    return evenPair; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int A[] = { 5, 6, 2, 8 }; 
    int N = A.length; 
    System.out.println(findEvenPair(A, N)); 
} 
} 
  
// This code is contributed 
// by inder_verma. 

