

// Java implementation of the approach 
class GFG 
{ 
  
// Utility function to print the array 
static void printArr(int arr[], int n) 
{ 
    for (int i = 0; i < n; i++) 
        System.out.print(arr[i] + " "); 
} 
  
// Function to generate the original 
// array from the pair-product array 
static void constructArr(int pair[], int n) 
{ 
    int size = (1 + (int)Math.sqrt(1 + 8 * n)) / 2; 
    int []arr = new int[size]; 
  
    // First element of the resulting array 
    arr[0] = (int) Math.sqrt((pair[0] * pair[1]) /  
                                        pair[size - 1]); 
  
    // Find all the other elements 
    for (int i = 1; i < size; i++) 
        arr[i] = pair[i - 1] / arr[0]; 
  
    // Print the elements of the generated array 
    printArr(arr, size); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int pair[] = { 48, 18, 24, 24, 32, 12 }; 
    int n = pair.length; 
  
    constructArr(pair, n); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

