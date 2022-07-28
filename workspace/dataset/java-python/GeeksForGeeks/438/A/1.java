

// Java implementation of the approach 
import java.util.*; 
  
class solution 
{ 
  
// Function to return the count of required pairs 
static int count(int arr[], int n, int k) 
{ 
  
    // Sort the given array 
    Arrays.sort(arr); 
  
    // To store the required count 
    int cnt = 0; 
    int i = 0, j = 1; 
  
    while (i < n && j < n) { 
  
        // Update j such that it is always > i 
        j = (j <= i) ? (i + 1) : j; 
  
        // Find the first element arr[j] such that 
        // (arr[j] - arr[i]) >= K 
        // This is because after this element, all 
        // the elements will have absolute differecne 
        // with arr[i] >= k and the count of 
        // valid pairs will be (n - j) 
        while (j < n && (arr[j] - arr[i]) < k) 
            j++; 
  
        // Update the count of valid pairs 
        cnt += (n - j); 
  
        // Get to the next element to repeat the steps 
        i++; 
    } 
  
    // Return the count 
    return cnt; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int arr[] = { 1, 2, 3, 4 }; 
    int n = arr.length; 
    int k = 2; 
  
    System.out.println(count(arr, n, k)); 
  
} 
} 

