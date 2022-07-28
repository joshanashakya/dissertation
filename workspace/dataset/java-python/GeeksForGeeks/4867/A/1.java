

// Program to sort even-placed elements in increasing and 
// odd-placed in decreasing order with constant space complexity 
import java.util.Arrays; 
class GFG { 
  
    static void bitonicGenerator(int arr[], int n) 
    { 
        // first odd index 
        int i = 1; 
  
        // last index 
        int j = n - 1; 
  
        // if last index is odd 
        if (j % 2 != 0) 
            // decrement j to even index 
            j--; 
  
        // swapping till half of array 
        while (i < j) { 
            arr = swap(arr, i, j); 
            i += 2; 
            j -= 2; 
        } 
  
        // Sort first half in increasing 
        Arrays.sort(arr, 0, (n + 1) / 2); 
  
        // Sort second half in decreasing 
        Arrays.sort(arr, (n + 1) / 2, n); 
        int low = (n + 1) / 2, high = n - 1; 
        // Reverse the second half 
        while (low < high) { 
            Integer temp = arr[low]; 
            arr[low] = arr[high]; 
            arr[high] = temp; 
            low++; 
            high--; 
        } 
    } 
    static int[] swap(int[] arr, int i, int j) 
    { 
        int temp = arr[i]; 
        arr[i] = arr[j]; 
        arr[j] = temp; 
        return arr; 
    } 
    // Driver Program 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 5, 8, 9, 6, 7, 3, 4, 2, 0 }; 
        int n = arr.length; 
        bitonicGenerator(arr, n); 
        for (int i = 0; i < n; i++) 
            System.out.print(arr[i] + " "); 
    } 
} 
// This code has been contributed by 29AjayKumar 

