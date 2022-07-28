

// Java program to find the maximum number of  
// unique values in the array  
import java.util.*; 
  
class GFG { 
      
    // Function to find the maximum number of  
    // unique values in the array  
    static int uniqueNumbers(int arr[], int n)  
    {  
        // Sorting the given array  
        Arrays.sort(arr);  
      
        // This array will store the frequency  
        // of each number in the array  
        // after performing the given operation  
        int freq[] = new int[n + 2];  
      
        // Initialising the array with all zeroes  
        for(int i = 0; i < n + 2; i++) 
            freq[i] = 0; 
  
        // Loop to apply operation on  
        // each element of the array  
        for (int x = 0; x < n; x++) {  
      
            // Incrementing the value at index x  
            // if the value arr[x] - 1 is  
            // not present in the array  
            if (freq[arr[x] - 1] == 0) {  
                freq[arr[x] - 1]++;  
            }  
      
            // If arr[x] itself is not present, then it  
            // is left as it is  
            else if (freq[arr[x]] == 0) {  
                freq[arr[x]]++;  
            }  
      
            // If both arr[x] - 1 and arr[x] are present  
            // then the value is incremented by 1  
            else {  
                freq[arr[x] + 1]++;  
            }  
        }  
      
        // Variable to store the number of unique values  
        int unique = 0;  
      
        // Finding the unique values  
        for (int x = 0; x <= n + 1; x++) {  
            if (freq[x] != 0) {  
                unique++;  
            }  
        }  
      
        // Returning the number of unique values  
        return unique;  
    }  
      
    // Driver Code  
    public static void main (String[] args) 
    {  
        int []arr = { 3, 3, 3, 3 };  
      
        // Size of the array  
        int n = 4;  
      
        int ans = uniqueNumbers(arr, n);  
        System.out.println(ans);  
    }  
} 
  
// This code is contributed by Yash_R 

