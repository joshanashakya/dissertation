

// Java implementation of the approach 
import java.util.Arrays; 
  
class GFG 
{ 
  
    // Utility function to print 
    // the contents of an array 
    static void printArr(int arr[], int n)  
    { 
        for (int i = 0; i < n; i++)  
        { 
            System.out.print(arr[i] + " "); 
        } 
    } 
  
    // Function to find the required numbers 
    static void findNumbers(int arr[], int n)  
    { 
  
        // Sort array in decreasing order 
        Arrays.sort(arr); 
        reverse(arr); 
        int freq[] = new int[arr[0] + 1]; 
  
        // Count frequency of each element 
        for (int i = 0; i < n; i++) 
        { 
            freq[arr[i]]++; 
        } 
  
        // Size of the resultant array 
        int size = (int) Math.sqrt(n); 
        int brr[] = new int[size], x, l = 0; 
  
        for (int i = 0; i < n; i++) 
        { 
            if (freq[arr[i]] > 0 && l < size)  
            { 
  
                // Store the highest element in 
                // the resultant array 
                brr[l] = arr[i]; 
  
                // Decrement the frequency of that element 
                freq[brr[l]]--; 
                l++; 
                for (int j = 0; j < l; j++)  
                { 
                    if (i != j)  
                    { 
  
                        // Compute GCD 
                        x = __gcd(arr[i], brr[j]); 
  
                        // Decrement GCD value by 2 
                        freq[x] -= 2; 
                    } 
                } 
            } 
        } 
  
        printArr(brr, size); 
    } 
      
    // reverse array 
    public static void reverse(int[] input)  
    { 
        int last = input.length - 1; 
        int middle = input.length / 2; 
        for (int i = 0; i <= middle; i++)  
        { 
            int temp = input[i]; 
            input[i] = input[last - i]; 
            input[last - i] = temp; 
        } 
    } 
  
    static int __gcd(int a, int b)  
    { 
        if (b == 0)  
        { 
            return a; 
        } 
        return __gcd(b, a % b); 
  
    } 
      
    // Driver code 
    public static void main(String[] args) 
    { 
        int arr[] = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
            1, 1, 1, 5, 5, 5, 7, 10, 12, 2, 2}; 
        int n = arr.length; 
        findNumbers(arr, n); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

