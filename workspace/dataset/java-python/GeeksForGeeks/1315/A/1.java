

// Java implementation of the approach 
import java.util.*; 
class GfG { 
  
    // Function to print A and B all of whose 
    // divisors are present in the given array 
    static void printNumbers(int arr[], int n) 
    { 
  
        // Sort the array 
        Arrays.sort(arr); 
  
        // A is the largest element from the array 
        int A = arr[n - 1], B = -1; 
  
        // Iterate from the second largest element 
        for (int i = n - 2; i >= 0; i--) { 
  
            // If current element is not a divisor 
            // of A then it must be B 
            if (A % arr[i] != 0) { 
                B = arr[i]; 
                break; 
            } 
  
            // If current element occurs more than once 
            if (i - 1 >= 0 && arr[i] == arr[i - 1]) { 
                B = arr[i]; 
                break; 
            } 
        } 
  
        // Print A and B 
        System.out.print("A = " + A + ", B = " + B); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 2, 4, 8, 16, 1, 2, 4 }; 
        int n = arr.length; 
        printNumbers(arr, n); 
    } 
} 

