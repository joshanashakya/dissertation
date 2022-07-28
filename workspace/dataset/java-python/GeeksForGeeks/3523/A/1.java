

// Java Program for above approach 
import java.io.*; 
  
class GFG  
{ 
      
static int arrSize = 51; 
static int maxSum = 201; 
static int MAX = 100; 
static int inf = 999999; 
  
// Variable to store states of dp 
static int dp[][] = new int [arrSize][maxSum]; 
static int visit[][] = new int [arrSize][maxSum]; 
  
// Function to return the number  
// closer to integer s 
static int RetClose(int a, int b, int s) 
{ 
    if (Math.abs(a - s) < Math.abs(b - s)) 
        return a; 
    else
        return b; 
} 
  
// To find the sum closest to zero 
// Since sum can be negative, we will add MAX 
// to it to make it positive 
static int MinDiff(int i, int sum, 
                   int arr[], int n) 
{ 
  
    // Base cases 
    if (i == n) 
        return 0; 
          
    // Checks if a state is already solved 
    if (visit[i][sum + MAX] > 0 ) 
        return dp[i][sum + MAX]; 
    visit[i][sum + MAX] = 1; 
  
    // Recurrence relation 
    dp[i][sum + MAX] = RetClose(arr[i] + 
                        MinDiff(i + 1, sum + arr[i], arr, n), 
                        MinDiff(i + 1, sum, arr, n), -1 * sum); 
  
    // Returning the value 
    return dp[i][sum + MAX]; 
} 
  
// Function to calculate the closest sum value 
static void FindClose(int arr[], int n) 
{ 
    int ans = inf; 
  
    // Calculate the Closest value for every 
    // subarray arr[i-1:n] 
    for (int i = 1; i <= n; i++) 
        ans = RetClose(arr[i - 1] + 
            MinDiff(i, arr[i - 1],  
                       arr, n), ans, 0); 
  
        System.out.println(ans); 
} 
  
// Driver Code 
public static void main (String[] args)  
{ 
  
    // Input array 
    int arr[] = { 25, -9, -10, -4, -7, -33 }; 
    int n = arr.length; 
      
    FindClose(arr,n); 
} 
} 
  
// This code is contributed by ajit_00023@  

