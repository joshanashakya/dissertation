

// Java implementation of the approach 
class GFG  
{ 
      
static int max_size= 20; 
static int max_k =20; 
  
// Array to store the states of DP 
static int [][]dp = new int[max_size][max_k]; 
  
// Array to check if a 
// state has been solved before 
static boolean [][]v = new boolean[max_size][max_k]; 
  
// To store the sum of 
// the array elements 
static int sum = 0; 
  
// Function to find the sum of 
// all the array elements 
static void findSum(int arr[], int n) 
{ 
    for (int i = 0; i < n; i++) 
        sum += arr[i]; 
} 
  
// Function to return the number of ways 
static int cntWays(int arr[], int i, int ck, 
            int k, int n, int curr_sum) 
{ 
    // If sum is not divisible by k 
    // answer will be zero 
    if (sum % k != 0) 
        return 0; 
    if (i != n && ck == k + 1) 
        return 0; 
  
    // Base case 
    if (i == n)  
    { 
        if (ck == k + 1) 
            return 1; 
        else
            return 0; 
    } 
  
    // To check if a state 
    // has been solved before 
    if (v[i][ck]) 
        return dp[i][ck]; 
  
    // Sum of all the numbers from the beginning 
    // of the array 
    curr_sum += arr[i]; 
  
    // Setting the current state as solved 
    v[i][ck] = true; 
  
    // Recurrence relation 
    dp[i][ck] = cntWays(arr, i + 1, ck, k, n, curr_sum); 
    if (curr_sum == (sum / k) * ck) 
        dp[i][ck] += cntWays(arr, i + 1, ck + 1, k, n, curr_sum); 
  
    // Returning solved state 
    return dp[i][ck]; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, -1, 1, -1, 1, -1 }; 
    int n = arr.length; 
    int k = 2; 
  
    // Function call to find the 
    // sum of the array elements 
    findSum(arr, n); 
  
    // Print the number of ways 
    System.out.println(cntWays(arr, 0, 1, k, n, 0)); 
} 
} 
  
// This code is contributed by Princi Singh 

