

// Java program to find maximum number of 0's 
// in binary representation of a number 
class GFG { 
  
    // Returns maximum 0's between two immediate 
    // 1's in binary representation of number 
    static int maxZeros(int n) { 
        // If there are no 1's or there is only 
        // 1, then return -1 
        if (n == 0 || (n & (n - 1)) == 0) { 
            return -1; 
        } 
        //int size in java is 4 byte 
        byte b = 4; 
        // loop to find position of right most 1 
        // here sizeof int is 4 that means total 32 bits 
        int setBit = 1, prev = 0, i; 
        for (i = 1; i <= b* 8; i++) { 
            prev++; 
  
            // we have found right most 1 
            if ((n & setBit) == setBit) { 
                setBit = setBit << 1; 
                break; 
            } 
  
            // left shift setBit by 1 to check next bit 
            setBit = setBit << 1; 
        } 
  
        // now loop through for remaining bits and find 
        // position of immediate 1 after prev 
        int max0 = Integer.MIN_VALUE, cur = prev; 
        for (int j = i + 1; j <= b * 8; j++) { 
            cur++; 
  
            // if cuurent bit is set, then compare 
            // difference of cur - prev -1 with 
            // previous maximum number of zeros 
            if ((n & setBit) == setBit) { 
                if (max0 < (cur - prev - 1)) { 
                    max0 = cur - prev - 1; 
                } 
  
                // update prev 
                prev = cur; 
            } 
            setBit = setBit << 1; 
        } 
        return max0; 
    } 
  
    // Driver program to run the case 
    static public void main(String[] args) { 
        int n = 549; 
  
        // Initially check that number must not 
        // be 0 and power of 2 
        System.out.println(maxZeros(n)); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

