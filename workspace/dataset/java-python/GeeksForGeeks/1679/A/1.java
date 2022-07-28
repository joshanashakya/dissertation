

// Java program to count pair with 
// bitwise-AND as even number 
  
  
import java.io.*; 
  
class GFG { 
   
  
  
// Function to count number of pairs 
// with EVEN bitwise AND 
static int findevenPair(int A[], int N) 
{ 
    int count = 0; 
  
    // count odd numbers 
    for (int i = 0; i < N; i++) 
        if (A[i] % 2 != 0) 
            count++; 
  
    // count odd pairs 
    int oddCount = count * (count - 1) / 2; 
  
    // return number of even pair 
    return (N * (N - 1) / 2) - oddCount; 
} 
  
// Driver Code 
  
    public static void main (String[] args) { 
            int a[] = { 5, 1, 3, 2 }; 
    int n =a.length; 
  
    System.out.print( findevenPair(a, n)); 
    } 
} 
// This code is contributed by anuj_67.. 

