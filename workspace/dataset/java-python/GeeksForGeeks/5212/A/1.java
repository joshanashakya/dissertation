

// Java implementation of the above approach 
class GFG 
{ 
  
// Function to return the LCM of two numbers 
static int lcm(int a, int b) 
{ 
    int GCD = __gcd(a, b); 
    return (a * b) / GCD; 
} 
  
// Function to return the minimum LCM 
// after removing a single element 
// from the given array 
static int MinLCM(int a[], int n) 
{ 
  
    // Prefix and Suffix arrays 
    int []Prefix = new int[n + 2]; 
    int []Suffix = new int[n + 2]; 
  
    // Single state dynamic programming relation 
    // for storing LCM of first i elements 
    // from the left in Prefix[i] 
    Prefix[1] = a[0]; 
    for (int i = 2; i <= n; i += 1) 
    { 
        Prefix[i] = lcm(Prefix[i - 1],  
                             a[i - 1]); 
    } 
  
    // Initializing Suffix array 
    Suffix[n] = a[n - 1]; 
  
    // Single state dynamic programming relation 
    // for storing LCM of all the elements having 
    // index greater than or equal to i in Suffix[i] 
    for (int i = n - 1; i >= 1; i -= 1)  
    { 
        Suffix[i] = lcm(Suffix[i + 1], 
                             a[i - 1]); 
    } 
  
    // If first or last element of 
    // the array has to be removed 
    int ans = Math.min(Suffix[2],  
                       Prefix[n - 1]); 
  
    // If any other element is replaced 
    for (int i = 2; i < n; i += 1) 
    { 
        ans = Math.min(ans, lcm(Prefix[i - 1],  
                                Suffix[i + 1])); 
    } 
  
    // Return the minimum LCM 
    return ans; 
} 
  
static int __gcd(int a, int b)  
{  
    return b == 0 ? a : __gcd(b, a % b);      
}  
  
// Driver code 
public static void main(String []args) 
{ 
    int a[] = { 5, 15, 9, 36 }; 
    int n = a.length; 
  
    System.out.println(MinLCM(a, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

