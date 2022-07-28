

// Java program to find largest n digit number 
// which is divisible by x, y and z. 
import java.math.*; 
class GFG { 
      
// Recursive function to return gcd of a and b  
    static int gcd(int a, int b)  
    {  
        // Everything divides 0   
        if (a == 0)  
          return b;  
        if (b == 0)  
          return a;  
         
        // base case  
        if (a == b)  
            return a;  
         
        // a is greater  
        if (a > b)  
            return gcd(a-b, b);  
        return gcd(a, b-a);  
    }  
      
// Function to return the LCM of three numbers 
static int LCM(int x, int y, int z) 
{ 
    int ans = ((x * y) / (gcd(x, y))); 
    return ((z * ans) / (gcd(ans, z))); 
} 
  
// Function to return the largest n-digit 
// number which is divisible by x, y and z 
static int findDivisible(int n, int x, int y, int z) 
{ 
  
    // find the LCM 
    int lcm = LCM(x, y, z); 
  
    // find largest n-digit number 
    int largestNDigitNum = (int)Math.pow(10, n) - 1; 
  
    int remainder = largestNDigitNum % lcm; 
  
    // If largest number is the answer 
    if (remainder == 0) 
        return largestNDigitNum ; 
  
    // find closest smaller number 
    // divisible by LCM 
    largestNDigitNum -= remainder; 
  
    // if result is an n-digit number 
    if (largestNDigitNum >= (int)Math.pow(10, n - 1)) 
        return largestNDigitNum; 
    else
        return 0; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    int n = 2, x = 3, y = 4, z = 6; 
    int res = findDivisible(n, x, y, z); 
  
    // if the number is found 
    if (res != 0) 
        System.out.println(res); 
    else
        System.out.println("Not possible"); 
  
} 
} 

