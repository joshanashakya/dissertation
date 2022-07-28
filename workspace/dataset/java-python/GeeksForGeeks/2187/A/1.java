

// Java implementation of the approach 
class GFG 
{ 
// Function to return minimum GCD 
// among all subarrays 
static int __gcd(int a, int b)  
{  
    if (a == 0)  
        return b;  
    return __gcd(b % a, a);  
}  
static int minGCD(int arr[], int n) 
{ 
  
    int minGCD = 0; 
  
    // Minimum GCD among all sub-arrays will be 
    // the GCD of all the elements of the array 
    for (int i = 0; i < n; i++) 
        minGCD = __gcd(minGCD, arr[i]); 
  
    return minGCD; 
} 
  
// Function to return minimum LCM 
// among all subarrays 
static int minLCM(int arr[], int n) 
{ 
  
    int minLCM = arr[0]; 
  
    // Minimum LCM among all sub-arrays will be 
    // the minimum element from the array 
    for (int i = 1; i < n; i++) 
        minLCM = Math.min(minLCM, arr[i]); 
  
    return minLCM; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
  
    int arr[] = { 2, 66, 14, 521 }; 
    int n = arr.length; 
  
    System.out.println("LCM = " + minLCM(arr, n) 
        + " GCD = "+minGCD(arr, n)); 
  
} 
} 
// This code is contributed by Code_Mech. 

