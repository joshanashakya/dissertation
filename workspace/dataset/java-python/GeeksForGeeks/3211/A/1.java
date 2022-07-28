

// Java program to print Greatest Common Divisor 
// of number formed by N repeating x times and 
// y times 
class GFG { 
      
    // Return the Greatest common Divisor 
    // of two numbers. 
    static int gcd(int a, int b) { 
          
        if (a == 0) 
            return b; 
              
        return gcd(b % a, a); 
    } 
      
    // Prints Greatest Common Divisor of  
    // number formed by n repeating x 
    // times and y times. 
    static void findgcd(int n, int x, int y) { 
          
        // Finding GCD of x and y. 
        int g = gcd(x, y); 
      
        // Print n, g times. 
        for (int i = 0; i < g; i++) 
            System.out.print(n); 
    } 
      
    // Driver code 
    public static void main(String[] args) { 
          
        int n = 123, x = 5, y = 2; 
        findgcd(n, x, y); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

