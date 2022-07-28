

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the required count 
static int cntSubArr(int []arr, int n) 
{ 
    // To store the final answer 
    int ans = 0; 
  
    for (int i = 0; i < n; i++)  
    { 
  
        // To store the GCD starting from 
        // index 'i' 
        int curr_gcd = 0; 
  
        // Loop to find the gcd of each subarray 
        // from arr[i] to arr[i...n-1] 
        for (int j = i; j < n; j++)  
        { 
            curr_gcd = __gcd(curr_gcd, arr[j]); 
  
            // Increment the count if curr_gcd = 1 
            ans += (curr_gcd == 1) ? 1 : 0; 
        } 
    } 
  
    // Return the final answer 
    return ans; 
} 
  
static int __gcd(int a, int b)  
{  
    if (b == 0)  
        return a;  
    return __gcd(b, a % b);      
} 
  
// Driver code 
public static void main(String []args)  
{ 
    int arr[] = { 1, 1, 1 }; 
    int n = arr.length; 
  
    System.out.println(cntSubArr(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

