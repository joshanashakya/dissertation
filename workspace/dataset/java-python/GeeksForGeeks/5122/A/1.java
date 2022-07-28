

// Java implementation of the approach  
class GfG  
{  
  
// Function to return the minimum value k to be added  
static int FindMinNum(int arr[], int n)  
{  
  
    // Array to store prefix sum  
    int pre[] = new int[n];  
  
    // Initialize the prefix value for first index  
    // as the first element of the array  
    pre[0] = arr[0];  
  
    // Compute the prefix sum for rest of the indices  
    for (int i = 1; i < n; i++)  
        pre[i] = pre[i - 1] + arr[i];  
  
    int k = Integer.MAX_VALUE;  
  
    for (int i = 0; i < n - 1; i++) 
    {  
  
        // Sum of elements from arr[i + 1] to arr[n - 1]  
        int rightSum = pre[n - 1] - pre[i];  
  
        // If sum on the right side of the ith element  
        // is greater than or equal to the sum on the  
        // left side then update the value of k  
        if (rightSum >= pre[i])  
            k = Math.min(k, rightSum - pre[i]);  
    }  
  
    if (k != Integer.MAX_VALUE)  
        return k;  
  
    return -1;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    int arr[] = { 6, 7, 1, 3, 8, 2, 4 };  
    int n = arr.length;  
    System.out.println(FindMinNum(arr, n));  
} 
}  
  
// This code is contributed by Prerna Saini 

