

// Java program to find minimum GCD operations 
// to make all array elements one. 
import java.util.*; 
  
class GFG { 
      
//__gcd function 
static int __gcd(int a, int b)  
{ 
    if (a == 0) 
    return b; 
    return __gcd(b % a, a); 
} 
  
// Function to count number of moves. 
static int minimumMoves(int A[], int N)  
{ 
    // Counting Number of ones. 
    int one = 0; 
    for (int i = 0; i < N; i++) 
    if (A[i] == 1) 
        one++; 
  
    // If there is a one 
    if (one != 0) 
    return N - one; 
  
    // Find smallest subarray with  
    // GCD equals to one. 
    int minimum = Integer.MAX_VALUE; 
    for (int i = 0; i < N; i++) { 
          
    // to calculate GCD 
    int g = A[i];  
    for (int j = i + 1; j < N; j++) { 
        g = __gcd(A[j], g); 
        if (g == 1) { 
        minimum = Math.min(minimum, j - i); 
        break; 
        } 
    } 
    } 
  
    if (minimum == Integer.MAX_VALUE) // Not Possible 
    return -1; 
    else
    return N + minimum - 1; // Final answer 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int A[] = {2, 4, 3, 9}; 
    int N = A.length; 
    System.out.print(minimumMoves(A, N)); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

