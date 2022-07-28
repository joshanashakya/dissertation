

// Java program to find minimum moves required 
// to make the array in increasing order 
import java.util.*; 
import java.lang.*; 
import java.io.*; 
  
class GFG{ 
// function to find minimum moves required 
// to make the array in increasing order 
static int MinimumMoves(int a[], int n, int x) 
{ 
    // to store answer 
    int ans = 0; 
   
    // iterate over an array 
    for (int i = 1; i < n; i++) { 
   
        // non- increasing order 
        if (a[i] <= a[i - 1]) { 
            int p = (a[i - 1] - a[i]) / x + 1; 
   
            // add moves to answer 
            ans += p; 
   
            // increase the element 
            a[i] += p * x; 
        } 
    } 
   
    // return required answer 
    return ans; 
} 
   
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 1, 3, 3, 2 }; 
    int x = 2; 
    int n = arr.length; 
   
    System.out.println(MinimumMoves(arr, n, x)); 
   
} 
} 

