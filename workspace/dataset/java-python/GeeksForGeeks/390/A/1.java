

// Java program to calculate minimum cost 
// to make an Array a permutation 
// of first N natural numbers 
import java.util.*; 
  
class GFG{ 
   
// Function to calculate minimum cost 
// for making permutation of size N 
static int make_permutation(int arr[], int n) 
{ 
    // sorting the array in ascending order 
    Arrays.sort(arr); 
   
    // To store the required answer 
    int ans = 0; 
   
    // Traverse the whole array 
    for (int i = 0; i < n; i++) 
        ans += Math.abs(i + 1 - arr[i]); 
   
    // Return the required answer 
    return ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 5, 3, 8, 1, 1 }; 
    int n = arr.length; 
   
    // Function call 
    System.out.print(make_permutation(arr, n)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

