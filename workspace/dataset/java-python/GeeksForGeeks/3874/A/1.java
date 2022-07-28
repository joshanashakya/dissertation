

// Java program to replace every element  
// of the array with the element that  
// appears after it 
class GFG 
{ 
  
// Function to print the array after  
// replacing every element of the array 
// with the element that appears after it 
static void updateArray(int arr[], int n) 
{ 
    // Update array 
    for (int i = 0; i <= n - 2; i++) 
        arr[i] = arr[i + 1]; 
  
    // Change the last element to -1 
    arr[n - 1] = -1; 
  
    // Print the updated array 
    for (int i = 0; i < n; i++) 
        System.out.print(arr[i] + " "); 
} 
  
// Driver Code 
public static void main(String []args) 
{ 
    int arr[] = { 5, 1, 3, 2, 4 } ; 
    int N = arr.length ; 
    updateArray(arr, N); 
} 
} 
  
// This code is contributed by Ryuga 

