

// Java program to find the product of all 
// non-repeated elements in an array 
import java.util.Arrays; 
  
class GFG { 
  
// Function to find the product of all 
// non-repeated elements in an array 
static int findProduct(int arr[], int n) 
{ 
    // sort all elements of array 
    Arrays.sort(arr); 
      
    int prod = 1 * arr[0]; 
    for (int i = 0; i < n - 1; i++)  
    { 
        if (arr[i] != arr[i + 1])  
        { 
            prod = prod * arr[i + 1]; 
        } 
          
    } 
    return prod; 
} 
  
// Driver code 
public static void main(String[] args) { 
    int arr[] = {1, 2, 3, 1, 1, 4, 5, 6}; 
    int n = arr.length; 
    System.out.println(findProduct(arr, n)); 
    } 
} 
  
// This code is contributed by PrinciRaj1992 

