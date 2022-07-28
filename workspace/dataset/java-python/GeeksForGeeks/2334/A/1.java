

// Java program to find smallest n digit number 
// which is divisible by x, y and z. 
import java.io.*; 
  
public class GFG { 
  
    static int __gcd(int a, int b) 
    { 
  
        if (b == 0) { 
            return a; 
        } 
        else { 
            return __gcd(b, a % b); 
        } 
    } 
  
    // LCM for x, y, z 
    static int LCM(int x, int y, int z) 
    { 
        int ans = ((x * y) / (__gcd(x, y))); 
        return ((z * ans) / (__gcd(ans, z))); 
    } 
  
    // returns smallest n digit number  
    // divisible by x, y and z 
    static int findDivisible(int n, int x,  
                                  int y, int z) 
    { 
          
        // find the LCM 
        int lcm = LCM(x, y, z); 
  
        // find power of 10 for least number 
        int ndigitnumber = (int)Math.pow(10, n - 1); 
  
        // reminder after 
        int reminder = ndigitnumber % lcm; 
  
        // If smallest number itself divides 
        // lcm. 
        if (reminder == 0) 
            return ndigitnumber; 
  
        // add lcm- reminder number for 
        // next n digit number 
        ndigitnumber += lcm - reminder; 
  
        // this condition check the n digit 
        // number is possible or not 
        // if it is possible it return 
        // the number else return 0 
        if (ndigitnumber < Math.pow(10, n)) 
            return ndigitnumber; 
        else
            return 0; 
    } 
  
    // driver code 
    static public void main(String[] args) 
    { 
  
        int n = 4, x = 2, y = 3, z = 5; 
        int res = findDivisible(n, x, y, z); 
  
        // if number is possible then 
        // it print the number 
        if (res != 0) 
            System.out.println(res); 
        else
            System.out.println("Not possible"); 
    } 
} 
  
// This code is contributed by vt_m. 

