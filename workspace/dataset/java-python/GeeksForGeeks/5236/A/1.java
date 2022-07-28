

// Java program to fill an array with frequencies. 
import java.util.Arrays; 
  
class GFG { 
      
    // Fills arr[] with frequencies of elements 
    static void fillWithFreq(int arr[], int n) 
    { 
          
        int temp[]=new int[n]; 
        Arrays.fill(temp, 0); 
      
        // Fill temp with frequencies 
        for (int i = 0; i < n; i++) 
            temp[arr[i]] += 1; 
      
        // Copy temp to array 
        for (int i = 0; i < n; i++) 
            arr[i] = temp[i]; 
    } 
      
    // Driver method 
    public static void main(String[] args) 
    { 
          
        int arr[] = {5, 2, 3, 4, 5, 5, 4, 5, 6, 7}; 
        int n = arr.length; 
          
        fillWithFreq(arr, n); 
          
        for (int i=0; i<n; i++) 
            System.out.print(arr[i] + " "); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

