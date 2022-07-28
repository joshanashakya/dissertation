

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
// Utility function to print 
// the elements of an array 
static void printArr(int []arr, int n) 
{ 
    for (int i = 0; i < n; i++) 
        System.out.print(arr[i] + " "); 
} 
  
// Function to find the required arrangement 
static void findArrangement(int arr[], int n) 
{ 
  
    // There has to be atleast 2 elements 
    if (n < 2) 
    { 
        System.out.print("-1"); 
        return; 
    } 
  
    // Minimum element from the array 
    int minVal = Arrays.stream(arr).min().getAsInt(); 
  
    // Swap any occurrence of the minimum 
    // element with the last element 
    for (int i = 0; i < n; i++)  
    { 
        if (arr[i] == minVal)  
        { 
            swap(arr, i, n - 1); 
            break; 
        } 
    } 
  
    // Find the bitwise AND of the 
    // first (n - 1) elements 
    int andVal = arr[0]; 
    for (int i = 1; i < n - 1; i++)  
    { 
        andVal &= arr[i]; 
    } 
  
    // If the bitwise AND is equal 
    // to the last element then 
    // print the arrangement 
    if (andVal == arr[n - 1]) 
        printArr(arr, n); 
    else
        System.out.print("-1"); 
} 
  
static int[] swap(int []arr, int i, int j) 
{ 
    int temp = arr[i]; 
    arr[i] = arr[j]; 
    arr[j] = temp; 
    return arr; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int arr[] = { 1, 5, 3, 3 }; 
    int n = arr.length; 
  
    findArrangement(arr, n); 
} 
} 
  
// This code is contributed by 29AjayKumar 

