

// Java program to find 
// Sum of GCD over all subarrays. 
class GFG 
{ 
  
// Utility function to calculate 
// sum of gcd of all sub-arrays. 
static int findGCDSum(int n, int a[]) 
{ 
    int GCDSum = 0; 
    int tempGCD = 0; 
    for (int i = 0; i < n; i++) 
    { 
        // Fixing the starting index of a subarray 
        for (int j = i; j < n; j++) 
        { 
            // Fixing the ending index of a subarray 
            tempGCD = 0; 
            for (int k = i; k <= j; k++)  
            { 
                // Finding the GCD of this subarray 
                tempGCD = __gcd(tempGCD, a[k]); 
            } 
              
            // Adding this GCD in our sum 
            GCDSum += tempGCD; 
        } 
    } 
    return GCDSum; 
} 
  
static int __gcd(int a, int b)  
{  
    return b == 0 ? a : __gcd(b, a % b);      
}  
  
// Driver Code 
public static void main(String[] args) 
{ 
    int n = 5; 
    int a[] = { 1, 2, 3, 4, 5 }; 
    int totalSum = findGCDSum(n, a); 
    System.out.print(totalSum + "\n"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

