

// Java implementation of above approach 
public class GFG { 
  
    public static final int MAX = 10; 
  
    // Function to return the required minimum sum 
    static int minSum(int arr[], int n) 
    { 
  
        // Array to store the 
        // frequency of each digit 
        int freq[] = new int[MAX]; 
        for (int i = 0; i < n; i++) { 
  
            // Store count of every digit 
            freq[arr[i]]++; 
        } 
  
        // Update arr[] such that it is 
        // sorted in ascending 
        int k = 0; 
        for (int i = 0; i < MAX; i++) { 
  
            // Adding elements in arr[] 
            // in sorted order 
            for (int j = 0; j < freq[i]; j++) { 
                arr[k++] = i; 
            } 
        } 
  
        int num1 = 0; 
        int num2 = 0; 
  
        // Generating numbers alternatively 
        for (int i = 0; i < n; i++) { 
  
            if (i % 2 == 0) 
                num1 = num1 * MAX + arr[i]; 
            else
                num2 = num2 * MAX + arr[i]; 
        } 
  
        // Return the minimum possible sum 
        return num1 + num2; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = { 6, 8, 4, 5, 2, 3 }; 
        int n = arr.length; 
        System.out.print(minSum(arr, n)); 
    } 
} 

