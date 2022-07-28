

// Java implementation of the approach 
import java.util.Arrays; 
  
class GfG{ 
  
    // Utility function to print the   
    // contents of an array  
    static void printArray(int arr[], int n)  
    {  
        for (int i = 0; i < n; i++)  
            System.out.print(arr[i] + " ");  
    }  
      
    // Function to print the array   
    // with maximum mean  
    static void printMaxMean(int arr[], int n)  
    {  
        int newArr[] = new int[n];  
      
        // Sort the original array  
        Arrays.sort(arr, 0, 2 * n); 
      
        // Construct new array  
        for (int i = 0; i < n; i++)  
            newArr[i] = arr[i + n];  
      
        // Print the resultant array  
        printArray(newArr, n);  
    }  
  
    // Driver code 
    public static void main(String []args) 
    { 
        int arr[] = { 4, 8, 3, 1, 3, 7, 0, 4 };  
        int n = arr.length;  
        printMaxMean(arr, n / 2);  
    } 
} 
  
// This code is contributed by 
// Rituraj Jain 

