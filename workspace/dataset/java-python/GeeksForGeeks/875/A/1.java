

// Java program to print any pair  
// with a given gcd G and lcm L  
  
import java.math.BigInteger; 
  
class GFG { 
  
// Function to print the pairs  
    static void printPair(int g, int l) { 
        int n = g * l; 
  
        // iterate over all factor pairs  
        for (int i = 1; i * i <= n; i++) { 
  
            // check if a factor  
            if (n % i == 0) { 
                int first = i; 
                int second = n / i; 
  
                // find gcd  
                int gcd = __gcd(first, second); 
  
                // check if gcd is same as given g  
                // and lcm is same as lcm l  
                if (gcd == g && l % first == 0 && l % second == 0) { 
                    System.out.println(first + " " + second); 
                    return; 
                } 
            } 
        } 
    } 
//Function return GCD of two give number 
  
    private static int __gcd(int a, int b) { 
        // there's a better way to do this. I forget. 
        BigInteger b1 = new BigInteger("" + a); 
        BigInteger b2 = new BigInteger("" + b); 
        BigInteger gcd = b1.gcd(b2); 
        return gcd.intValue(); 
    } 
// Driver function  
  
    public static void main(String[] args) { 
        int g = 3, l = 12; 
        printPair(g, l); 
  
    } 
} 
// This code is contributed by RAJPUT-JI 

