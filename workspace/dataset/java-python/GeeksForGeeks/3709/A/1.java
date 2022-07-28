

// Java implementation of the approach 
import java.util.*; 
class GFG  
{ 
  
// Function that returns true if it is possible to  
// divide the grid satisfying the given conditions  
static boolean isPossible(int arr[], int p, 
                          int n, int m)  
{  
  
    // To store the sum of all the  
    // cells of the given parts  
    int sum = 0;  
    for (int i = 0; i < p; i++)  
        sum += arr[i];  
  
    // If the sum is equal to the total number  
    // of cells in the given grid  
    if (sum == (n * m))  
        return true;  
    return false;  
}  
  
// Driver code  
public static void main(String[] args) 
{ 
    int n = 3, m = 4;  
    int arr[] = { 6, 3, 2, 1 };  
    int p = arr.length;  
  
    if (isPossible(arr, p, n, m))  
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
}  
  
// This code is contributed by Princi Singh 

