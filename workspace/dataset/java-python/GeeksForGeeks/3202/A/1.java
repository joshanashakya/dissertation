

// Java code for improved implementation 
import java.io.*; 
  
class GFG 
{ 
      
// Function for printing all elements of B[] 
// that are not divisible by any element of A[] 
static void printNonDivisible(int []A, int []B,  
                                    int n,int m) 
{ 
    // Find maximum element in B[] 
    int maxB = 0; 
    for (int i = 0; i < m; i++) 
        if (B[i] > maxB) 
            maxB = B[i]; 
  
    // Initialize all multiples as marked 
  
    int [] mark = new int[maxB + 1]; 
    for(int i = 0; i < maxB; i++) 
        mark[i]=0; 
  
    // Marking the multiples of all the 
    // elements of the array. 
    for (int i = 0; i < n; i++) 
        for (int x = A[i]; x <= maxB; x += A[i]) 
            mark[x]++; 
  
    // Print not marked elements 
    for (int i = 0; i < m; i++) 
        if (mark[B[i]] == 0) 
            System.out.println(B[i]); 
} 
  
// Driver code 
static public void main(String[] args) 
{ 
    int []A= {100, 200, 400, 100}; 
    int n = A.length; 
    int []B= {190, 200, 87, 600, 800}; 
    int m = B.length; 
    printNonDivisible(A, B, n, m); 
} 
} 
  
// This code is contributed by Mohit Kumar. 

