

// Java program to find the sum of numbers 
// divisible by M in the given range 
  
  
class GFG{ 
   
// Function to find the largest number 
// smaller than or equal to N 
// that is divisible by K 
static int findSmallNum(int N, int K) 
{ 
    // Finding the remainder when N is 
    // divided by K 
    int rem = N % K; 
   
    // If the remainder is 0, then the 
    // number itself is divisible by K 
    if (rem == 0) 
        return N; 
    else
   
        // Else, then the difference between 
        // N and remainder is the largest number 
        // which is divisible by K 
        return N - rem; 
} 
   
// Function to find the smallest number 
// greater than or equal to N 
// that is divisible by K 
static int findLargeNum(int N, int K) 
{ 
    // Finding the remainder when N is 
    // divided by K 
    int rem = (N + K) % K; 
   
    // If the remainder is 0, then the 
    // number itself is divisible by K 
    if (rem == 0) 
        return N; 
    else
   
        // Else, then the difference between 
        // N and remainder is the largest number 
        // which is divisible by K 
        return N + K - rem; 
} 
   
// Function to find the sum of numbers 
// divisible by M in the given range 
static int sumDivisibles(int A, int B, int M) 
{ 
    // Variable to store the sum 
    int first = findSmallNum(A, M); 
    int last = findLargeNum(B, M); 
   
    // To bring the smallest and largest 
    // numbers in the range [A, B] 
    if (first < A) 
        first += M; 
   
    if (last > B) 
        first -= M; 
   
    // To count the number of terms in the AP 
    int n = (B / M) - (A - 1) / M; 
   
    // Sum of n terms of an AP 
    return n * (first + last) / 2; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    // A and B define the range, 
    // M is the dividend 
    int A = 6, B = 15, M = 3; 
   
    // Printing the result 
    System.out.print(sumDivisibles(A, B, M)); 
   
} 
} 
  
// This code contributed by Princi Singh 

