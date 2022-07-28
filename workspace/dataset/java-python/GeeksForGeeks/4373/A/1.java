

// java program to reverse every sub-array formed by  
// consecutive k elements at given distance apart 
class GFG 
{ 
  
// Function to reverse every sub-array formed by  
// consecutive k elements at m distance apart 
static void reverse(int[] arr, int n, int k, int m) 
{ 
    // increment i in multiples of k + m 
    for (int i = 0; i < n; i += k + m) 
    { 
        int left = i; 
  
        // to handle case when k + m is not multiple of n 
        int right = Math.min(i + k - 1, n - 1); 
  
        // reverse the sub-array [left, right] 
        while (left < right) 
            swap(arr,left++, right--); 
    } 
} 
 static int[] swap(int[] arr, int i, int j)  
    { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
        return arr; 
    } 
  
// Driver code 
 public static void main(String[] args)  
    { 
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 
                    9, 10, 11, 12, 13, 14}; 
        int k = 3; 
        int m = 2; 
        int n = arr.length; 
   
        reverse(arr, n, k, m ); 
        for (int i = 0; i < n; i++)  
        { 
            System.out.print(arr[i] + " "); 
        } 
    } 
} 
// This code has been contributed by Rajput-Ji 

