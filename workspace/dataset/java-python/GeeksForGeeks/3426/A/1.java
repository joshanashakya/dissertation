

// Java program to find the minimum number 
// of coins required 
  
class GFG { 
  
    // Function to find the minimum number 
    // of coins required 
    static int countCoins(int n) 
    { 
        int c = 0; 
        if (n < 10) { 
            // counts coins which have value 1 
            // we will need n coins of value 1 
            return n; 
        } 
        if (n > 9 && n < 25) { 
  
            // counts coins which have value 1 and 10 
            c = n / 10 + n % 10; 
  
            return c; 
        } 
        if (n > 24) { 
            // counts coins which have value 25 
            c = n / 25; 
  
            if (n % 25 < 10) { 
                // counts coins which have value 1 and 25 
                c = c + n % 25; 
  
                return c; 
            } 
            if (n % 25 > 9) { 
                // counts coins which have value 1, 10 and 25 
                c = c + (n % 25) / 10 + (n % 25) % 10; 
  
                return c; 
            } 
        } 
  
        return c; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 14; 
        System.out.println(countCoins(n)); 
    } 
} 

