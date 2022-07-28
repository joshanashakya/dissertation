

// Java program to update every array element with  
// sum of previous and next numbers in array 
  
import java.io.*; 
  
class GFG { 
        static void ReplaceElements(int arr[], int n) {  
        // Nothing to do when array size is 1  
        if (n <= 1) {  
            return;  
        }  
  
        // store current value of arr[0] and update it  
        int prev = arr[0];  
        arr[0] = arr[0] + arr[1];  
  
        // Update rest of the array elements  
        for (int i = 1; i < n - 1; i++) {  
  
            // Store current value of next iteration  
            int curr = arr[i];  
  
            // Update current value using previews value  
            arr[i] = prev + arr[i + 1];  
  
            // Update previous value  
            prev = curr;  
        }  
  
        // Update last array element separately  
        arr[n - 1] = prev + arr[n - 1];  
    }  
  
// Driver program  
      
    public static void main (String[] args) { 
  
        int arr[] = {2, 3, 4, 5, 6};  
        int n = arr.length;  
        ReplaceElements(arr, n);  
        // Print the modified array  
        for (int i = 0; i < n; i++) {  
            System.out.print(arr[i] + " ");  
        }  
    }  
}  
// This code is contributed by akt_mit 

