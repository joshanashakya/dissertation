

// Java code to find last k digits of a^b 
  
public class GFG  
{ 
    /* Iterative Function to calculate (x^y)%p in O(log y) */
    static int power(long x, long y, long p) 
    { 
        long res = 1; // Initialize result 
       
        x = x % p; // Update x if it is more than or 
        // equal to p 
       
        while (y > 0) { 
       
            // If y is odd, multiply x with result 
            if ((y & 1) != 0) 
                res = (res * x) % p; 
       
            // y must be even now 
            y = y >> 1; // y = y/2 
            x = (x * x) % p; 
        } 
        return (int) res; 
    } 
       
    // Method  to print last k digits of a^b 
    static void printLastKDigits(int a, int b, int k) 
    { 
        System.out.print("Last " + k + " digits of " + a + 
                            "^"  +  b + " = "); 
           
        // Generating 10^k 
        int temp = 1; 
        for (int i = 1; i <= k; i++) 
            temp *= 10; 
       
        // Calling modular exponentiation 
        temp = power(a, b, temp); 
       
        // Printing leftmost zeros. Since (a^b)%k  
        // can have digits less then k. In that 
        // case we need to print zeros 
        for (int i = 0; i < k - Integer.toString(temp).length() ; i++) 
            System.out.print(0); 
       
        // If temp is not zero then print temp 
        // If temp is zero then already printed 
        if (temp != 0) 
            System.out.print(temp); 
    } 
      
    // Driver Method 
    public static void main(String[] args) 
    { 
        int a = 11; 
        int b = 3; 
        int k = 2; 
        printLastKDigits(a, b, k); 
    } 
} 

