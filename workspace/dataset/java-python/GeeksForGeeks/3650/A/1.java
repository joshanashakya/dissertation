

// Java implmentation of to  
// maximize the first element of 
// the array such that average 
// of the array remains constant 
import java.util.*; 
  
class GFG{ 
   
// Maximum value of the first 
// array element that can be attained 
static void getmax(int arr[], int n, 
                       int x){ 
       
    // Variable to store the sum 
    int s = 0; 
       
    // Loop to find the sum of array 
    for (int i = 0; i < n; i++) { 
        s = s + arr[i]; 
    } 
       
    // Desired maximum value 
    System.out.print(Math.min(s, x)); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 2, 3, 4 }; 
    int x = 5; 
    int arr_size = arr.length; 
   
    getmax(arr, arr_size, x); 
} 
} 
  
// This code is contributed by 29AjayKumar 

