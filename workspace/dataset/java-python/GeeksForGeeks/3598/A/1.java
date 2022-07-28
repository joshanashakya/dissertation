

// Java implementation of the approach 
import java.util.Arrays; 
import java.io.*; 
  
class GFG { 
  
    // Function to print the Pendulum 
    // arrangement of the given array 
    static void pendulumArrangement(int arr[], int n) 
    { 
        // Sort the array 
        // sort(arr, arr + n); 
  
        Arrays.sort(arr); 
  
        int odd, temp, in, pos; 
  
        // pos stores the index of 
        // the last element of the array 
        pos = n - 1; 
  
        // odd stores the last odd index in the array 
        if (n % 2 == 0) 
            odd = n - 1; 
        else
            odd = n - 2; 
  
        // Move all odd index positioned 
        // elements to the right 
        while (odd > 0) { 
            temp = arr[odd]; 
            in = odd; 
  
            // Shift the elements by one position 
            // from odd to pos 
            while (in != pos) { 
                arr[in] = arr[in + 1]; 
                in++; 
            } 
            arr[in] = temp; 
            odd = odd - 2; 
            pos = pos - 1; 
        } 
  
        // Reverse the element from 0 to (n - 1) / 2 
        int start = 0, end = (n - 1) / 2; 
  
        for (; start < end; start++, end--) { 
            temp = arr[start]; 
            arr[start] = arr[end]; 
            arr[end] = temp; 
        } 
  
        // Printing the pendulum arrangement 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        int arr[] = { 11, 2, 4, 55, 6, 8 }; 
        int n = arr.length; 
  
        pendulumArrangement(arr, n); 
    } 
} 
  
// This code is contributed by akt_mit 

