

// Java program to count the integers 
// in a range [L, R] such that 
// their digit sum is Fibonacci 
// and divisible by K 
import java.util.*; 
  
class GFG{ 
   
static int maxSize = (int) (1e5 + 5); 
static boolean []isFib  = new boolean[maxSize]; 
static int []prefix = new int[maxSize]; 
   
// Function to return the 
// digit sum of a number 
static int digitSum(int num) 
{ 
    int s = 0; 
    while (num != 0) { 
        s = s + num % 10; 
        num = num / 10; 
    } 
    return s; 
} 
   
// Function to generate all the Fibonacci 
// numbers upto maxSize 
static void generateFibonacci() 
{ 
    Arrays.fill(isFib, false); 
   
    // Adding the first two Fibonacci 
    // numbers in the set 
    int prev = 0, curr = 1; 
    isFib[prev] = isFib[curr] = true; 
   
    // Computing the remaining Fibonacci 
    // numbers based on the previous 
    // two Fibonacci numbers 
    while (curr < maxSize) { 
        int temp = curr + prev; 
        if(temp < maxSize) 
            isFib[temp] = true; 
        prev = curr; 
        curr = temp; 
    } 
} 
   
// Pre-Computation till maxSize 
// and for a given K 
static void precompute(int k) 
{ 
    generateFibonacci(); 
   
    for (int i = 1; i < maxSize; i++) { 
   
        // Getting the digit sum 
        int sum = digitSum(i); 
   
        // Check if the digit sum 
        // is Fibonacci and divisible by k 
        if (isFib[sum] == true
            && sum % k == 0) { 
            prefix[i]++; 
        } 
    } 
   
    // Taking Prefix Sum 
    for (int i = 1; i < maxSize; i++) { 
        prefix[i] = prefix[i] 
                    + prefix[i - 1]; 
    } 
} 
   
// Function to perform the queries 
static void performQueries( 
    int k, int q, 
    int[][] query) 
{ 
    // Precompute the results 
    precompute(k); 
  
    // Iterating through the queries 
    for (int i = 0; i < q; i++) { 
   
        int l = query[i][0], 
            r = query[i][1]; 
   
        // Getting count of range 
        // in range [L, R] 
        int cnt = prefix[r] 
                  - prefix[l - 1]; 
        System.out.print(cnt +"\n"); 
    } 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
  
    int [][]query 
        = { { 1, 11 }, 
            { 5, 15 }, 
            { 2, 24 } }; 
    int k = 2, q = query.length; 
   
    performQueries(k, q, query); 
} 
} 
  
// This code is contributed by Princi Singh 

