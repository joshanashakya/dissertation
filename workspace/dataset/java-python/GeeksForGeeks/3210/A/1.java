

// Java program to compute value  
// of GCD(LCM(x,y), LCM(x,z)) 
  
class GFG 
{ 
    // Recursive function to  
    // return gcd of a and b 
    static int __gcd(int a, int b) 
    { 
        // Everything divides 0  
        if (a == 0 || b == 0) 
        return 0; 
      
        // base case 
        if (a == b) 
            return a; 
      
        // a is greater 
        if (a > b) 
            return __gcd(a - b, b); 
        return __gcd(a, b - a); 
    }  
      
    // Returns value of GCD(LCM(x,y), LCM(x,z)) 
    static int findValue(int x, int y, int z) 
    { 
        int g = __gcd(y, z); 
      
        // Return LCM(x, GCD(y, z)) 
        return (x*g) / __gcd(x, g); 
    } 
      
    // Driver code 
    public static void main (String[] args) 
    { 
        int x = 30, y = 40, z = 400; 
        System.out.print(findValue(x, y, z)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

