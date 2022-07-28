

// Java program to Replace every  
// element with the smaller element  
// on its left side  
  
class GFG { 
  
// Function to replace the elements  
    static void ReplaceElements(int arr[], int n) { 
        // MIN value initialised  
        // to element at 0th index  
        int min_ele = arr[0]; 
        arr[0] = -1; 
  
        for (int i = 1; i < n; ++i) { 
  
            // If min_ele is smaller than arr[i]  
            // then just replace arr[i] with min_ele  
            if (min_ele < arr[i]) { 
                arr[i] = min_ele; 
            } // Else if update the min_ele also  
            else if (min_ele >= arr[i]) { 
                int temp = arr[i]; 
                arr[i] = min_ele; 
                min_ele = temp; 
            } 
        } 
    } 
  
// Driver code  
    public static void main(String[] args) { 
        int arr[] = {4, 5, 2, 1, 7, 6}; 
        int n = arr.length; 
  
        // Replace the elements  
        // with the smaller element  
        // on its left side  
        ReplaceElements(arr, n); 
  
        // Print the modified array  
        for (int i = 0; i < n; ++i) { 
            System.out.print(arr[i] + " "); 
        } 
    } 
} 
  
// This code is contributed by Rajput-JI  

