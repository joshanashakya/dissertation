

// Java program to count pair with 
// bitwise-AND as even number 
import java.io.*; 
  
class GFG 
{ 
  
// Function to count number of 
// pairs EVEN bitwise AND 
static int findevenPair(int []A, 
                        int N) 
{ 
    int i, j; 
  
    // variable for counting even pairs 
    int evenPair = 0; 
  
    // find all pairs 
    for (i = 0; i < N; i++)  
    { 
        for (j = i + 1; j < N; j++) 
        { 
  
            // find AND operation 
            // to check evenpair 
            if ((A[i] & A[j]) % 2 == 0) 
                evenPair++; 
        } 
    } 
  
    // return number of even pair 
    return evenPair; 
} 
  
// Driver Code 
public static void main (String[] args) 
{ 
    int []a = { 5, 1, 3, 2 }; 
    int n = a.length; 
      
    System.out.println(findevenPair(a, n)); 
} 
} 
  
// This code is contributed by anuj_67.. 

