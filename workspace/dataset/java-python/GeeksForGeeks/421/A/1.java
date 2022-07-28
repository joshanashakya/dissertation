

// Java program to find the count 
// number of even and odd 
// length elements in an Array 
import java.util.*; 
class GFG{ 
  
// Function to find the number elements of 
// the array having even length and odd. 
    static void EvenOddLength(int arr[], int n) 
    { 
        // Store numbers with even length 
        int even = 0; 
      
        for (int i = 0; i < n; i++) { 
      
            // Conversion of integer to string 
            String x = Integer.toString(arr[i]); 
      
            if (x.length() % 2 == 0) 
                even++; 
        } 
      
        System.out.println("Number of even length elements = "+even); 
        System.out.println("Number of odd length elements = "+(n - even)); 
    } 
      
    // Driver code 
    public static void main(String args[]) 
    { 
        int arr[] = { 12, 44, 213, 232, 3433 }; 
        int n = arr.length; 
      
        // Function call 
        EvenOddLength(arr, n); 
      
    } 
} 
  
// This code is contributed by AbhiThakur 

