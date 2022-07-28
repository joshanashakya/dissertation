

// Java implementation of the approach 
import java.util.*; 
  
class GFG{ 
   
// Function to whether the array 
// can be made zero or not 
static void check(int arr[], int N) 
{ 
    // Count for even elements 
    int even = 0; 
   
    // Count for odd elements 
    int odd = 0; 
   
    // Traverse the array to 
    // count the even and odd 
    for (int i = 0; i < N; i++) { 
   
        // If arr[i] is odd 
        if (arr[i] % 2 == 1) { 
            odd++; 
        } 
   
        // If arr[i] is even 
        else { 
            even++; 
        } 
    } 
   
    // Check if count of even 
    // is zero or count of odd 
    // is zero 
    if (even == N || odd == N) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
} 
   
// Driver's Code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 1, 3 }; 
    int N = arr.length; 
   
    check(arr, N);  
} 
} 
  
// This code is contributed by Rajput-Ji 

