

// Java program to count total divisors of 'a' 
// or 'b' in a given range 
  
import java.math.BigInteger; 
  
class Test 
{ 
    // Utility method to find LCM of two numbers 
    static int FindLCM(int a, int b) 
    { 
        return (a * b) / new BigInteger(a+"").gcd(new BigInteger(b+"")).intValue(); 
    } 
      
    // method to calculate all divisors in given range 
    static int rangeDivisor(int m, int n, int a, int b) 
    { 
        // Find LCM of a and b 
        int lcm = FindLCM(a, b); 
       
        int a_divisor = n / a - (m - 1) / a; 
        int b_divisor = n / b - (m - 1) / b; 
       
        // Find common divisor by using LCM 
        int common_divisor = n / lcm - (m - 1) / lcm; 
       
        int ans = a_divisor + b_divisor - common_divisor; 
        return ans; 
    } 
      
    // Driver method 
    public static void main(String args[]) 
    { 
        int m = 3, n = 11, a = 2, b = 3; 
        System.out.println(rangeDivisor(m, n, a, b)); 
       
        m = 11; n = 1000000 ; a = 6; b = 35; 
        System.out.println(rangeDivisor(m, n, a, b)); 
    } 
} 

