

// Java implementation of the approach 
  
import java.io.*; 
class GFG { 
// Recursive function to return gcd of a and b  
    static int __gcd(int a, int b)  
    {  
        // Everything divides 0   
        if (a == 0)  
          return b;  
        if (b == 0)  
          return a;  
         
        // base case  
        if (a == b)  
            return a;  
         
        // a is greater  
        if (a > b)  
            return __gcd(a-b, b);  
        return __gcd(a, b-a);  
    }  
  
  
      
  
// Function that returns the vector containing the 
// result for the reachability of the required numbers 
static void reachTheNums(int nums[], int k, int d1, int d2, int n) 
{ 
    int i; 
    int ans[] = new int[n]; 
    int gcd = __gcd(d1, d2); 
  
    for (i = 0; i < n; i++) { 
        int x = nums[i] - k; 
  
        // If distance x is coverable 
        if (x % gcd == 0) 
            ans[i] = 1; 
        else
            ans[i] = 0; 
    } 
  
    for (i = 0; i < n; i++) 
        System.out.print(ans[i] + " "); 
} 
  
// Driver code 
  
  
    public static void main (String[] args) { 
        // Numbers to be checked for reachability 
    int nums[] = { 9, 4 }; 
    int n =nums.length; 
    // Starting number K 
    int k = 8; 
  
    // Sizes of jumps d1 and d2 
    int d1 = 3, d2 = 2; 
  
    reachTheNums(nums, k, d1, d2, n); 
    } 
} 
  
// This code is contributed by inder_verma.. 

