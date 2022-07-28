

// Java program for Minimum splits  
// in a string such that substring  
// is a power of 4 or 6. 
import java.io.*; 
  
class GFG  
{ 
    static boolean isPowerOf(long val,  
                             int base) 
{ 
  
    // Divide given number  
    // repeatedly by base value.  
    while (val > 1)  
    { 
        if (val % base != 0) 
            return false; // not a power  
        val /= base; 
    } 
  
    return true; 
} 
  
// Function to find minimum  
// number of partitions of  
// given binary string so that 
// each partition is power  
// of 4 or 6.  
static int numberOfPartitions(String binaryNo) 
{ 
    int i, j, n = binaryNo.length(); 
  
    // Variable to store integer 
    // value of given binary  
    // string partition. 
    long val; 
  
    // DP table to store results  
    // of partitioning done at  
    // differentindices. 
    int dp[] = new int[n]; 
  
    // If the last digit is 1,  
    // hence 4^0=1 and 6^0=1 
    dp[n - 1] = (((binaryNo.charAt(n - 1) -  
                               '0') == 0) ?  
                                   -1 : 1); 
  
    // Fix starting position 
    // for partition 
    for (i = n - 2; i >= 0; i--)  
    { 
        val = 0; 
  
        // Binary representation 
        // with leading zeroes  
        // is not allowed.  
        if ((binaryNo.charAt(i) - '0') == 0)  
        { 
            dp[i] = -1; 
            continue; 
        } 
  
        dp[i] = Integer.MAX_VALUE; 
  
        // Iterate for all different 
        // partitions starting from i 
        for (j = i; j < n; j++)  
        { 
  
            // Find integer value of  
            // current binary partition. 
            val = (val * 2) +  
                  (long)(binaryNo.charAt(j) - '0'); 
  
            // Check if the value is a  
            // power of 4 or 6 or not 
            // apply recurrence relation 
            if (isPowerOf(val, 4) ||  
                isPowerOf(val, 6)) 
            { 
                if (j == n - 1) 
                { 
                    dp[i] = 1; 
                } 
                else 
                { 
                    if (dp[j + 1] != -1) 
                        dp[i] = Math.min(dp[i],  
                                         dp[j + 1] + 1); 
                } 
            } 
        } 
  
        // If no partitions are possible,  
        // then make dp[i] = -1 to  
        // represent this. 
        if (dp[i] == Integer.MAX_VALUE) 
            dp[i] = -1; 
    } 
  
    return dp[0]; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    String binaryNo = "100110110"; 
    System.out.println(numberOfPartitions(binaryNo)); 
} 
} 
  
// This code is contributed 
// by shiv_bhakt. 

