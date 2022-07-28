

// Java program to remove minimum elements to 
// make the given array good 
import java.util.Collections; 
import java.util.Vector; 
  
class GFG 
{ 
    // Function to remove minimum elements to 
    // make the given array good 
    static int MinRemove(int[] a, int n, int k) 
    { 
        // To store count of each subsequence 
        int []cnt = new int[n]; 
        for (int i = 0; i < n; i++)  
        { 
            // Increase the count of subsequence [0] 
            if (a[i] == 0) 
                cnt[0]++; 
  
            // If Previous element subsequence count 
            // is greater than zero then increment 
            // subsequence count of current element 
            // and increment subsequence count of 
            // the previous element. 
            else if (cnt[a[i] - 1] > 0) 
            { 
                cnt[a[i] - 1]--; 
                cnt[a[i]]++; 
            } 
        } 
  
        // Return the required answer 
        return n - (k * cnt[k - 1]); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
  
        int a[] = { 0, 1, 2, 3, 4, 0, 
                    1, 0, 1, 2, 3, 4 }; 
        int k = 5; 
  
        int n = a.length; 
  
        // Function call 
        System.out.println(MinRemove(a, n, k)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

