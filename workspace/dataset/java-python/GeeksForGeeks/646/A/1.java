

// Java implementation of the approach 
class GFG  
{ 
  
// Function to find the element 
static int findMinRemoval(int arr[], int n) 
{ 
    // Value variable for storing the total value 
    int temp, value = 0; 
  
    // Declaring maximum value as zero 
    int maximum = 0; 
  
    // If array contains on element 
    if (n == 1) 
        return 0; 
  
    for (int i = 0; i < n; i++) 
    { 
  
        // Storing the maximum value in temp variable 
        if (i != 0 && i != n - 1)  
        { 
            value = value + Math.abs(arr[i] - arr[i + 1]); 
  
            // Adding the adjacent difference modulus 
            // values of removed element. Removing adjacent 
            // difference modulus value after removing element 
            temp = Math.abs(arr[i] - arr[i + 1]) +  
                Math.abs(arr[i] - arr[i - 1]) - 
                Math.abs(arr[i - 1] - arr[i + 1]); 
        } 
        else if (i == 0)  
        { 
            value = value + Math.abs(arr[i] - arr[i + 1]); 
            temp = Math.abs(arr[i] - arr[i + 1]); 
        } 
        else
            temp = Math.abs(arr[i] - arr[i - 1]); 
  
        maximum = Math.max(maximum, temp); 
    } 
  
    // Returning total value-maximum value 
    return (value - maximum); 
} 
  
// Drivers code 
public static void main(String[] args)  
{ 
    int arr[] = { 1, 5, 3, 2, 10 }; 
    int n = arr.length; 
    System.out.print(findMinRemoval(arr, n) + "\n"); 
} 
} 
  
// This code contributed by Rajput-Ji 

