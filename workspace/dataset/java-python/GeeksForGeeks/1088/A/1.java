

// Java program to Replace every 
// element with the greater element 
// on its left side 
import java.util.*; 
  
class Geeks { 
  
  
// Function to replace the elements 
static void ReplaceElements(int arr[], int n) 
{ 
    // Max value initialised 
    // to element at 0th index 
    int max_ele = arr[0]; 
    arr[0] = -1; 
  
    for (int i = 1; i < n; ++i) { 
  
        // If max_ele is greater tha arr[i] 
        // then just replace arr[i] with max_ele 
        if (max_ele > arr[i]) 
            arr[i] = max_ele; 
  
        // Else if update the max_ele also 
        else if (max_ele <= arr[i]) { 
            int temp = arr[i]; 
            arr[i] = max_ele; 
            max_ele = temp; 
        } 
    } 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 4, 5, 2, 1, 7, 6 }; 
    int n = arr.length; 
  
    // Replace the elements 
    // with the smaller element 
    // on its left side 
    ReplaceElements(arr, n); 
  
    // Print the modified array 
    for (int i = 0; i < n; ++i) 
        System.out.println(arr[i]); 
} 
} 
  
// This code is contributed by ankita_saini 

