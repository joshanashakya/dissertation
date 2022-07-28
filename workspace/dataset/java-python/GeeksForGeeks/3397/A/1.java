

// Java implementation of the approach  
import java.util.Arrays;  
  
class geeksforgeeks { 
  
// Function to return the minimum number of  
// increment operations required to make  
// any k elements of the array equal  
static int minOperations(int ar[], int k)  
{  
    // Sort the array in increasing order  
    Arrays.sort(ar);  
  
    // Calculate the number of operations  
    // needed to make 1st k elements equal to  
    // the kth element i.e. the 1st window  
    int opsNeeded = 0;  
    for (int i = 0; i < k; i++) {  
        opsNeeded += ar[k - 1] - ar[i];  
    }  
  
    // Answer will be the minimum of all  
    // possible k sized windows  
    int ans = opsNeeded;  
  
    // Find the operations needed to make  
    // k elements equal to ith element  
    for (int i = k; i < ar.length; i++) {  
  
        // Slide the window to the right and  
        // subtract increments spent on leftmost  
        // element of the previous window  
        opsNeeded = opsNeeded - (ar[i - 1] - ar[i - k]);  
  
        // Add increments needed to make the 1st k-1  
        // elements of this window equal to the  
        // kth element of the current window  
        opsNeeded += (k - 1) * (ar[i] - ar[i - 1]);  
        ans = Math.min(ans, opsNeeded);  
    }  
    return ans;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int[] arr = { 3, 1, 9, 100 };  
    int n = arr.length;  
    int k = 3;  
  
    System.out.printf("%d",minOperations(arr, k));  
}  
} 
  
// This code is contributed by Atul_kumar_Shrivastava 

