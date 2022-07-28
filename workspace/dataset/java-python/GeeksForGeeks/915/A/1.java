

// Java program to find last five digits 
// of a five digit number raised to power five 
  
class GfG { 
  
    // Function to find the last five digits 
    // of a five digit number raised to power five 
    static void lastFiveDigits(int n) 
    { 
        n = (n / 10000) * 10000
            + ((n / 100) % 10) 
                  * 1000
            + (n % 10) 
                  * 100
            + ((n / 10) % 10) 
                  * 10
            + (n / 1000) % 10; 
  
        int ans = 1; 
        for (int i = 0; i < 5; i++) { 
            ans *= n; 
            ans %= 100000; 
        } 
  
        System.out.println(ans); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 12345; 
  
        lastFiveDigits(n); 
    } 
} 

