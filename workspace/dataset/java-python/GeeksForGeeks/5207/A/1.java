

// Java implementation of the approach  
import java.util.*; 
  
class GFG 
{ 
  
// Function to calculate maximum possible middle  
// value of the array after deleting exactly k  
// elements  
static int maximum_middle_value(int n, int k, int arr[])  
{  
    // Initialize answer as -1  
    int ans = -1;  
  
    // Calculate range of elements that can give  
    // maximum possible middle value of the array  
    // since index of maximum possible middle  
    // value after deleting exactly k elements from  
    // array will lie in between low and high  
    int low = (n + 1 - k) / 2;  
  
    int high = (n + 1 - k) / 2 + k;  
  
    // Find maximum element of the array in  
    // range low and high  
    for (int i = low; i <= high; i++)  
    {  
  
        // since indexing is 1 based so  
        // check element at index i - 1  
        ans = Math.max(ans, arr[i - 1]);  
    }  
  
    // Return the maximum possible middle value  
    // of the array after deleting exactly k  
    // elements from the array  
    return ans;  
}  
  
// Driver Code  
public static void main(String args[])  
{  
    int n = 5, k = 2;  
    int arr[] = { 9, 5, 3, 7, 10 };  
    System.out.println( maximum_middle_value(n, k, arr));  
  
    n = 9;  
    k = 3;  
    int arr1[] = { 2, 4, 3, 9, 5, 8, 7, 6, 10 };  
    System.out.println( maximum_middle_value(n, k, arr1));  
}  
} 
  
// This code is contributed by Arnab Kundu 

