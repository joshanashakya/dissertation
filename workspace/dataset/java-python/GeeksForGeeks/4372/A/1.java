

// Java program to reverse  
// every alternate sub-array  
// formed by consecutive k elements 
class GFG 
{ 
  
// Function to reverse every  
// alternate sub-array formed  
// by consecutive k elements 
    static void reverse(int arr[], int n, int k) 
    { 
          
        // increment i in multiples of 2*k 
        for (int i = 0; i < n; i += 2 * k) 
        { 
            int left = i; 
  
            // to handle case when 2*k is not multiple of n 
            int right = Math.min(i + k - 1, n - 1); 
  
            // reverse the sub-array [left, right] 
            while (left < right) { 
                swap(arr, left++, right--); 
            } 
        } 
    } 
  
    static int[] swap(int[] array, int i, int j)  
    { 
        int temp = array[i]; 
        array[i] = array[j]; 
        array[j] = temp; 
        return array; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 
                    9, 10, 11, 12, 13, 14}; 
        int k = 3; 
        int n = arr.length; 
  
        reverse(arr, n, k); 
        for (int i = 0; i < n; i++)  
        { 
            System.out.print(arr[i] + " "); 
        } 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

