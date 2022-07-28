

// Java implementation of the above approach 
import java.util.*; 
  
class GFG 
{ 
  
// Function to calculate gcd(a, b) 
static int gcd(int a, int b) 
{ 
    if (b == 0) 
        return a; 
    return gcd(b, a % b); 
} 
  
// Function to return max length of subarray 
// that satisfies the condition 
static int maxLengthSubArray(int arr[], int n) 
{ 
    int maxLen = -1; 
    for (int i = 0; i < n - 1; i++)  
    { 
        for (int j = i + 1; j < n; j++)  
        { 
            int lcm = 1 * arr[i]; 
            int product = 1 * arr[i]; 
  
            // Update LCM and product of the 
            // sub-array 
            for (int k = i + 1; k <= j; k++)  
              
            { 
                lcm = (((arr[k] * lcm)) /  
                        (gcd(arr[k], lcm))); 
                product = product * arr[k]; 
            } 
  
            // If the current sub-array satisfies  
            // the condition 
            if (lcm == product) 
            { 
  
                // Choose the maximum 
                maxLen = Math.max(maxLen, j - i + 1); 
            } 
        } 
    } 
    return maxLen; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 6, 10, 21 }; 
    int n = arr.length; 
    System.out.println(maxLengthSubArray(arr, n)); 
} 
} 
  
// This code is contributed by 
// Shashank_Sharma 

