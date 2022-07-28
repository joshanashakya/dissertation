

// Java program to find the count 
// of numbers whose difference with 
// Fibonacci count upto them is atleast K 
import java.util.*; 
  
class GFG{ 
   
static int MAX = 1000005; 
   
// fibUpto[i] denotes the count of 
// fibonacci numbers upto i 
static int []fibUpto = new int[MAX + 1]; 
   
// Function to compute all the Fibonacci 
// numbers and update fibUpto array 
static void compute(int sz) 
{ 
    boolean []isFib = new boolean[sz + 1]; 
   
    // Store the first two Fibonacci numbers 
    int prev = 0, curr = 1; 
    isFib[prev] = isFib[curr] = true; 
   
    // Compute the Fibonacci numbers 
    // and store them in isFib array 
    while (curr <= sz) { 
        int temp = curr + prev; 
        if(temp <= sz) 
            isFib[temp] = true; 
        prev = curr; 
        curr = temp; 
    } 
   
    // Compute fibUpto array 
    fibUpto[0] = 1; 
    for (int i = 1; i <= sz; i++) { 
        fibUpto[i] = fibUpto[i - 1]; 
        if (isFib[i]) 
            fibUpto[i]++; 
    } 
} 
   
// Function to return the count 
// of valid numbers 
static int countOfNumbers(int N, int K) 
{ 
   
    // Compute fibUpto array 
    compute(N); 
   
    // Binary search to find the minimum 
    // number that follows the condition 
    int low = 1, high = N, ans = 0; 
    while (low <= high) { 
        int mid = (low + high) >> 1; 
   
        // Check if the number is 
        // valid, try to reduce it 
        if (mid - fibUpto[mid] >= K) { 
            ans = mid; 
            high = mid - 1; 
        } 
        else
            low = mid + 1; 
    } 
   
    // Ans is the minimum valid number 
    return (ans>0 ? N - ans + 1 : 0); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int N = 10, K = 3; 
   
    System.out.print(countOfNumbers(N, K)); 
} 
} 
  
// This code is contributed by sapnasingh4991 

