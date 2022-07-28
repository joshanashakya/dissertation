

// Java program to replace every element  
// of the array with the element that  
// appears before it 
class GFG 
{ 
  
// Function to print the array after  
// replacing every element of the 
// array with the element that appears  
// before it 
static void updateArray(int arr[], int n) 
{ 
    // Update array 
    for (int i = n - 1; i > 0; i--) 
        arr[i] = arr[i - 1]; 
  
    // Change the first element to -1 
    arr[0] = -1; 
  
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

