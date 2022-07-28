

// An efficient Java program to compute 
// sum of bitwise AND of all pairs 
import java.io.*; 
  
class GFG { 
      
    // Returns value of "arr[0] & arr[1] +  
    // arr[0] & arr[2] + ... arr[i] & arr[j] + 
    // ..... arr[n-2] & arr[n-1]" 
    static int pairAndSum(int arr[], int n) 
    { 
        int ans = 0; // Initialize result 
      
        // Traverse over all bits 
        for (int i = 0; i < 32; i++) 
        { 
            // Count number of elements with i'th bit set 
            // Initialize the count 
            int k = 0; 
            for (int j = 0; j < n; j++) 
            { 
                if ((arr[j] & (1 << i))!=0) 
                    k++; 
            } 
      
            // There are k set bits, means k(k-1)/2 pairs. 
            // Every pair adds 2^i to the answer. Therefore, 
            // we add "2^i * [k*(k-1)/2]" to the answer. 
            ans += (1 << i) * (k * (k - 1)/2); 
        } 
        return ans; 
    } 
  
    // Driver program to test above function 
    public static void main(String args[]) 
    { 
        int arr[] = {5, 10, 15}; 
        int n = arr.length; 
        System.out.println(pairAndSum(arr, n)); 
    } 
} 
  
/*This code is contributed by Nikita Tiwari.*/

