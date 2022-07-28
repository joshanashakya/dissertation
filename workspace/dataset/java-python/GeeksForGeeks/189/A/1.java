

// Java implementation of the approach 
import java.util.*; 
  
class GFG{ 
   
// Function to check if a 
// number is perfect square 
static boolean isPerfectSquare(int x) 
{ 
    int s = (int) Math.sqrt(x); 
    return (s * s == x); 
} 
   
// Function to check if a 
// number is Fibinacci Number 
static boolean isFibonacci(int N) 
{ 
    // N is Fibinacci if either 
    // (5*N*N + 4), (5*N*N - 4) or both 
    // is a perferct square 
    return isPerfectSquare(5 * N * N + 4) 
           || isPerfectSquare(5 * N * N - 4); 
} 
   
// Function to find 
// the next Non-Fibinacci Number 
static int nextNonFibonacci(int N) 
{ 
   
    // Case 1 
    // If N<=3, then 4 will be 
    // next Non-Fibinacci Number 
    if (N <= 3) 
        return 4; 
   
    // Case 2 
    // If N+1 is Fibinacci, then N+2 
    // will be next Non-Fibinacci Number 
    if (isFibonacci(N + 1)) 
        return N + 2; 
   
    // If N+1 is Non-Fibinacci, then N+2 
    // will be next Non-Fibinacci Number 
    else
        return N + 1; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int N = 3; 
    System.out.print(nextNonFibonacci(N) 
         +"\n"); 
   
    N = 5; 
    System.out.print(nextNonFibonacci(N) 
         +"\n"); 
   
    N = 7; 
    System.out.print(nextNonFibonacci(N) 
         +"\n"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

