

import java.util.Collections; 
import java.util.Vector; 
  
// Java implementation of the approach  
class GFG { 
  
// Function to sort all the  
// multiples of x from the  
// array in ascending order  
    static void sortMultiples(int arr[], int n, int x) { 
        Vector<Integer> v = new Vector<Integer>(); 
  
        // Insert all multiples of 5 to a vector  
        for (int i = 0; i < n; i++) { 
            if (arr[i] % x == 0) { 
                v.add(arr[i]); 
            } 
        } 
  
        // Sort the vector  
        Collections.sort(v); 
        //sort(v.begin(), v.end());  
  
        int j = 0; 
  
        // update the array elements  
        for (int i = 0; i < n; i++) { 
            if (arr[i] % x == 0) { 
                arr[i] = v.get(j++); 
            } 
        } 
    } 
  
// Driver code  
    public static void main(String[] args) { 
        int arr[] = {125, 3, 15, 6, 100, 5}; 
        int x = 5; 
        int n = arr.length; 
  
        sortMultiples(arr, n, x); 
  
        // Print the result  
        for (int i = 0; i < n; i++) { 
            System.out.print(arr[i]+" "); 
        } 
    } 
} 
// This code is contributed by Rajput-Ji  

