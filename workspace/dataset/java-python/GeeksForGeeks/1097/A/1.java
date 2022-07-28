

// Java program to find the sum of all 
// perfect squares in the given range 
class GFG 
{ 
  
// Array to precompute the sum of squares 
// from 1 to 100010 so that for every 
// query, the answer can be returned in O(1). 
static int []pref = new int[100010]; 
  
// Function to check if a number is 
// a perfect square or not 
static int isPerfectSquare(int x) 
{ 
    // Find floating point value of 
    // square root of x. 
    double sr = Math.sqrt(x); 
  
    // If square root is an integer 
    return ((sr - Math.floor(sr)) == 0) ? x : 0; 
} 
  
// Function to precompute the perfect 
// squares upto 100000. 
static void compute() 
{ 
    for (int i = 1; i <= 100000; ++i)  
    { 
        pref[i] = pref[i - 1] 
                + isPerfectSquare(i); 
    } 
} 
  
// Function to print the sum for each query 
static void printSum(int L, int R) 
{ 
    int sum = pref[R] - pref[L - 1]; 
    System.out.print(sum+ " "); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    // To calculate the precompute function 
    compute(); 
  
    int Q = 4; 
    int arr[][] = { { 1, 10 }, 
                    { 1, 100 }, 
                    { 2, 25 }, 
                    { 4, 50 } }; 
  
    // Calling the printSum function 
    // for every query 
    for (int i = 0; i < Q; i++) 
    { 
        printSum(arr[i][0], arr[i][1]); 
    } 
} 
} 
  
// This code is contributed by PrinciRaj1992 

