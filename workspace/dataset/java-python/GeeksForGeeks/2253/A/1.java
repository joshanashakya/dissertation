

// Java program to change one element of an array such 
// that the resulting array is in arithmetic progression. 
import java.util.Arrays; 
  
class AP { 
    static void makeAP(int arr[], int n) 
    { 
        int initial_term, common_difference; 
  
        // Finds the initial term and common difference and 
        // prints the resulting array. 
        if (n == 3) { 
            common_difference = arr[2] - arr[1]; 
            initial_term = arr[1] - common_difference; 
        } 
        else if ((arr[1] - arr[0]) == arr[2] - arr[1]) { 
  
            // Check if the first three elements are in 
            // arithmetic progression 
            initial_term = arr[0]; 
            common_difference = arr[1] - arr[0]; 
        } 
        else if ((arr[2] - arr[1]) == (arr[3] - arr[2])) { 
            // Check if the first element is not 
            // in arithmetic progression 
            common_difference = arr[2] - arr[1]; 
            initial_term = arr[1] - common_difference; 
        } 
        else { 
            // The first and fourth element are 
            // in arithmetic progression 
            common_difference = (arr[3] - arr[0]) / 3; 
            initial_term = arr[0]; 
        } 
  
        // Print the arithmetic progression 
        for (int i = 0; i < n; i++) 
            System.out.print(initial_term + 
                            (i * common_difference) + " "); 
        System.out.println(); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 3, 7 }; 
        int n = arr.length; 
        makeAP(arr, n); 
    } 
} 

