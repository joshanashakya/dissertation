

// Java program to check for Proth number 
  
class GFG { 
  
    // Utility function to check power of two 
    static boolean isPowerOfTwo(int n) 
    { 
        return n != 0 && ((n & (n - 1)) == 0); 
    } 
  
    // Function to check if the 
    // Given number is Proth number or not 
    static boolean isProthNumber(int n) 
    { 
  
        int k = 1; 
        while (k < (n / k)) { 
  
            // check if k divides n or not 
            if (n % k == 0) { 
  
                // Check if n/k is power of 2 or not 
                if (isPowerOfTwo(n / k)) 
                    return true; 
            } 
  
            // update k to next odd number 
            k = k + 2; 
        } 
  
        // If we reach here means 
        // there exists no value of K 
        // Such that k is odd number 
        // and n/k is a power of 2 greater than k 
        return false; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
  
        // Get n 
        int n = 25; 
  
        // Check n for Proth Number 
        if (isProthNumber(n - 1)) 
            System.out.println("YES"); 
        else
            System.out.println("NO"); 
    } 
} 

