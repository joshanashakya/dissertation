

// Java program to find the smallest values of 
// x and y that satisfy "ax - by = 0" 
class GFG { 
  
    // To find GCD using Eculcid's algorithm 
    static int gcd(int a, int b) 
    { 
  
        if (b == 0) 
            return a; 
        return (gcd(b, a % b)); 
    } 
  
    // Prints smallest values of x and y that 
    // satisfy "ax - by = 0" 
    static void findSmallest(int a, int b) 
    { 
  
        // Find LCM 
        int lcm = (a * b) / gcd(a, b); 
  
        System.out.print("x = " + lcm / a 
                         + "\ny = " + lcm / b); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int a = 25, b = 35; 
        findSmallest(a, b); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

