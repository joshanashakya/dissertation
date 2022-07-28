

// Java program to check if a given sequence 
// is a concatenation of two permutations or not 
import java.util.*; 
  
class GFG{ 
  
// Function to Check if a given sequence 
// is a concatenation of two permutations or not 
static boolean checkPermutation(int []arr, int n) 
{ 
    // Computing the sum of all the 
    // elements in the array 
    int sum = 0; 
    for (int i = 0; i < n; i++) 
        sum += arr[i]; 
  
    // Computing the prefix sum 
    // for all the elements in the array 
    int []prefix = new int[n + 1]; 
    Arrays.fill(prefix,0); 
    prefix[0] = arr[0]; 
    for (int i = 1; i < n; i++) 
        prefix[i] = prefix[i - 1] + arr[i]; 
  
    // Iterating through the i 
    // from lengths 1 to n-1 
    for (int i = 0; i < n - 1; i++) { 
  
        // Sum of first i+1 elements 
        int lsum = prefix[i]; 
  
        // Sum of remaining n-i-1 elements 
        int rsum = sum - prefix[i]; 
  
        // Lengths of the 2 permutations 
        int l_len = i + 1, 
                r_len = n - i - 1; 
  
        // Checking if the sums 
        // satisfy the formula or not 
        if (((2 * lsum) 
            == (l_len * (l_len + 1))) 
            && ((2 * rsum) 
                == (r_len * (r_len + 1)))) 
            return true; 
    } 
  
    return false; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int []arr = { 1, 2, 5, 3, 4, 1, 2 }; 
    int n = arr.length; 
  
    if (checkPermutation(arr, n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
  
} 
} 
  
// This code is contributed by Surendra_Gangwar 

