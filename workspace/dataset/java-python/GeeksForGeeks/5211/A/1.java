

// Java program to find the maximum possible 
// value of last element of the array 
import java.util.*; 
  
class GFG{ 
   
// Function to find the maximum possible 
// value of last element of the array 
static int maxValue(int arr[], int n, int moves) 
{ 
   
    // Traverse for all element 
    for (int i = n - 2; i >= 0; i--) { 
        if (arr[i] > 0) { 
            // Find the distance 
            int distance = n - 1 - i; 
   
            // If moves less than distance then 
            // we can not move this number to end 
            if (moves < distance) 
                break; 
   
            // How many number we can move to end 
            int can_take = moves / distance; 
   
            // Take the minimum of both of them 
            int take = Math.min(arr[i], can_take); 
   
            // Increment in the end 
            arr[n - 1] += take; 
   
            // Remove taken moves 
            moves -= take * distance; 
        } 
    } 
   
    // Return the last element 
    return arr[n - 1]; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int arr[] = { 2, 3, 0, 1 }; 
    int M = 5; 
    int N = arr.length; 
   
    // Function call 
    System.out.print(maxValue(arr, N, M));  
} 
} 
  
// This code is contributed by PrinciRaj1992 

