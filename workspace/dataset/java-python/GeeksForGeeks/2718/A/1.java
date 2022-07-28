

// Java program to find minimum number of steps to 
// convert a given sequence into a permutation 
import java.util.*; 
  
class GFG{ 
   
// Function to find minimum number of steps to 
// convert a given sequence into a permutation 
static int get_permutation(int arr[], int n) 
{ 
    // Sort the given array 
    Arrays.sort(arr); 
   
    // To store the required minimum 
    // number of operations 
    int result = 0; 
   
    // Find the operations on each step 
    for (int i = 0; i < n; i++) { 
        result += Math.abs(arr[i] - (i + 1)); 
    } 
   
    // Return the answer 
    return result; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 0, 2, 3, 4, 1, 6, 8, 9 }; 
   
    int n = arr.length; 
   
    // Function call 
    System.out.print(get_permutation(arr, n)); 
   
} 
} 
  
// This code is contributed by 29AjayKumar 

