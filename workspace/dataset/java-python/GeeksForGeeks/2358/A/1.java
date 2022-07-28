

// Java program to find minimum 
// toggle required 
import java.io.*; 
  
class GFG { 
  
    // Function to calculate minimum toggling 
    // required by using Dynamic programming 
    static int minToggle(int arr[], int n) 
    { 
        int zero[] = new int[n + 1]; 
        zero[0] = 0; 
  
        // Fill entries in zero[] such that 
        // zero[i] stores count of zeroes 
        // to the left of i (exl 
        for (int i = 1; i <= n; ++i) { 
            // If zero found update zero[] array 
            if (arr[i - 1] == 0) 
                zero[i] = zero[i - 1] + 1; 
            else
                zero[i] = zero[i - 1]; 
        } 
  
        // Finding the minimum toggle required 
        // from every index(0 to n-1) 
        int ans = n; 
        for (int i = 1; i <= n; ++i) 
            ans = Math.min(ans, i - zero[i] + zero[n] 
                                    - zero[i]); 
  
        return ans; 
    } 
  
    // Driver Program 
    public static void main(String[] args) 
    { 
        int arr[] = { 1, 0, 1, 1, 0 }; 
        int n = arr.length; 
        System.out.println(minToggle(arr, n)); 
    } 
} 
  
// This code is contributed by vt_m. 

