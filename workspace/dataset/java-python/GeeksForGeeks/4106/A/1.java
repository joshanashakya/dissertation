

// Java implementation of the approach 
import java.util.*; 
  
class GFG { 
  
    // Function to return the value of (str % k) 
    static int getMod(String str, int n, int k) 
    { 
  
        // pwrTwo[i] will store ((2^i) % k) 
        int pwrTwo[] = new int[n]; 
        pwrTwo[0] = 1 % k; 
        for (int i = 1; i < n; i++) { 
            pwrTwo[i] = pwrTwo[i - 1] * (2 % k); 
            pwrTwo[i] %= k; 
        } 
  
        // To store the result 
        int res = 0; 
        int i = 0, j = n - 1; 
        while (i < n) { 
  
            // If current bit is 1 
            if (str.charAt(j) == '1') { 
  
                // Add the current power of 2 
                res += (pwrTwo[i]); 
                res %= k; 
            } 
            i++; 
            j--; 
        } 
  
        return res; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String str = "1101"; 
        int n = str.length(); 
        int k = 45; 
  
        System.out.print(getMod(str, n, k)); 
    } 
} 

