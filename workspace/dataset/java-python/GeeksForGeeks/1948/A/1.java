

// Java implementation of the approach 
class GFG 
{ 
static int maxN = 10; 
  
// To store factorial values 
static int []fact = new int[maxN]; 
  
// Function to return ncr 
static int ncr(int n, int r) 
{ 
    return (fact[n] / fact[r]) / fact[n - r]; 
} 
  
// Function to return the required sum 
static int findSum(int[] arr, int n) 
{ 
    // Intialising factorial 
    fact[0] = 1; 
    for (int i = 1; i < n; i++) 
        fact[i] = i * fact[i - 1]; 
  
    // Multiplier 
    int mul = 0; 
  
    // Finding the value of multipler 
    // according to the formula 
    for (int i = 0; i <= n - 1; i++) 
        mul += (int)Math.pow(2, i) * ncr(n - 1, i); 
  
    // To store the final answer 
    int ans = 0; 
  
    // Calculate the final answer 
    for (int i = 0; i < n; i++) 
        ans += mul * arr[i]; 
  
    return ans; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int arr[] = { 1, 1 }; 
    int n = arr.length; 
  
    System.out.println(findSum(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

