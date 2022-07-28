

// Java implementation of above approach 
  
class GFG { 
  
    // Function to calculate GCD 
  
    static int gcd(int a, int b) 
    { 
        if (b == 0) 
            return a; 
        return gcd(b, a % b); 
    } 
  
    // Function to count total numbers divisible by 
    // x but not y in range 1 to N 
  
    static int countNumbers(int X, int Y, int N) 
    { 
  
        // Count total number divisible by X 
        int divisibleByX = N / X; 
  
        // Count total number divisible by Y 
        int divisibleByY = N / Y; 
  
        // Count total number divisible by either X or Y 
        int LCM = (X * Y) / gcd(X, Y); 
        int divisibleByLCM = N / LCM; 
        int divisibleByXorY = divisibleByX + divisibleByY 
                              - divisibleByLCM; 
  
        // Count total number divisible by X but not Y 
        int divisibleByXnotY = divisibleByXorY  
                                          - divisibleByY; 
  
        return divisibleByXnotY; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
  
        int X = 2, Y = 3, N = 10; 
        System.out.println(countNumbers(X, Y, N)); 
    } 
} 

