

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
static int MAX = 1000000; 
  
static boolean []prime = new boolean[MAX + 1]; 
static void sieve() 
{ 
    Arrays.fill(prime, true); 
    prime[0] = prime[1] = false; 
    for (int p = 2; p * p <= MAX; p++) 
    { 
        if (prime[p] == true)  
        { 
            for (int i = p * p;  
                     i <= MAX; i += p) 
                prime[i] = false; 
        } 
    } 
} 
  
// Function to return the distinct sums 
// that can be obtained by adding prime 
// numbers from the given arrays 
static int distinctSum(int arr1[], 
                       int arr2[],  
                       int m, int n) 
{ 
    sieve(); 
  
    // Set to store distinct sums 
    Set<Integer> sumSet = new HashSet<Integer>(); 
  
    for (int i = 0; i < m; i++) 
        for (int j = 0; j < n; j++) 
            if (prime[arr1[i]] && prime[arr2[j]]) 
                sumSet.add(arr1[i] + arr2[j]); 
  
    return sumSet.size(); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr1[] = { 2, 3 }; 
    int arr2[] = { 2, 2, 4, 7 }; 
    int m = arr1.length; 
    int n = arr2.length; 
    System.out.println(distinctSum(arr1, arr2, m, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

