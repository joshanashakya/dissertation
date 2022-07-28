

// Java implementation of the approach  
import java.util.*;  
  
class gfg 
{ 
      
    // Function to return the number of subarrays  
    // of the given array such that the remainder  
    // when dividing the sum of its elements  
    // by K is equal to the number of its elements  
    static int sub_arrays(int []a, int n, int k)  
    {  
      
        // To store prefix sum  
        int sum[] = new int[n + 2] ;  
          
        for (int i = 0; i < n+2; i++) 
        {  
            sum[i] = 0; 
        } 
          
        for (int i = 0; i < n; i++)  
        {  
      
            // We are dealing with zero  
            // indexed array  
            a[i]--;  
      
            // Taking modulus value  
            a[i] %= k;  
      
            // Prefix sum  
            sum[i + 1] += sum[i] + a[i];  
            sum[i + 1] %= k;  
        }  
      
        // To store the required answer, the left  
        // index and the right index  
        int ans = 0, l = 0, r = 0;  
      
        // To store si - i value  
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();  
      
        for (int i = 0; i < n + 1; i++) 
        {  
            mp.put(sum[i], 0); 
        } 
        int temp; 
          
        for (int i = 0; i < n + 1; i++)  
        {  
      
            // Include sum  
            ans += (int)mp.get(sum[i]);  
            temp =(int)mp.get(sum[i]) + 1; 
            mp.put(sum[i], temp);  
      
            // Increment the right index  
            r++;  
      
            // If subarray has at least  
            // k elements  
            if (r - l >= k) 
            {  
                //mp[sum[l]]--;  
                temp = (int)mp.get(sum[l]) - 1; 
                mp.put(sum[l], temp); 
                l++;  
            }  
        }  
      
        // Return the required answer  
        return ans;  
    }  
      
    // Driver code  
    public static void main(String args[])  
    {  
        int []a = { 1, 4, 2, 3, 5 };  
          
        int n = a.length;  
      
        int k = 4;  
      
        // Function call  
        System.out.print(sub_arrays(a, n, k));  
      
    }  
} 
  
// This code is contributed by AnkitRai01 

