

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
  
    // Function to count the total bits 
    static int countBits(int n)  
    { 
        int count = 0; 
  
        // Iterate and find the 
        // number of set bits 
        while (n > 0) 
        { 
            count++; 
  
            // Right shift the number by 1 
            n >>= 1; 
        } 
        return count; 
    } 
  
    // Function to find the nearest number 
    static int findNearestNumber(int n)  
    { 
  
        // Count the total number of bits 
        int cnt = countBits(n); 
  
        // To get the position 
        cnt -= 1; 
  
        // If the last set bit is 
        // at odd position then 
        // answer will always be a number 
        // with the left bit set 
        if (cnt % 2 == 1)  
        { 
            return 1 << (cnt + 1); 
        }  
        else 
        { 
  
            int tempnum = 0; 
  
            // Set all the even bits which 
            // are possible 
            for (int i = 0; i <= cnt; i += 2)  
            { 
                tempnum += 1 << i; 
            } 
  
            // If the number still is less than N 
            if (tempnum < n)  
            { 
  
                // Return the number by setting the 
                // next even set bit 
                return (1 << (cnt + 2)); 
            }  
            else
            if (tempnum == n) 
            { 
                return n; 
            } 
  
            // If we have reached this position 
            // it means tempsum > n 
            // hence turn off even bits to get the 
            // first possible number 
            for (int i = 0; i <= cnt; i += 2) 
            { 
  
                // Turn off the bit 
                tempnum -= (1 << i); 
  
                // If it gets lower than N 
                // then set it and return that number 
                if (tempnum < n)  
                { 
                    return tempnum += (1 << i); 
                } 
            } 
        } 
        return Integer.MIN_VALUE; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int n = 19; 
  
        System.out.println(findNearestNumber(n)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

