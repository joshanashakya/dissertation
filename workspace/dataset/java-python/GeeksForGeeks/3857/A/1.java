

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
      
static int MAX = 32; 
  
// Function to return the count 
// of set bits in n 
static int countSetBits(int n) 
{ 
    int count = 0; 
    while (n > 0)  
    { 
        n &= (n - 1); 
        count++; 
    } 
    return count; 
} 
  
// Function to return the count 
// of required pairs 
static int pairs(int arr[], int n, int k) 
{ 
  
    // To store the count 
    int count = 0; 
  
    // Frequency array 
    int []f = new int[MAX + 1]; 
    for (int i = 0; i < n; i++) 
        f[countSetBits(arr[i])]++; 
  
    for (int i = 0; i <= MAX; i++) 
    { 
        for (int j = i; j <= MAX; j++) 
        { 
  
            // If current pair satisfies 
            // the given condition 
            if (i + j == k) 
            { 
  
                // (arr[i], arr[i]) cannot be a valid pair 
                if (i == j) 
                    count += ((f[i] * (f[i] - 1)) / 2); 
                else
                    count += (f[i] * f[j]); 
            } 
        } 
    } 
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 2, 3, 4, 5 }; 
    int n = arr.length; 
    int k = 4; 
    System.out.println(pairs(arr, n, k)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

