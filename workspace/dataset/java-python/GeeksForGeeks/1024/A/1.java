

// Java program to make all elements 
// of an Array equal by adding or 
// subtracting at most K 
import java.util.*; 
  
class GFG{ 
   
// Function to equalize the array by 
// adding or subtracting at most K 
// value from each element 
static int equalize(int arr[], int n, int k) 
{ 
   
    // Finding the minimum element 
    // from the array 
    int min_ele 
        = Arrays.stream(arr).min().getAsInt(); 
   
    // Boolean variable to check if the 
    // array can be equalized or not 
    boolean flag = true; 
   
    // Traversing the array 
    for (int i = 0; i < n; i++) { 
   
        // Checking if the values lie 
        // within the possible range 
        // for each element 
        if (!((arr[i] + k) >= min_ele + k 
              && min_ele + k >= (arr[i] - k))) { 
   
            // If any value doesn't lie in 
            // the range then exit the loop 
            flag = false; 
            break; 
        } 
    } 
   
    if (flag) { 
   
        // Value after equalizing the array 
        return min_ele + k; 
    } 
   
    // Array cannot be equalized 
    else
        return -1; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int K = 2; 
    int arr[] = { 1, 2, 3, 4, 5 }; 
    int N = arr.length; 
   
    System.out.print(equalize(arr, N, K)); 
} 
} 
  
// This code is contributed by Princi Singh 

