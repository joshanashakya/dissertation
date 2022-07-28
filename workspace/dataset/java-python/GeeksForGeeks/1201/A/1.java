

// Java implementation of the approach 
class GFG  
{ 
  
// Function to return the maximum 
// possible gcd after replacing 
// a single element 
static int MaxGCD(int a[], int n) 
{ 
  
    // Prefix and Suffix arrays 
    int []Prefix = new int[n + 2]; 
    int []Suffix = new int[n + 2]; 
  
    // Single state dynamic programming relation 
    // for storing gcd of first i elements 
    // from the left in Prefix[i] 
    Prefix[1] = a[0]; 
    for (int i = 2; i <= n; i += 1)  
    { 
        Prefix[i] = __gcd(Prefix[i - 1],  
                               a[i - 1]); 
    } 
  
    // Initializing Suffix array 
    Suffix[n] = a[n - 1]; 
  
    // Single state dynamic programming relation 
    // for storing gcd of all the elements having 
    // index greater than or equal to i in Suffix[i] 
    for (int i = n - 1; i >= 1; i -= 1)  
    { 
        Suffix[i] = __gcd(Suffix[i + 1],  
                               a[i - 1]); 
    } 
  
    // If first or last element of 
    // the array has to be replaced 
    int ans = Math.max(Suffix[2], Prefix[n - 1]); 
  
    // If any other element is replaced 
    for (int i = 2; i < n; i += 1) 
    { 
        ans = Math.max(ans, __gcd(Prefix[i - 1],  
                                  Suffix[i + 1])); 
    } 
  
    // Return the maximized gcd 
    return ans; 
} 
  
static int __gcd(int a, int b)  
{  
    return b == 0 ? a : __gcd(b, a % b);      
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int a[] = { 6, 7, 8 }; 
    int n = a.length; 
  
    System.out.println(MaxGCD(a, n)); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

