

// Java implementation of the approach 
import java.util.Arrays; 
  
class GFG  
{ 
  
// Function that returns the minimum 
// number greater than maximum of the 
// array that cannot be formed using the 
// elements of the array 
static int findNumber(int arr[], int n) 
{ 
  
    // Sort the given array 
    Arrays.sort(arr); 
  
    // Maximum number in the array 
    int max = arr[n - 1]; 
  
    // table[i] will store the minimum number of 
    // elements from the array to form i 
    int table[] = new int[(2 * max) + 1]; 
  
    table[0] = 0; 
  
    for (int i = 1; i < (2 * max) + 1; i++) 
        table[i] = Integer.MAX_VALUE; 
  
    int ans = -1; 
  
    // Calculate the minimum number of elements 
    // from the array required to form 
    // the numbers from 1 to (2 * max) 
    for (int i = 1; i < (2 * max) + 1; i++) 
    { 
        for (int j = 0; j < n; j++) 
        { 
            if (arr[j] <= i) 
            { 
                int res = table[i - arr[j]]; 
                if (res != Integer.MAX_VALUE && res + 1 < table[i]) 
                    table[i] = res + 1; 
            } 
        } 
  
        // If there exists a number greater than 
        // the maximum element of the array that can be 
        // formed using the numbers of array 
        if (i > arr[n - 1] && table[i] == Integer.MAX_VALUE) 
        { 
            ans = i; 
            break; 
        } 
    } 
  
    return ans; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = { 6, 7, 15 }; 
    int n = arr.length; 
  
    System.out.println(findNumber(arr, n)); 
} 
} 
  
/* This code contributed by PrinciRaj1992 */

