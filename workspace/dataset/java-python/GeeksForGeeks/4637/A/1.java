

// Java implementation of the approach 
import java.util.*; 
  
class GFG 
{ 
static long mod = 1000000007; 
  
// Value of inverse modulo 
// 2 with 10^9 + 7 
static long inv2 = 500000004; 
  
// Function to return num % 1000000007 
// where num is a large number 
static long modulo(String num) 
{ 
    // Initialize result 
    long res = 0; 
  
    // One by one process all the 
    // digits of string 'num' 
    for (int i = 0; 
             i < num.length(); i++) 
        res = (res * 10 +  
              (long)num.charAt(i) - '0') % mod; 
    return res; 
} 
  
// Function to return the sum of the 
// longegers from the given range 
// modulo 1000000007 
static long findSum(String L, String R) 
{ 
    long a, b, l, r, ret; 
  
    // a stores the value of 
    // L modulo 10^9 + 7 
    a = modulo(L); 
  
    // b stores the value of 
    // R modulo 10^9 + 7 
    b = modulo(R); 
  
    // l stores the sum of natural 
    // numbers from 1 to (a - 1) 
    l = ((a * (a - 1)) % mod * inv2) % mod; 
  
    // r stores the sum of natural 
    // numbers from 1 to b 
    r = ((b * (b + 1)) % mod * inv2) % mod; 
  
    ret = (r % mod - l % mod); 
  
    // If the result is negative 
    if (ret < 0) 
        ret = ret + mod; 
    else
        ret = ret % mod; 
    return ret; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String L = "88949273204"; 
    String R = "98429729474298592"; 
  
    System.out.println(findSum(L, R)); 
} 
}  
  
// This code is contributed by 29AjayKumar 

