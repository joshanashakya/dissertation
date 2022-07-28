

// Java program to count ordered pairs of  
// positive numbers such that their  
// sum is S and XOR is K  
  
class GFG { 
  
// Function to count ordered pairs of  
// positive numbers such that their  
// sum is S and XOR is K  
    static int countPairs(int s, int K) { 
        // Check if no such pair exists  
        if (K > s || (s - K) % 2 ==1) { 
            return 0; 
        } 
  
        if ((s - K) / 2 == 1 & K == 1) { 
            return 0; 
        } 
  
        // Calculate set bits in K  
        int setBits = __builtin_popcount(K); 
  
        // Calculate pairs  
        int pairsCount = (int) Math.pow(2, setBits); 
  
        // If s = k, subtract 2 from result  
        if (s == K) { 
            pairsCount -= 2; 
        } 
  
        return pairsCount; 
    } 
  
    static int __builtin_popcount(int n) { 
        /* Function to get no of set   
    bits in binary representation   
    of positive integer n */
  
        int count = 0; 
        while (n > 0) { 
            count += n & 1; 
            n >>= 1; 
        } 
        return count; 
    } 
  
// Driver program to test above function  
    public static void main(String[] args) { 
        int s = 9, K = 5; 
        System.out.println(countPairs(s, K)); 
  
    } 
  
} 

