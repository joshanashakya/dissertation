

// Java implementation of the approach 
import java.util.*; 
  
class GFG { 
  
    // Function that print the 
    // desired array which 
    // satisfies the given conditions 
    static void solve(int n, int k) 
    { 
  
        int mini = 0; 
        int x1 = 1; 
        int[] a = new int[k]; 
        for (int i = 1; i <= k; i++) { 
            mini += x1; 
            a[i - 1] = x1; 
            x1 += 1; 
        } 
  
        // If the lowest filling condition 
        // is void, then it is not possible to 
        // generate the required array 
        if (n < mini) { 
            System.out.print("-1"); 
            return; 
        } 
  
        int rem = n - mini; 
        int cnt = rem / k; 
        rem = rem % k; 
  
        // Increase all the elements by cnt 
        for (int i = 0; i < k; i++) 
            a[i] += cnt; 
  
        // Start filling from the back 
        // till the number is a[i+1] <= 2*a[i] 
        for (int i = k - 1; i > 0 && rem > 0; i--) { 
  
            // Get the number to be filled 
            int xx = a[i - 1] * 2; 
            int left = xx - a[i]; 
  
            // If it is less than the 
            // remaining numbers to be filled 
            if (rem >= left) { 
                a[i] = xx; 
                rem -= left; 
            } 
  
            // less than remaining numbers 
            // to be filled 
            else { 
                a[i] += rem; 
                rem = 0; 
            } 
        } 
  
        // Get the sum of the array 
        int sum = a[0]; 
        for (int i = 1; i < k; i++) { 
  
            // If this condition is void at any stage 
            // during filling up, then print -1 
            if (a[i] > 2 * a[i - 1]) { 
                System.out.print("-1"); 
                return; 
            } 
  
            // Else add it to the sum 
            sum += a[i]; 
        } 
  
        // If the sum condition is not 
        // satisified, then print -1 
        if (sum != n) { 
            System.out.print("-1"); 
            return; 
        } 
  
        // Print the generated array 
        for (int i = 0; i < k; i++) 
            System.out.print(a[i] + " "); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 26, k = 6; 
        solve(n, k); 
    } 
} 
  
// This code contributed by Rajput-Ji 

