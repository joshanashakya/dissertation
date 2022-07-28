

// Java program to find the XOR  
// and OR of all Armstrong numbers  
// of N digits  
class GFG  
{ 
      
    // Function to check if a number 
    // is Armstrong or not 
    static boolean isArmstrong(int x, int n) { 
        int sum1 = 0; 
        int temp = x; 
        while (temp > 0) { 
            int digit = temp % 10; 
            sum1 += Math.pow(digit, n); 
            temp /= 10; 
        } 
        return sum1 == x; 
    } 
  
    // Function to find XOR of all 
    // N-digits Armstrong number 
    static void CalculateXORandOR(int n) { 
  
        // To store the XOR and OR of all 
        // Armstrong number 
        int CalculateXOR = 0; 
        int CalculateOR = 0; 
  
        // Starting N-digit 
        // Armstrong number 
        int start = (int) Math.pow(10, n - 1); 
  
        // Ending N-digit 
        // Armstrong number 
        int end = (int) (Math.pow(10, n)) - 1; 
          
        // Iterate over starting and 
        // ending number 
        for (int i = start; i < end + 1; i++) { 
  
            // To check if i is 
            // Armstrong or not 
            if (isArmstrong(i, n)) { 
                CalculateXOR = CalculateXOR ^ i; 
                CalculateOR = CalculateOR | i; 
            } 
        } 
          
        // Print the XOR and OR of all 
        // Armstrong number 
        System.out.println("XOR = " + CalculateXOR); 
        System.out.println("OR = " + CalculateOR); 
    } 
  
    // Driver Code 
    public static void main(String[] args) { 
  
        int n = 4; 
        CalculateXORandOR(n); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

