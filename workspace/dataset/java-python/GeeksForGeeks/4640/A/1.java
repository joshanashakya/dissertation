

// Java program to copy the contents 
// of one array into another 
// in the reverse order 
class GFG { 
  
// Function to print the array 
static void printArray(int arr[], int len) 
{ 
    int i; 
    for (i = 0; i < len; i++) 
    { 
        System.out.printf("%d ", arr[i]); 
    } 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int original_arr[] = {1, 2, 3, 4, 5}; 
    int len = original_arr.length; 
    int copied_arr[] = new int[len], i, j; 
      
    // Copy the elements of the array 
    // in the copied_arr in Reverse Order 
    for (i = 0; i < len; i++) 
    { 
        copied_arr[i] = original_arr[len - i - 1]; 
    } 
  
    // Print the original_arr 
    System.out.printf("\nOriginal array: "); 
    printArray(original_arr, len); 
  
    // Print the copied array 
    System.out.printf("\nResultant array: "); 
    printArray(copied_arr, len); 
    } 
} 
  
// This code is contributed by  
// PrinciRaj1992  

